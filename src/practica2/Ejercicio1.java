package practica2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	/*Crea un programa en Java que lea dos números desde la entrada
	 * estándar y visualice su suma. Controlar que lo introducido 
	 * por teclado sean dos números enteros, 
	 * en caso contrario el programa debe finalizar con valor 1.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int nro1,nro2,resultado;
		try {
			System.out.println("Introduzca primer numero");
	        nro1=teclado.nextInt();
	        System.out.println("Introduzca segundo numero");
	        nro2=teclado.nextInt();
	        resultado=nro1+nro2;
	        System.out.println(resultado);
	        
		}catch(InputMismatchException e) {
			System.out.println("Los operandos deber ser numeros");
			System.out.println("Algo ha fallado");
			System.exit(1);
		}
		
		teclado.close();
	}

}
