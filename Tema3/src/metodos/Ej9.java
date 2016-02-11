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
public class Ej9 {
    public static void main (String args[]) {
        int  b, c;
        char car;
        Scanner intro = new Scanner(System.in);
	   System.out.println("Introduzca un caracter:");
           c= intro.nextInt ();
           System.out.println("Introduzca un numero veces:");
           b = intro.nextInt ();
          
           System.out.println("Media armónica:"+ media(c,b));
           
    }
      public static  double media  (int x, int f){
          double a, b=1f/f, m;
          a=1f/x;
          m=(a+b)/2;
          //System.out.println(m);
          return 1f/m;
       
     }
}
