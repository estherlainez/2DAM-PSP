package practica2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio6 {
/*Crea un programa en Java que ejecuta el Ejercicio 5 
 *y muestre su resultado y su valor de salida.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);


		try{
			File directorio=new File("./bin");
		
			ProcessBuilder pb=new ProcessBuilder("java","practica2.Ejercicio5");

			pb.directory(directorio);
				
			Process p=null;	
			p=pb.start();
			
			OutputStream os=p.getOutputStream();
			os.write("casa".getBytes());
			os.flush();
			os.close();
			
			
			InputStream is=p.getInputStream();
			int caracter=0;
					
			while((caracter=is.read())!=-1) {
				System.out.print((char)caracter);
			}
			is.close();
			System.out.println(p.exitValue());
			
			
		}catch(IOException e) {
				e.printStackTrace();
		}catch(NoSuchElementException e) {
				e.printStackTrace();
		}

	}

}
