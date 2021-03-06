package Ej3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBDatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String database = "baloncesto";
    private static String hostname = "localhost";
    private static String port = "3306";
    private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
    private static String username = "root";
    private static String password = "root";
    public Connection conecta;
    public ResultSet rst2;

	public void conectar() throws ClassNotFoundException, SQLException {

			Class.forName(driver);
			conecta = DriverManager.getConnection(url, username, password);
	}
	public ResultSet buscarLocalidad(String localidad) {
		Statement smt;
		try {
			smt = conecta.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
			return (smt.executeQuery(localidad));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	
	}
}
