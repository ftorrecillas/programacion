/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Ej13 {
     public static void main (String args[]) {
     
        
        int a;
       
        Scanner intro = new Scanner(System.in);
	   
           System.out.println("Introduzca un numero:");
           a= intro.nextInt ();      
          
           System.out.println("El numero "+a+" es perfecto? "+ perfecto(a));
     }
    public static  boolean perfecto  (int c){
        
          int cont=1;
          
         for(int i=2; i<c; i++){
             if(c%i==0){
                 cont=cont+i;
                   
             }
         }
          if(cont==c){
                      
                       return true;
                   }
             
          //System.out.println(m);
          
         
         return false;
       
     }
}

