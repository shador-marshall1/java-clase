package ejercicios;

import java.io.*;
import java.util.Scanner;

public class Ej10 implements Serializable{
	/**
	 * 
	 */
	private final long serialVersionUID = 1L;
	private String Nombre;
	private String Telefono;
	private String Direccion;
	private String Nif;
	private int Edad;
	private boolean Moroso;
	
	public Ej10() {
	}

	public Ej10(String nombre, String telefono, String direccion, String nif, int edad, Boolean Moroso) {
		super();
		this.Nombre = nombre;
		this.Telefono = telefono;
		this.Direccion = direccion;
		this.Nif = nif;
		this.Edad = edad;
		this.Moroso= Moroso;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(Scanner s) {
		System.out.println("Introduce el nombre: ");
		this.Nombre = s.nextLine();
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(Scanner s) {
		System.out.println("Escriba el teléfono: ");
		this.Telefono = s.nextLine();
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(Scanner s) {
		System.out.println("Escribe la dirección: ");
		this.Direccion = s.nextLine();
	}

	public String getNif() {
		return Nif;
	}

	public void setNif(Scanner s) {
		System.out.println("Escribe el Nif: ");
		this.Nif = s.nextLine();
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(Scanner s) {
		System.out.println("Pon tu edad: ");
		this.Edad = s.nextInt();
	}

	public boolean isMoroso() {
		return Moroso;
	}

	public void setMoroso(Scanner s) {
		System.out.println("Introduce morosidad:");
		String cadena=s.nextLine();
		this.Moroso = Boolean.parseBoolean(cadena);
	}


	public String toString() {
		return "Ej10 [serialVersionUID=" + serialVersionUID + ", Nombre=" + Nombre + ", Telefono=" + Telefono
				+ ", Direccion=" + Direccion + ", Nif=" + Nif + ", Edad=" + Edad + ", Moroso=" + Moroso + "]";
	}
}
