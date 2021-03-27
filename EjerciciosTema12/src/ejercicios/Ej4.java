package ejercicios;

import java.io.*;

public class Ej4 {

	public static void main(String[] args) throws IOException {
		
		File f = new File (args[0]);
        FileReader fr = new FileReader (f);
        char[] michar = new char[(int) f.length()];
        try {
        for (int i =0; i < michar.length ; i++) {
            michar[i] = (char) fr.read();
        }
        } catch(IOException e) {
            e.printStackTrace();
}
        String s = "";
        for (int i = 0; i < michar.length; i++) {
                s = s +michar[i];
        }

        s = s.replaceAll("\s+", "");
        System.out.println(s);
			
	
	}

}
