/* 
 * ENERO 2019. Ejemplos trabajo con cadenas
 * 
 */
public class _03Cadenas2 {

	public static void main(String[] args) {
		
		String s = "Alberto Carrera Mart�n";
		System.out.println(s.lastIndexOf("ar")); // 17
		System.out.println(s.lastIndexOf("ar",15));//9
		System.out.println(s.startsWith("a")); //false
		System.out.println(s.endsWith("Mart�n")); // true
		System.out.println("   Alberto    ".trim()); // Alberto
		/**************************************/
		System.out.println(s.contains("Mart�n")); // true
		/****/
		String inicial = "Esta cadena, contiene comas, por la que quiero trocear. " ;
		 String trozos [ ] = inicial.split(", ") ;
		 for ( String trozo : trozos )
		 System.out.println(trozo) ;
	}

}

