package Ej1;

public class Socio {
private int SocioID;
private String Nombre;
private int Estatura;
private int Edad;
private String Localidad;
public Socio(int socioID, String nombre, int estatura, int edad, String localidad) {
	super();
	SocioID = socioID;
	Nombre = nombre;
	Estatura = estatura;
	Edad = edad;
	Localidad = localidad;
}
public int getSocioID() {
	return SocioID;
}
public void setSocioID(int socioID) {
	SocioID = socioID;
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
	return Localidad;
}
public void setLocalidad(String localidad) {
	Localidad = localidad;
}
@Override
public String toString() {
	return "Socio [SocioID=" + SocioID + ", Nombre=" + Nombre + ", Estatura=" + Estatura + ", Edad=" + Edad
			+ ", Localidad=" + Localidad + "]";
}

}
