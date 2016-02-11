package Fichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class LecturaParcial {
	 public static void main(String [] arg) {
	      File archivo01 = null;
	     
	      //File nuevoArchivo = null;
	      FileReader fr01 = null;
	     int hola=4;
	      FileWriter nuevoArchivo = null;
	      BufferedReader br01 = null;
	     
	      BufferedWriter bw = null;
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo01 = new File ("documento01.txt");
	         
	         nuevoArchivo = new FileWriter ("nuevoarchivo01.txt");
	         fr01 = new FileReader (archivo01);
	      
	        // fw = new FileWriter (nuevoArchivo);
	         br01 = new BufferedReader(fr01);
	         
	         bw= new BufferedWriter(nuevoArchivo);
	         String linea01;
	         
	         // Lectura del fichero
	         linea01=br01.readLine();
	         
	        
	       
	         while( linea01!=null){
	        	  if(linea01.length() >=hola){
	        	 //bw.write(linea01);
	        	 System.out.println(linea01);
	        	  }
	        	linea01=br01.readLine();
	         }
	      
	      }
	      catch(Exception e){
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
