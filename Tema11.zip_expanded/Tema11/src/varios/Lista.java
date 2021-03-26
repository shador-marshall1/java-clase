package varios;
// Lista.java: una lista de Personas

public class Lista {
  private final static int MAX = 100;
  private Persona _array[];
  private int _cont = 0; // Indica la primera posici�n libre
  // del array. Igual al n�mero de elementos

  public Lista() {
    _array = new Persona[MAX];
  }

  public boolean llena() { return _cont == MAX; }

  public boolean vacia() { return _cont == 0; }

  public int length() { return _cont; }

  public boolean insertar(Persona p) {
  // Devuelve true si se inserta; false si lista llena
    if(_cont == MAX) return false;
    _array[_cont] = p;
    _cont++;
    return true;
  }

  public Persona recuperar(int pos) {
  // true si tiene �xito; false si posici�n no v�lida
  // pos variar� de 1 al n�mero de elementos
    if((pos < 1) || (pos > _cont)) return null;
    return _array[pos-1];
  }

  public String toString() {
    String cad = "Elementos de la lista:\n\n";
    for(int i = 0; i < _cont; i++)
      cad += _array[i].toString() + "\n";
    return cad;
  }
}