import java.io.*;
public class _03EjemploFiltro2b {
	public static void main(String[] args)  {
		try {
		    BufferedWriter fichero = new BufferedWriter 
										(new FileWriter ("Ficheros\\Ejemplo.txt"));
			for (int i=1; i<6; i++){
				fichero.write("Fila número: "+i);
				fichero.newLine();// Mejorarlo, si la fila es la última que no haga ya retorno
			}
			fichero.close();
		} catch (IOException io) {
			System.out.println("Ocurrió un error - " + io.getMessage());
		}
  }
}

