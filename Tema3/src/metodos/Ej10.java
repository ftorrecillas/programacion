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
public class Ej10 {
     public static void main (String args[]) {
        int c;
       
        Scanner intro = new Scanner(System.in);
	   System.out.println("Introduzca un caracter:");
           c= intro.nextInt ();
             System.out.println("El factorial es: "+ facto(c));
           
           
     }
     public static  double facto  (int x){
          double factorial=1;
              while ( x!=0) {
                factorial=factorial*x;
                     x--;
    }
          //System.out.println(m);
          return factorial;
       
     }
}
