package Ejercicio1;
import java.io.*;
import com.thoughtworks.xstream.XStream;
public class CrearXML {

	public static void main(String[] args) throws IOException, Exception {
		File fichero = new File ("Ficheros//Departamento.dat");
		FileInputStream fis = new FileInputStream (fichero);
		ObjectInputStream ois = new ObjectInputStream (fis);
		ListaDepartamentos listaDep = new ListaDepartamentos();
		try {
		while (true)  {
			Departamento departamento = (Departamento) ois.readObject();
			listaDep.Añadir(departamento);
		}
		} catch (EOFException eo){}
		ois.close();
		
		try {
			XStream stream = new XStream();
			stream.alias("Departamentos", ListaDepartamentos.class);
			stream.toXML(listaDep, new FileOutputStream("Ficheros//Departamento.xml"));
			
			
		}catch (Exception eo){}
	}

}
