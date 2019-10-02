package practica2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Ejercicio2 {
/*Crea un programa en Java para ejecutar el Ejercicio1 
 * y utiliza el flujo de salida para introducir los valores 
 * de la entrada estándar. 
 * Realiza comprobaciones tanto con entradas correctas como con incorrectas. 
 * Mostrar la salida del proceso y su valor de salida.
 */
	public static void main(String[] args) {

		try{
			File directorio=new File("./bin");
		
			ProcessBuilder pb=new ProcessBuilder("java","practica2.Ejercicio1");

			pb.directory(directorio);
				
			Process p=null;
				
			p=pb.start();
			OutputStream os=p.getOutputStream();
			os.write("7 8".getBytes());
			os.flush();
			os.close();
			
			if(p.waitFor()!=0) {
				InputStream is=p.getErrorStream();
				int caracter=0;
					
				while((caracter=is.read())!=-1) {
					System.out.print((char)caracter);
				}
				is.close();
				System.out.println(p.exitValue());
			}else{
				InputStream is=p.getInputStream();
				int caracter=0;
					
				while((caracter=is.read())!=-1) {
					System.out.print((char)caracter);
				}
				is.close();
				System.out.println(p.exitValue());
			}
			
			
			}catch(IOException e) {
				e.printStackTrace();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}


	}

	
}
