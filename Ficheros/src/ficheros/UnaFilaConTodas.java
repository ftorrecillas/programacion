/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author mati
 */
public class UnaFilaConTodas {
    public static void main(String [] arg) {
	      File archivo01 = null;
	      File archivo02 = null;
	      //File nuevoArchivo = null;
	      FileReader fr01 = null;
	     
	      FileWriter nuevoArchivo = null;
	      BufferedReader br01 = null;
	    
	      BufferedWriter bw = null;
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo01 = new File ("p1.txt");
	         archivo02 = new File ("p2.txt");
	         nuevoArchivo = new FileWriter ("nuevoarchivo02.txt");
	         fr01 = new FileReader (archivo01);
	         
	        // fw = new FileWriter (nuevoArchivo);
	         br01 = new BufferedReader(fr01);
	        
	         bw= new BufferedWriter(nuevoArchivo);
	         String linea01,linea02;
	         linea01=br01.readLine();
                // linea02=br02.readLine();
	         // Lectura del fichero
	         
	        do{
                             FileReader fr02 = null;
                             fr02 = new FileReader (archivo02);
                             BufferedReader br02 = null;
                             br02 = new BufferedReader(fr02);
                             linea02=br02.readLine();
                             while(linea02!=null){
                                 bw.write(linea01+" "+linea02+"\n");
                                 linea02=br02.readLine();
                              }
	        	 
                         linea01=br01.readLine();
                      
             
                  } while(linea01!=null);
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
