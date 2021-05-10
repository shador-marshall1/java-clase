package Sesion4;
import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Type;

public class AccesoBDatos {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "pedidos";
    private static String hostname = "localhost";
    private static String port = "3306";
    private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "root";
    public Connection conecta;

    public void conectar() throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        conecta = DriverManager.getConnection(url, username, password);
    }
    public String numeroPedido () throws SQLException {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el numero de pedido");
        int num = s.nextInt();
        try {
            conectar();
            CallableStatement ps = conecta.prepareCall("select importePedido(?)");
            ps.setInt(1, num);
            ResultSet rst = ps.executeQuery();
            while (rst.next()) {
              String var1 = rst.getString(1);
              System.out.println(var1);
            }
        }  catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return "terminado";
    }//Num Pedido
public void categoriaMinimo () {
        Scanner s = new Scanner(System.in);
    System.out.println("Introduce una categoría: ");
    int Cat = s.nextInt();
    try {
        conectar();
        CallableStatement call = conecta.prepareCall("call productosCategoriaBajoMinimos(?)");
        call.setInt(1, Cat);
        ResultSet rst = call.executeQuery();
        while (rst.next()){
            String nombre = rst.getString(1);
            Double precio = rst.getDouble(2);
            int Unidades1 = rst.getInt(3);
            int uni2 = rst.getInt(4);
            System.out.println(nombre +" "+ precio +" "+ Unidades1 +" "+ uni2);
        }
    }catch (Exception e) {
        e.printStackTrace();
    }
}//CateogriaMinimo
public void cambioPrecio () {
	int cuenta=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Introduce la categoria: ");
	int cat = s.nextInt();
	System.out.println("Introduce el procentaje a subir: ");
	int porc = s.nextInt();
	try {
		conectar();
		CallableStatement cs = conecta.prepareCall("call incrementarPrecioCategoria (?, ?, ?) ");
		cs.setInt(1, cat);
		cs.setInt(2, porc);
		cs.registerOutParameter(3, cuenta);
	    cs.execute();
	    System.out.println("Filas actualizadas: "+ cs.getInt(3));
	    
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
}
