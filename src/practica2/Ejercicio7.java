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
		File entrada=new File("src/ficheroEntrada.dat");
		File salida=new File("src/ficheroSalida.txt");
		File ficheroErrores=new File("src/ficheroErrores.txt");

		try{
			entrada.createNewFile();
			salida.createNewFile();
			ficheroErrores.createNewFile();
			
			File directorio=new File("./bin");
		
			ProcessBuilder pb=new ProcessBuilder("java","practica2.Ejercicio5");

			pb.directory(directorio);
				
			Process p=null;	
			p=pb.start();
			
			//redirecciono entrada
			pb.redirectInput(entrada);
			//redirecciono salida
			pb.redirectOutput(salida);
			//redirecciono error
			pb.redirectError(ficheroErrores);
			
			}catch(IOException e) {
				e.printStackTrace();
			}catch(NoSuchElementException e) {
				e.printStackTrace();
			}


	}

}
