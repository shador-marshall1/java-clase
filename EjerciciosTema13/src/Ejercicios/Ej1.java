package Ejercicios;
import javax.swing.JOptionPane;
public class Ej1 {

	public static void main(String[] args) {
		String baseString = JOptionPane.showInputDialog("Introduzca la base");
		while (!esReal(baseString)) {
			baseString = JOptionPane.showInputDialog(null, "Introduzca un numero real como base");
		}//while
		String alturaString = JOptionPane.showInputDialog("Introduzca Altura");
		while (!esReal(alturaString)) {
			alturaString = JOptionPane.showInputDialog(null, "Introduzca un real como altura");
		}//while
		
		Double base = Double.parseDouble(baseString);
		Double Altura = Double.parseDouble(alturaString);
		JOptionPane.showMessageDialog(null, "El area de la base: "+ base + " por la altura: "+ Altura + " Es: " +
				base*Altura/2, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}//Main
	public static boolean esReal (String r) {
		try {
			Double.parseDouble(r);
			return true;
		}catch (NumberFormatException nfe) {
			return false;
		}
	}
}//Clase
