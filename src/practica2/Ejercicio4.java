package practica2;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);


		try{
			File directorio=new File("./bin");
		
			ProcessBuilder pb=new ProcessBuilder("java","practica2.Ejercicio3");

			pb.directory(directorio);
				
			Process p=null;	
			p=pb.start();
			
			OutputStream os=p.getOutputStream();
			String texto="";
			os.write("Hola \n Adios\n *".getBytes());
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


	}

}
