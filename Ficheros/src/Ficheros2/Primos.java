package ficheros02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;


public class Primos {
	 public static void main(String [] arg) {
	      FileWriter nuevoArchivo = null;
	      BufferedWriter bw = null;
	      int contador = 2, numero=0;
    	  boolean primo=true;
    	  Scanner lector = new Scanner(System.in);
	      try {
	    	  nuevoArchivo = new FileWriter ("numprimos.txt");
	    	  bw= new BufferedWriter(nuevoArchivo);
	    	  
	    	  
			 do{
				 System.out.println("Introcucioendo número para comprobar ");
				 numero = lector.nextInt();
		    	  while ((primo) && (contador!=numero)){
		    	    if (numero % contador == 0)
		    	        primo = false;
		    	    contador++;
		          }
		    	  if(primo){
		    		  String s = Integer.toString(numero);
		    		  bw.write(s+"\n");
		    		  System.out.println("Este numero si es primo, sigue ");
		    	  }
		    	 
			 } while(primo);
			 System.out.println("Este numero no era primo, has finalizado el archivo");
	      }catch(Exception e){
		         e.printStackTrace();
			      
			      }
			      finally {
		           try {
		           // Nuevamente aprovechamos el finally para 
		           // asegurarnos que se cierra el fichero.
		           if (null != bw)
		        	   bw.close();
		           } catch (Exception e2) {
		              e2.printStackTrace();
		           }
		        }	 
	 }
}
	      
