package Ej1;

import java.sql.*;

public class ListaSociosBaloncesto {
	 private static String driver = "com.mysql.cj.jdbc.Driver";
	    private static String database = "baloncesto";
	    private static String hostname = "localhost";
	    private static String port = "3306";
	    private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	    private static String username = "root";
	    private static String password = "root";
	public static void main(String[] args) throws Exception {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement str = conn.createStatement();
		ResultSet rs= str.executeQuery("select SocioID, Nombre, Estatura, Edad, Localidad from socio");
		while (rs.next()) {
			int SocioID = rs.getInt("SocioID");
			String Nombre = rs.getString("Nombre");
			int Estatura = rs.getInt("Estatura");
			int Edad = rs.getInt("Edad");
			String Localidad = rs.getString("Localidad");
			System.out.println(SocioID + "\t" + Nombre + "\t" + Estatura + "\t" + Edad + "\t" + Localidad);
			System.out.println("El total de filas es: "+rs.getRow());
		}

	}

}
