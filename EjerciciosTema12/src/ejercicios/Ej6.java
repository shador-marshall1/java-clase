package ejercicios;

import java.io.*;


public class Ej6 {

	public static void main(String[] args) {
		
		FileReader fr = null;
        BufferedReader filtro=null;
        String aux = null;
        File f = new File (args[1]);
        String Cadena = "";
        try {
            fr = new FileReader (args[0]);
            filtro = new BufferedReader (fr);
            while((aux = filtro.readLine()) != null){
            	Cadena = aux;
}
            Cadena = Cadena.toUpperCase();
            BufferedWriter fichero1 = new BufferedWriter (new FileWriter (f));
            fichero1.write(Cadena);
            fichero1.close();
		}
		catch (IOException e) {
			System.out.println("Oucrrió un error");
		}
	}

}
