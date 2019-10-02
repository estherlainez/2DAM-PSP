package practica2;
import java.util.*;
/*
 * Crea un programa en Java que lea cadenas de texto a través de la entrada estándar 
 * hasta que el usuario introduzca un *. 
 * Después debe mostrar esas cadenas concatenadas y en mayúsculas.

 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		boolean esAsterisco=false;

		String cadena="";
		String cadena2="";
		String aux="";
		String asterisco="*";

		
		do {
			System.out.println("Introduce cadena ");
			cadena= teclado.nextLine();
			//System.out.println("Introduce cadena ");
			//cadena2= teclado.nextLine();
			//aux=cadena+cadena2;
			
			if(cadena.equals(asterisco)) {
				esAsterisco=true;
			}
			
			System.out.println("Cadena: ");
		
			System.out.println(cadena);
			System.out.println(cadena.toUpperCase());
			
			
		}while (esAsterisco==false);
		
		
		

	}
/*
	public static boolean esAsterisco(char c) {
		String asterisco="*";
		if (asterisco.indexOf(c)== -1) {
			return false;
		}
		return true;
	}
*/
}
