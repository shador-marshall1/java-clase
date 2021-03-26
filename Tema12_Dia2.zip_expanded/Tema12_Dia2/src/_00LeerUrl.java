// 23 enero 2020
// Alberto Carrera Martín
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class _00LeerUrl {

	public static void main(String[] args) throws IOException {
		//URL url = new URL("http://www.iessierradeguara.com/ip.php");
		URL url = new URL("http://iessierradeguara.com/wordpress/secretaria/novedades");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		String inputLine, inputText="";
		while ((inputLine = in.readLine()) != null) {
		     inputText = inputText + inputLine;
		}
	    System.out.println(inputText);
	}

}
