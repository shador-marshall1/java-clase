import java.io.*;
//23 enero 2020 / 22 marzo 2021
//Alberto Carrera Martín
public class _02EjemploLecturaChar {
	public static void main(String[] args) throws IOException{
		int aux ;
		if (args.length==0) {
			System.out.println("No has enviado ningún argumento");
			System.exit(-1);
		}
	    FileReader fr = new FileReader(args[0]);
	    aux = fr.read(); // Se lee el primer dato de la secuencia. 
	    while(aux != -1) { // Mientras no sea el final
	    	System.out.print((char)aux); // "Trabajo" con el dato leído
	    	aux = fr.read();// Leo el siguiente
	    }
		/* Las líneas 12 a 16 se pueden resumir en
		while((aux = fr.read()) != -1)
			     System.out.println((char)aux);
		 */
		fr.close();
	} // del main
} // de la clase





