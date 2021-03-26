package ejercicios;

import java.io.*;
public class Ej2 {
	private static boolean esVocales (char c) {
		if (c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U' ) {
			return true;
		}else
			return false;
	}
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		int contador = 0;
		if (args.length !=1) {
			System.out.println("No me mandaste argumentos");
			System.exit(-1);
			
		}
		try {

		 fr = new FileReader(args[0]);
		 int aux = fr.read();
		 char auxConvertido;
		 while (aux != -1) {
			 auxConvertido = (char) aux;
			 aux=fr.read();
			 if (esVocales(auxConvertido))
				 contador++;
		 }
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(contador);
		fr.close();
	}
}