import java.util.Comparator;
public class PaginasComparator {
class PaginaComparator implements Comparator <Libro> {
	public int compare (Libro l1, Libro l2) {

		return l1.damePaginas() - l2.damePaginas();
}
	 public boolean equals(Object o) {
		 return this == o;
}
}
}