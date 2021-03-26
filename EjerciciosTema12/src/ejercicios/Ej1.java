package ejercicios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ej1 {

public static void main(String[] args) {

FileInputStream cosa1 = null;
int contador = 0;
int aux = 0;
double suma = 0;

try {

cosa1 = new FileInputStream("ficheros/Ej1.txt");
while ((aux = cosa1.read()) != -1) {

suma += aux;
contador++;

}

}

catch (IOException e) {

// TODO Auto-generated catch block
e.printStackTrace();

}

finally {

try {

System.out.println("La suma de todos los números es " + suma);
System.out.printf("La media de todos los números es %.2f", suma/contador);
cosa1.close();

} catch(IOException e) {

e.printStackTrace();

}

}

}

}