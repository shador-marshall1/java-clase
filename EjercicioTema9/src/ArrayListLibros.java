
      import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// Repaso ArrayList

public class ArrayListLibros {
  // private final static int MAX = 100; no tiene sentido....
  private ArrayList<Libro> lista;
  
  public ArrayListLibros() {
    lista = new ArrayList<Libro>();
  }

 // public boolean llena() { return ... no tiene sentido }

  public boolean vacia() { return lista.isEmpty(); }

  public int length() { return lista.size(); }
 
  public int buscar(String parte) { // Devuelve índice, no posición
  
    
    int i=0;
    boolean encontrado=false;
    while ((i<lista.size())&&(!encontrado)){
   	if ((lista.get(i).dameTitulo().toUpperCase().indexOf(parte.toUpperCase()))!=-1) 
    		encontrado=true;
    	else i++;
    }	
    if (encontrado) return i;
    else return -1;
    
  }
  
  
  public boolean insertar(Libro p) {
  
    lista.add(p);
    return true;
  }
  
  public boolean eliminar(int pos) {
	 if((pos < 1) || (pos > lista.size()) || (vacia()))
			  return false;
	 else
	 {
		 lista.remove(pos-1);
		 return true;
	 }
  }

  public Libro recuperar(int pos) {
  
    if((pos < 1) || (pos > lista.size())) return null;
    return lista.get(pos-1);
  }
 
  public String toString() {
	  String cad = lista.size() + " Elementos de la lista:\n\n";
	  Iterator it = lista.iterator(); 
	  while(it.hasNext()) {
		  cad += it.next() + "\n-----------------------------------------------\n";
	  }
	  return cad;
  }
 public void ordernarTitulo () {
	 Collections.sort(lista, new TituloComparator());
	
 }
}