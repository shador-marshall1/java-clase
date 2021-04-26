package Ej1;
import java.sql.*;
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

		public void conectar() throws SQLException, ClassNotFoundException {
			Class.forName(driver);
			conecta = DriverManager.getConnection(url, username, password);
			if (conecta != null) {
				System.out.println("Conexión correcta");
			}
		}
		public void consultaPorLocalidad (String localidad) {
			try {
				Statement consulta = conecta.createStatement();
				if(localidad!=null) {
				ResultSet rst = consulta.executeQuery("SELECT NOMBRE, LOCALIDAD FROM SOCIO WHERE LOCALIDAD LIKE'%"+localidad+"%'");
				while (rst.next()) {
					String Nombre = rst.getString("Nombre");
					String Localidad = rst.getString("localidad");
					System.out.println(Localidad +"\t" +Nombre);
					
					}
				if (rst.last()==true) {
					System.out.println("Total de socios con esa localidad: "+rst.getRow());
				}
				}
				else if (localidad==null) {
					ResultSet rst1= consulta.executeQuery("select LOCALIDAD from SOCIO");
					while (rst1.next()) {
						String Nombre1 = rst1.getString("Nombre");
						String Localidad1 = rst1.getString("Localidad");
						System.out.println(Localidad1);
						System.out.println("Socios con localidad; "+Localidad1+ "\t" +Nombre1);
						
						}
					if (rst1.last()==true) {
						System.out.println("Socios totales: "+rst1.getRow());
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public ResultSet resultSetPrueba () throws SQLException {
			Statement consulta1 = conecta.createStatement();
			ResultSet prueba1 = consulta1.executeQuery("Select * from socio");
			this.rst2 = prueba1;
			return rst2;
		}
		
		public void imprimirDatos (ResultSet r) throws SQLException {
			ResultSet consulta1 = r;
			while (r.next()) {
				int SocioID = consulta1.getInt(1);
				String Nombre = consulta1.getString(2);
				int Estatura = consulta1.getInt(3);
				int Edad = consulta1.getInt(4);
				String Localidad = consulta1.getString(5);
				System.out.println(SocioID +"\t"+Nombre + "\t" + Estatura+ "\t" +Edad+ "\t" +Localidad);
			}
			if (r.last()==true) {
				System.out.println("Total de filas: "+r.getRow());
			}
			
		}
		public void desconectar() throws SQLException {
			if (conecta !=null) {
				conecta.close();
			}
		}
	public static void main(String[] args) throws Exception, SQLException { 
		AccesoBDatos bd = new AccesoBDatos();
		bd.conectar();
		bd.consultaPorLocalidad("Malaga");
		bd.imprimirDatos(bd.resultSetPrueba());
		

	}

}
