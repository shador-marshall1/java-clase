package Ej2;

public class Usuarios {
String username;
String password;
String nombre;
public Usuarios(String username, String password, String nombre) {
	super();
	this.username = username;
	this.password = password;
	this.nombre = nombre;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return "Usuarios [username=" + username + ", password=" + password + ", nombre=" + nombre + "]";
}

}
