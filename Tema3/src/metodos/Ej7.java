/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;
//import static metodos.Ej6.text;

/**
 *
 * @author mati
 */
public class Ej7 {
    public static void main (String args[]) {
        int  b,c;
        char car;
        Scanner intro = new Scanner(System.in);
	   System.out.println("Introduzca un caracter:");
           car = intro.next().charAt(0);
           System.out.println("Introduzca un numero veces:");
           b = intro.nextInt ();
           System.out.println("Introduzca un numero lineas:");
           c = intro.nextInt ();
           text(car,b,c);
           
     }
    public static  void text  (char x, int f, int h){
            
        for(int i=1; i<=h; i++){
            
            for(int j=1; j<=f; j++){
              System.out.print(x+" ");
            }
            System.out.println();
          }
    }
}
