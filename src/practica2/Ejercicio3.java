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

		String cadena="";

		String aux="";

		do 
		{
			System.out.println("Introduce cadena ");
			cadena= teclado.nextLine();
			
			aux+=cadena;

		}while (!cadena.equals("*"));
		teclado.close();
		System.out.println(aux);
	}

}
