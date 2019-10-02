package practica2;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Ejercicio8 {
/*Crea un programa Java que ejecute el Ejercicio 3 recogiendo 
 * el valor de entrada desde un fichero y almacenando el resultado y 
 * el valor de salida del proceso en sendos ficheros.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ficheros de entrada y de salida del error
				File entrada=new File("src/ficheroEntradaEj8.dat");
				File resultado=new File("src/ficheroResultadoEj8.txt");
				File salida=new File("src/ficheroSalidaEj8.txt");

				try{
					entrada.createNewFile();
					resultado.createNewFile();
					salida.createNewFile();
					
					File directorio=new File("./bin");
				
					ProcessBuilder pb=new ProcessBuilder("java","practica2.Ejercicio3");

					pb.directory(directorio);
					
					pb.redirectInput(entrada);
		
					pb.redirectInput(resultado);

					pb.redirectOutput(salida);
					
					
					Process p=null;	
					p=pb.start();
					
					
					}catch(IOException e) {
						e.printStackTrace();
					}catch(NoSuchElementException e) {
						e.printStackTrace();
					}


	}

}
