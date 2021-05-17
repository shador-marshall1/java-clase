package Ejercicio1;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.thoughtworks.xstream.XStream;
public class LeerXML {

	public static void main(String[] args) throws IOException {
			 XStream xStream = new XStream();
			 Departamento d = new Departamento();
					d= (Departamento) xStream.fromXML(new FileInputStream("Ficheros//Departamento.xml"));
			 System.out.println(d);

	}

}
