package ejercicios;

import java.io.*;
import java.util.Scanner;

public class Ej10 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String Nombre;
	private static String Telefono;
	private static String Direccion;
	private static String Nif;
	private static int Edad;
	private static boolean Moroso;
	
	public Ej10() {
	}

	public Ej10(String nombre, String telefono, String direccion, String nif, int edad) {
		super();
		Nombre = nombre;
		Telefono = telefono;
		Direccion = direccion;
		Nif = nif;
		Edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getNif() {
		return Nif;
	}

	public void setNif(String nif) {
		Nif = nif;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public boolean isMoroso() {
		return Moroso;
	}

	public void setMoroso(boolean moroso) {
		Moroso = moroso;
	}
	
	
	public String toString() {
		return "Ej10 [getNombre()=" + getNombre() + ", getTelefono()=" + getTelefono() + ", getDireccion()="
				+ getDireccion() + ", getNif()=" + getNif() + ", getEdad()=" + getEdad()
				+ "]";
	}

	public static void main(String[] args) {
		FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Ej10 p;
        Scanner sc = new Scanner (System.in);
         try {
        	 fos = new FileOutputStream ("ficheros/ventas.dat");
        	 salida = new ObjectOutputStream (fos);
        	 System.out.println("Introduzca el dato del cliente");
        	 
        	 		System.out.println("Nombre; ");
        	 		Nombre = sc.next();
        	 		System.out.println("Telefono: ");
        	 		Telefono = sc.next();
        	 		System.out.println("Dirección: ");
        	 		Direccion = sc.next();
        	 		System.out.println("NIF: ");
        	 		Nif = sc.next();
        	 		System.out.println("Edad: ");
        	 		Edad = sc.nextInt();
        	 		Ej10 persona1 = new Ej10 (Nombre, Telefono, Direccion, Nif, Edad);
        	 		salida.writeObject(persona1);
        	 		salida.close();
        	 		fos.close();
        	 		sc.close();
        	 		
        	 
         }
         catch (IOException e)  {
        	 System.out.println(e.getMessage());
         }
	}


	
}
