package practica2;
import java.util.*;
/*
 * Crea un programa en Java que lea cadenas de texto a trav�s de la entrada est�ndar 
 * hasta que el usuario introduzca un *. 
 * Despu�s debe mostrar esas cadenas concatenadas y en may�sculas.

 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		String cadena = null;
		String cadena2="";
		char c = ' ';
		
		do {
			System.out.println("Introduce una cadena:");
			cadena=teclado.nextLine();
		
			int i=0;
			char a=' ';
		
			while((i<cadena.length())&&(esAsterisco(c)==false)) {
				c=cadena.charAt(i);
				if(esAsterisco(c)==false) {
					cadena2=cadena+a;
				}
				i++;
		}
		System.out.println("Cadena: ");
		System.out.println(cadena2.toUpperCase());
		
		}while(esAsterisco(c)==false);
		
	}
	
	public static boolean esAsterisco(char c) {
		String asterisco="*";
		if (asterisco.indexOf(c)== -1) {
				return false;
		}
		return true;
	}

}
