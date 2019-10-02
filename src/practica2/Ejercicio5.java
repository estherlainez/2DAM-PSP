package practica2;
import java.util.*;
public class Ejercicio5 {
/*
 * Crea un programa en Java que lea una cadena de texto visualice por pantalla 
 * si esa cadena es o no un palíndromo o si la cadena está vacía.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String cadena="cadena";
		
		int inicio = 0;
		int fin = cadena.length()-1;
		cadena.replace(" ", "");
		cadena.replace(",", "");
		cadena.replace(".","");
		System.out.println(cadena);
		
		boolean esP = true;
		cadena.toLowerCase();
		
		System.out.println(cadena);
		
		String invertida = new StringBuilder(cadena).reverse().toString();
		System.out.println(invertida);
		
		while ((inicio<fin)){
			
			if(cadena.charAt(inicio)!=cadena.charAt(fin)) {
				esP=false;
				
			}
			inicio++;
			fin--;
		}
		if(esP)
			System.out.println("Es palindromo");
		else
			System.out.println("No es palindromo");

		
		
		if (cadena.length()==0) {
				System.out.println("La cadena esta vacia");
		}else {
			System.out.println("La cadena tiene una longitud de "+cadena.length());
		}
		
				

	}

}
