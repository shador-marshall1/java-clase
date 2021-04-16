package Ejercicio1;

import java.io.Serializable;

public class Departamento implements Serializable{
private int NumDepartamento;
private String Nombre;
private String Localidad;
public Departamento() {
	super();
}
public Departamento(int numDepartamento, String nombre, String localidad) {
	super();
	NumDepartamento = numDepartamento;
	Nombre = nombre;
	Localidad = localidad;
}
public int getNumDepartamento() {
	return NumDepartamento;
}
public void setNumDepartamento(int numDepartamento) {
	NumDepartamento = numDepartamento;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getLocalidad() {
	return Localidad;
}
public void setLocalidad(String localidad) {
	Localidad = localidad;
}
@Override
public String toString() {
	return "Departamento [NumDepartamento=" + NumDepartamento + ", Nombre=" + Nombre + ", Localidad=" + Localidad + "]";
}
	

}
