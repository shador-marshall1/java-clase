package ejercicios;

import java.io.*;


public class Ej7 {
	private static double numeroAleatorio () {
		Double temperaturas=0.0;
		for (int i=0; i<24;i++) {
		temperaturas = (Double) (Math.random()*23+1);
		
		}
		return temperaturas;
	}
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fileout = new FileOutputStream("ficheros/Ej7.dat");
			DataOutputStream dataOS=new DataOutputStream(fileout);
			double numeroAleatorio = numeroAleatorio();
			String dia [] = {"10 Agosto 2019"};

			Double temperaturas [] = {,};

			Double temperaturas1 [] = {numeroAleatorio(), numeroAleatorio(), numeroAleatorio()};

			for (int i=0; i< dia.length; i++) {
				dataOS.writeUTF(dia[i]);
			}
			for (int i =0; i < temperaturas1.length; i++) {
				dataOS.writeDouble(temperaturas1[i]);
		
			}
			System.out.println(Math.round(numeroAleatorio()) +" "+Math.round(numeroAleatorio()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
