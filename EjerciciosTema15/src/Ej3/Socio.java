package Ej3;

public class Socio {
int socioID;
String Nombre;
int Estatura;
int Edad;
String localidad;
public Socio(int socioID, String nombre, int estatura, int edad, String localidad) {
	super();
	this.socioID = socioID;
	Nombre = nombre;
	Estatura = estatura;
	Edad = edad;
	this.localidad = localidad;
}
public Socio() {
	super();
}
@Override
public String toString() {
	return "Socio [socioID=" + socioID + ", Nombre=" + Nombre + ", Estatura=" + Estatura + ", Edad=" + Edad
			+ ", localidad=" + localidad + "]";
}
public int getSocioID() {
	return socioID;
}
public void setSocioID(int socioID) {
	this.socioID = socioID;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public int getEstatura() {
	return Estatura;
}
public void setEstatura(int estatura) {
	Estatura = estatura;
}
public int getEdad() {
	return Edad;
}
public void setEdad(int edad) {
	Edad = edad;
}
public String getLocalidad() {
	return localidad;
}
public void setLocalidad(String localidad) {
	this.localidad = localidad;
}
}
