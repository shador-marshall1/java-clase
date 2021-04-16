package Ejercicio1;
import java.io.*;
public class EscribirObj {

	public static void main(String[] args) throws IOException {
		Departamento departamento;
		File fichero = new File("Ficheros//Departamento.dat");
		FileOutputStream fis = new FileOutputStream(fichero);
		ObjectOutputStream oos = new ObjectOutputStream (fis);
		
		int NumDepartamento [] = {1, 2, 3, 4, 5, 6};
		String Nombre[] = {"Ventas", "SAT", "Comercial", "Jefes", "Electronica", "Programacion"};
		String Localidad [] = {"Huesca", "Zaragoza", "Teruel", "Lerida", "Barcelona", "La Rioja"};
		for (int i=0; i<NumDepartamento.length; i++) {
			departamento = new Departamento(NumDepartamento[i], Nombre[i], Localidad[i]);
			oos.writeObject(departamento);
		}
		oos.close();
	}

}
