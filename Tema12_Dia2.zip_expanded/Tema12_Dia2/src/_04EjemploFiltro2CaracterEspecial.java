import java.io.*;
public class _04EjemploFiltro2CaracterEspecial {
	public static void main(String[] args) {
		
		String linea;
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader
					(new FileInputStream("Ficheros\\ejemplo.txt"), "utf-8"));
			
			linea=br.readLine();
			while (linea !=null) {
				System.out.println(linea);
				linea=br.readLine();
			}
			br.close();
		} catch (IOException e) {
			System.out.println("No se puede abrir el archivo para lectura");
	}
  }
}

