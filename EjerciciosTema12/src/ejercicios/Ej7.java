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
<<<<<<< HEAD
			Double temperaturas [] = {,};
=======
			Double temperaturas [] = {numeroAleatorio(), numeroAleatorio(), numeroAleatorio()};
>>>>>>> c5a33b004b17423ad3d1f91bcbec2756a6fc2ad5
			for (int i=0; i< dia.length; i++) {
				dataOS.writeUTF(dia[i]);
			}
			for (int i =0; i < temperaturas.length; i++) {
				dataOS.writeDouble(temperaturas[i]);
		
			}
			System.out.println(Math.round(numeroAleatorio()) +" "+Math.round(numeroAleatorio()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
