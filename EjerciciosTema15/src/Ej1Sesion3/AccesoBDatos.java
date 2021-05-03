package Ej1Sesion3;

import java.sql.*;
import java.util.ArrayList;

public class AccesoBDatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "demodb";
    private static String hostname = "localhost";
    private static String port = "3306";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database +
									"?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "root";
    private Connection conecta;
	
	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}
	
	public void desconectar() throws SQLException, ClassNotFoundException {
		
		conecta = null; // = conecta.close();
	}
	public Empleado BuscarPorCodigo (int numero) throws SQLException {
		PreparedStatement ps = conecta.prepareStatement("select * from emp where EMPNO =?");
		ps.setInt(1, numero);
		ResultSet rst = ps.executeQuery();
		return (Empleado) rst;
	}
	public ArrayList<Empleado> busquedaporOficio (String oficio) {
		ArrayList<Empleado>list = new ArrayList<Empleado>();
		try {
			PreparedStatement ps1=conecta.prepareStatement("SELECT * from emp where JOB=?");
			ps1.setString(1, oficio);
			ResultSet rst1 = ps1.executeQuery();
			Empleado emp1 = new Empleado();
			while (rst1.next()) {
				list.add(new Empleado(rst1.getInt(1), rst1.getString(2), rst1.getString(3), rst1.getInt(4), 
						rst1.getDate(5), rst1.getDouble(6), rst1.getDouble(7), rst1.getInt(8)));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}
	public ArrayList<Empleado> busquedaporFecha (java.sql.Date fecha) {
		ArrayList<Empleado>list= new ArrayList<Empleado>();
		try {
			PreparedStatement ps = conecta.prepareStatement("Select * from emp where hiredate < ?");
			ps.setDate(1, fecha);
			ResultSet rst1 =ps.executeQuery();
			while (rst1.next()) {
				list.add(new Empleado(rst1.getInt(1), rst1.getString(2), rst1.getString(3), rst1.getInt(4), 
						rst1.getDate(5), rst1.getDouble(6), rst1.getDouble(7), rst1.getInt(8)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}
	
}