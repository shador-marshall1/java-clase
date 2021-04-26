package Ej2;

import java.sql.*;

public class conector {
	 private static String driver = "com.mysql.cj.jdbc.Driver";
	    private static String database = "baloncesto";
	    private static String hostname = "localhost";
	    private static String port = "3306";
	    private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	    private static String username = "root";
	    private static String password = "root";
	    public Connection conecta;
	    public ResultSet rst2;

		public void conectar() throws SQLException, ClassNotFoundException {
			Class.forName(driver);
			conecta = DriverManager.getConnection(url, username, password);
		}
		public void Conecta (String Username, String password) {
			try {
				Statement consulta = conecta.createStatement();
				ResultSet rst = consulta.executeQuery("Select username, password from sample where username ="+username+ " and password="+password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
					
		}
}
