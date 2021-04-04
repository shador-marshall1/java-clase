package ejercicios;

import java.io.*;


public class Ej10Lectura {

	public static void main(String[] args) {
		FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Ej10 p;
        
        try {

            fis = new FileInputStream("ficheros/ventas.dat");
            entrada = new ObjectInputStream(fis);
            p = (Ej10) entrada.readObject(); 
            System.out.println(p.toString());
            //System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad()+ p.getDireccion()+ p.getTelefono());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
	}

}
