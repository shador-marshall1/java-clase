// 23 Marzo 2021
// Alberto Carrera Mart�n
import java.io.*;

public class _01EjemploEscrituradeChar3 {
	public static void main(String[] args)
	{
		if (args.length==0) {
			System.out.println("No has enviado ning�n argumento");
			System.exit(-1);
		}
		FileWriter fw=null;
		try {
		
			fw = new FileWriter(args[0]);
			fw.write('A'); fw.write('l');fw.write('b');fw.write('e');fw.write('r');fw.write('t');
			fw.write('o');fw.write(' ');fw.write('C');fw.write('a');fw.write('r');fw.write('r');
			fw.write('e');fw.write('r');fw.write('a'); fw.write(' ');fw.write('M');fw.write('a');
			fw.write('r');fw.write('t');fw.write('�');fw.write('n');
			fw.close();
		} catch (IOException e) {
		System.out.println("Ocurri� un error");
		System.out.println(e.getMessage());
		}
		
	}// del main
} // de la clase

