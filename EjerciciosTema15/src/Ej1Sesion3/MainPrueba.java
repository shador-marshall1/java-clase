package Ej1Sesion3;

import java.sql.SQLException;

public class MainPrueba {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBDatos adb = new AccesoBDatos();
		adb.conectar();
		System.out.println(adb.busquedaporOficio("CLERK"));
		adb.desconectar();

	}

}
