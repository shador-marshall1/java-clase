package ejercicios;

import java.io.FileWriter;
import java.io.IOException;

public class Ej5 {

	public static void main(String[] args) {
		FileWriter salida= null;
		if (args.length !=2) {
			System.out.println("No me enviaste argumentos");
			System.exit(-1);
		}
		try {
			salida =new FileWriter (args[1]);
			String cadena = args[0];
			for (int i=cadena.length() -1; i>=0; i--) {
				salida.write(cadena.charAt(i));
				
			}salida.close();
		} catch (IOException e){
			System.out.println("Ocurri� un error");
		}

	}

}
