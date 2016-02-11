package ficheros;
/*
 * 1. -	A partir de dos ficheros de texto se creará un tercer fichero cuyo 
 * contenido se obtendrá uniendo la información de estos ficheros. 
 * Cada línea del fichero creado estará formado por la unión de la misma línea 
 * de los dos ficheros leídos. Se solicitará al usuario el nombre de los 
 * ficheros y la tira de separación entre ambas líneas.
 */
import java.io.*;

public class Crear_lectura {
	   public static void main(String [] arg) {
	      File archivo01 = null;
	      File archivo02 = null;
	      //File nuevoArchivo = null;
	      FileReader fr01 = null;
	      FileReader fr02 = null;
	      FileWriter nuevoArchivo = null;
	      BufferedReader br01 = null;
	      BufferedReader br02 = null;
	      BufferedWriter bw = null;
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo01 = new File ("p1.txt");
	         archivo02 = new File ("p2.txt");
	         nuevoArchivo = new FileWriter ("nuevoarchivo.txt");
	         fr01 = new FileReader (archivo01);
	         fr02 = new FileReader (archivo02);
	        // fw = new FileWriter (nuevoArchivo);
	         br01 = new BufferedReader(fr01);
	         br02 = new BufferedReader(fr02);
	         bw= new BufferedWriter(nuevoArchivo);
	         String linea01,linea02;
	         linea01=br01.readLine();
                 linea02=br02.readLine();
	         // Lectura del fichero
	         
	         while((linea01)!=null || (linea02)!=null ){
                            if(linea01 == null) {
                           linea01 = "";
                        }
                            if(linea02 == null) {
                           linea02 = "";
                        }
                   
	        	 bw.write(linea01+" "+linea02);
                         linea01=br01.readLine();
                         linea02=br02.readLine();
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
