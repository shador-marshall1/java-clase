package Ej1Sesion3;

import java.sql.*;
import java.text.SimpleDateFormat;

public class MainPrueba {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

	}		AccesoBDatos adb = new AccesoBDatos();
		adb.conectar();
		System.out.println(adb.busquedaporOficio("CLERK"));
		System.out.println(adb.BuscarPorCodigo(7788));
	java.util.Date fecha = null;
	java.sql.Date sqlFecha = null;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			fecha = sdf.parse("1981/02/22");
			sqlFecha = new java.sql.Date(fecha.getTime()); }
		catch (ParseException e){
			System.out.println("Error al convertir fecha"); }
		System.out.println(adb.busquedaporFecha(sqlFecha));
		System.out.println("Introducción de persona");
	java.util.Date fecha1 = null;
	java.sql.Date sqlFecha1 = null;
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		try { fecha1 = sdf1.parse("2020/03/18");
		sqlFecha1 = new java.sql.Date(fecha1.getTime()); }
		catch (ParseException e)
	{ System.out.println("Error al convertir fecha"); }
	Empleado e1 = new Empleado(1, "CARRERA", "PROFESOR", 7788, sqlFecha1, 700.0, 0.0, 20);
		System.out.println(adb.insertarconBean(e1));
		adb.desconectar();


}
