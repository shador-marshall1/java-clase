package ejercicios;
import java.io.*;
import java.util.StringTokenizer;
public class Ej3 {
public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader (args[0]);
		int aux;
		int contador = 0;
		aux = fr.read();
		char Auxconvertido;
			while (aux != -1) {
				Auxconvertido = (char)aux;
				aux = fr.read();
				//System.out.println((char)aux);
				contador++;
				
			}System.out.println("Palabras: " +contador);
			fr.close();
		}
		

}
