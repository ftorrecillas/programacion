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
public class Ej8 {
    public static void main (String args[]) {
        int  b;
        char car;
        Scanner intro = new Scanner(System.in);
	   System.out.println("Introduzca un caracter:");
           car = intro.next().charAt(0);
           System.out.println("Introduzca un numero veces:");
           b = intro.nextInt ();
           text(car,b);
           
    }
     public static  void text  (char x, int f){
            
        for(int i=1; i<=f; i++){
            
            for(int j=1; j<=f-i; j++){
              System.out.print(" ");
            }
            for(int t=1; t<=i*2-1; t++){
            System.out.print(x);
          }
            System.out.println();
     }
}
}
