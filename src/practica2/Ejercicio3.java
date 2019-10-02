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
