package ejercicios;

import java.io.*;


public class Ej10Lectura {

	public static void main(String[] args) throws Exception {
		//FileInputStream fis = null;
        //ObjectInputStream entrada = null;
        Ej10 p;
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ficheros//ventas.dat"));
        visualizaCliente(ois);
	}
	
	public static void visualizaCliente(ObjectInputStream ois) throws Exception {
		
		Ej10 c;
		try {
			
			c=(Ej10) ois.readObject();
			while (true) {
				System.out.println(c);
				c=(Ej10) ois.readObject();
			}	
		}
	
		
		catch(EOFException e) {
			System.out.println("Fin de fichero. Saliendo.");
		}

}
}