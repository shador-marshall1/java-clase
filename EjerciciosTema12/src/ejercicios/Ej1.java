package ejercicios;

import java.io.*;

public class Ej1 {

	public static void main(String[] args) throws IOException {
		String nombreArchivo = ("ficheros\\Ej1.txt");
		FileReader fr;
		BufferedReader bf;
		String linea;
		fr =new FileReader(nombreArchivo);
		bf = new BufferedReader (fr);
		linea = bf.readLine();
		while (linea !=null) {
			System.out.println(linea);double
			pd = Double.parseDouble(linea);
			linea = bf.readLine();
		}
		
		fr.close();
		bf.close();
}
}