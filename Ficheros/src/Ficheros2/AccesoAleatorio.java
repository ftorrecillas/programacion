/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficheros2;
import java.io.*;

public class AccesoAleatorio {
    public static void main(String [] arg) {
        
              int pos = 2;
              String ficheronuevo="nuevoarchivo02.txt";  
              RandomAccessFile aleatorio=null;
              
	      
	      try {
                    aleatorio= new RandomAccessFile(ficheronuevo,"rw");
                    long tamañofichero=aleatorio.length();
                    aleatorio.seek(pos);
                    if (aleatorio.getFilePointer()>tamañofichero){
                         int caracter=aleatorio.read();
                        aleatorio.seek(aleatorio.getFilePointer()-1);
                        aleatorio.write(Character.toUpperCase(caracter));
                      
                      
                    }
              }catch(FileNotFoundException e){
                  
                         System.out.println("error fichero no encontrado");
                         System.out.println(e.getMessage());
              }catch(Exception e){
                  
                         System.out.println("error lectura o escritura");
                         System.out.println(e.getMessage());
              }finally{
                  try{
                      if(aleatorio!=null)
                          aleatorio.close();
                  }catch(Exception e){
                  
                         System.out.println("error lectura o escritura");
                         System.out.println(e.getMessage());
              }
              }
              
    }
}
