import java.util.Comparator;
public class TituloComparator {

class TituloComparator1 implements Comparator <Libro> {
public int compare (Libro l1, Libro l2) {
	return l1.dameTitulo().compareTo(l2.dameTitulo());
}
public boolean equals(Object o) {
return this == o;
}
}
}