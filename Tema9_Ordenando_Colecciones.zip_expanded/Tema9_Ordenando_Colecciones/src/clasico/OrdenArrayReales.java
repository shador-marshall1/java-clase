package clasico;
import java.util.Arrays;

// Alberto Carrera Mart�n 9 diciembre 2016

public class OrdenArrayReales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] notas = {7.4, 5, 9.2, 6};
		Arrays.sort(notas);
		for (double nota:notas)
			System.out.println(nota + " ");

	}

}
