package practica2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio7 {
/*Crea un programa Java que ejecute el Ejercicio 5 recogiendo el valor 
 * de entrada desde un fichero y almacenando el resultado y el valor 
 * de salida del proceso en sendos ficheros.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		//Ficheros de entrada y de salida del error
		File entrada=new File("src/ficheroEntradaEj7.dat");
		File salida=new File("src/ficheroSalidaEj7.txt");
		File ficheroErrores=new File("src/ficheroErroresEj7.txt");

		try{
			entrada.createNewFile();
			salida.createNewFile();
			ficheroErrores.createNewFile();
			
			File directorio=new File("./bin");
		
			ProcessBuilder pb=new ProcessBuilder("java","practica2.Ejercicio5");

			pb.directory(directorio);
				
			//redirecciono entrada
			pb.redirectInput(entrada);
			//redirecciono salida
			pb.redirectOutput(salida);
			//redirecciono error
			pb.redirectError(ficheroErrores);
			
			
			Process p=null;	
			p=pb.start();
			
			
			}catch(IOException e) {
				e.printStackTrace();
			}catch(NoSuchElementException e) {
				e.printStackTrace();
			}


	}

}
