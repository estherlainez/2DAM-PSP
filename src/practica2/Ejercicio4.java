package practica2;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejercicio4 {
/*
 Crea un programa en Java que ejecuta el Ejercicio 3 
 y muestre su resultado y su valor de salida.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);


		try{
			do {
				System.out.println("Introduce cadena ");
				String cadena= teclado.nextLine();
				System.out.println("Introduce cadena 2");
				String cadena2= teclado.nextLine();
				String auxiliar=cadena+" "+cadena2+"*\n";
				
				int i=0;
				char a=' ';
				char c = ' ';
				
				while((i<cadena.length())&&(esAsterisco(c)==false)) {
					c=cadena.charAt(i);
					if(esAsterisco(c)==false) {
						cadena2=cadena+a;
					}
					i++;
				}
				System.out.println("Cadena: ");
				System.out.println(cadena2.toUpperCase());

			
			
			
			
			File directorio=new File("./bin");
		
			ProcessBuilder pb=new ProcessBuilder("java","practica2.Ejercicio3");

			pb.directory(directorio);
				
			Process p=null;	
			p=pb.start();
			
			OutputStream os=p.getOutputStream();
			//os.write("Hola \n Adios\n *".getBytes());
			os.write(auxiliar.getBytes());
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
			}catch(NoSuchElementException e) {
				e.printStackTrace();
			}
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
