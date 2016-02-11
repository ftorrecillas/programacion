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
public class Ej6 {
     public static void main (String args[]) {
        int  b;
        char mo;
        Scanner intro = new Scanner(System.in);
	   System.out.println("Introduzca un caracter:");
           mo = intro.next().charAt(0);
           System.out.println("Introduzca un numero:");
           b = intro.nextInt ();
           text(mo,b);
           
     }
      public static  void text  (char x, int f){
          for(int i=1; i<=f; i++){
           System.out.print(x+" ");
             
          }
      }
}
