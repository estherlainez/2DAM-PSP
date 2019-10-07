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
