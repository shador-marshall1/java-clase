import java.io.*; 
public class Copia { 
  public static void main(String args[]) { 
    FileInputStream origen = null; 
    FileOutputStream destino = null; 
    try { 
      origen = new FileInputStream(args[0]); 
      destino = new FileOutputStream(args[1],true); //a�adir
      int i = origen.read(); 
      while (i != -1) { // mientras not EOF
		 destino.write(i); 
        i = origen.read(); 
      }
     origen.close(); destino.close(); 
    }catch (IOException e) { 
		System.out.println("Error de ficheros"); 
     }
}
}