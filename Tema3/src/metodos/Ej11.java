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
public class Ej11 {
     public static void main (String args[]) {
        int c,a,b,d;
       
        Scanner intro = new Scanner(System.in);
	   System.out.println("Introduzca un caracter:");
           c= intro.nextInt ();
           System.out.println("Introduzca un caracter:");
           a= intro.nextInt ();
           System.out.println("Introduzca un caracter:");
           b= intro.nextInt ();
           System.out.println("Introduzca un caracter:");
           d= intro.nextInt ();
             System.out.println("La secuencia es factorial:" + capi(c,a,b,d));
           
           
     }
     public static  boolean capi  (int c, int a, int b, int d){
    
         
         if(c==d && a==b)
            
          //System.out.println(m);
          return true;
         
         return false;
       
     }
}
