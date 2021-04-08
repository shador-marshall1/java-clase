package ejercicios;

import java.io.*;


public class Ej7 {

	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fileout = new FileOutputStream("ficheros/Ej7.dat");
			DataOutputStream dataOS=new DataOutputStream(fileout);
			double numeroAleatorio = (double) (Math.random()*23+1);
			String dia [] = {"10 Agosto 2019"};
			Double temperaturas [] = {,};
			for (int i=0; i< dia.length; i++) {
				dataOS.writeUTF(dia[i]);
			}
			for (int i =0; i < temperaturas.length; i++) {
				dataOS.writeDouble(temperaturas[i]);
		
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
