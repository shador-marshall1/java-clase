package ejercicios;
import java.io.*;
import java.util.Date;
public class Ej9 {

	public static void main(String arg[]) {
		String directorio;
		if (arg.length > 0)
			directorio=arg[0];
		else
			directorio=".";
		File actual = new File(directorio);
		System.out.println("El directorio es: ");
		try {
			System.out.println(actual.getCanonicalPath());
		} catch (IOException e) {
		}
		System.out.println("Su contenido es: ");
		File[] archivos = actual.listFiles();
		for (File archivo : archivos) {
			if(archivo.isDirectory()){
				System.out.println("Nombre "+ archivo.getName());
				
			}
			if (archivo.isFile()) {
				System.out.println("Nombre: "+ archivo.getName());
			}
			System.out.println();
		}

	}

}
