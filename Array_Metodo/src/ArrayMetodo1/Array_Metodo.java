/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ArrayMetodo1;
import java.util.Arrays;
/**
 *
 * @author mati
 */
public class Array_Metodo {

    /**
     * @param args the command line arguments
     */
   
        public static void mostrarArrayPantalla2(int [] arrai){
         System.out.print("Vector:" );
        for(int i=0; i<arrai.length;i++){
            System.out.print(" "+arrai[i]+",");
        }
        }
        
         public static void obtenerArrayComoString (int [] arrai){
            System.out.println();
             //for(int i=0; i<j.length;i++)
             System.out.println("Vector: "+arrai.toString() +",");
        }
         
          public static void completarArray3(int [] arrai){
              for(int i=0, j=0; i<arrai.length;i++, j+=2){
                  arrai[i]=j;
                  System.out.print("Vector: "+arrai[i]+",");
                  
              }
          }
          
          public static void obtenerSumaArray(int [] arrai){
               System.out.println();
              int suma=0;
              for(int i=0; i<arrai.length;i++){
                  
                  suma=suma+arrai[i];
                  /*la suma sera del array del método de arriba, ya que el array son espacios de memoria
                  que una vez se modifican no restablecen su valor original*/
              }
                   System.out.print("Suma Vector: "+suma);
          }
          
          public static void  arrayPotencias2(int [] arrai) {
         for(int i=0, j=0; i<arrai.length;i++, j=2){
                  arrai[i]=j;
                  System.out.print("Vector: "+arrai[i]+",");
                  
              }
    }
    }

