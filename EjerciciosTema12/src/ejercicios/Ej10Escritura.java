package ejercicios;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej10Escritura {

	
		public static void main(String[] args) throws Exception {
			ObjectOutputStream salida = new ObjectOutputStream (new FileOutputStream("ficheros/ventas.dat"));
			ArrayList<Ej10> listaClientes=new ArrayList<Ej10>();
			rellenaCliente(listaClientes);
			escribeCliente(salida,listaClientes);
			salida.close();
		}  
		public static void rellenaCliente(ArrayList<Ej10> listaClientes) {
			
			Scanner s=new Scanner(System.in);
			String intro="";
			int i=0;
			boolean introducir=true; 
			System.out.println("¿Deseas introducir un cliente? s/n:");
			intro=s.nextLine();
			if(intro.equals("s")) {
				while(introducir) {
					
					listaClientes.add(new Ej10());
					listaClientes.get(i).setNombre(s);
					listaClientes.get(i).setTelefono(s);
					listaClientes.get(i).setDireccion(s);
					listaClientes.get(i).setNif(s);
					listaClientes.get(i).setMoroso(s);
					i++;
					
					System.out.println("¿Deseas introducir algún otro cliente? s/n:");
					intro=s.nextLine();
					if(intro.equals("n")) {
						introducir=false;
					}
					else if(intro.equals("s")) {
						continue;
					}
				}
			}
			else {
				System.out.println("Saliendo.");
				s.close();
				System.exit(0);
			}
		}
		public static void escribeCliente(ObjectOutputStream oos,ArrayList<Ej10> listaClientes) throws Exception {
			
			try {
				for (Ej10 cliente : listaClientes) {
					oos.writeObject(cliente);
				}
				System.out.println("Operación completada con éxito");
			}
			catch(IOException e) {
				System.out.println("Error de E/S");
			}
		}
	}

