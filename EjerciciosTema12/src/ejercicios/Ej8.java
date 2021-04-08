package ejercicios;

import java.io.*;

public class Ej8 {

	public static void main(String[] args) {
		try {
		FileInputStream filein = new FileInputStream("ficheros/Ej7.dat");
		try (DataInputStream dataIS = new DataInputStream(filein)) {
			String n;
			Double d;
			while (true) {
				n=dataIS.readUTF();
				d=dataIS.readDouble();
				System.out.println("El día "+n+ " Hará las temperaturas: "+d +" "+ d);
			
			}
		}
		}
		catch (IOException e){
			e.printStackTrace();
			
		}
	}

}
