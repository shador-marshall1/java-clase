// Alberto Carrera diciembre 2019

// Crear el mapa y consultar valores

import java.util.HashMap;

public class HashMap02 {
  public static void main(String[] args) {

    HashMap<Integer, String> m = new HashMap<Integer, String>();

    m.put(156, "Bel�n Carrera");
    m.put(921, "Antonio Cepero");      
    m.put(700, "Pablo Mart�nez");
    m.put(219, "Alberto Carrera");

    System.out.println(m.get(921)); // Antonio Cepero
    System.out.println(m.get(700)); // Pablo Mart�nez
    System.out.println(m.get(666)); // null
 //
    int codigo =219;
    if (m.containsKey(codigo))
        System.out.println("El c�digo " + codigo + " corresponde a " + m.get(codigo));
    else 
        System.out.println("El c�digo " + codigo + " no existe");
    
  }// del main
  
}