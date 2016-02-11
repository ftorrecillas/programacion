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
public class Ej5 {
      public static void main (String args[]) {
        double a, b, c, d;
        Scanner intro = new Scanner(System.in);
	   System.out.println("Introduzca un numero:");
           a = intro.nextDouble ();
           System.out.println("Introduzca un numero:");
           b = intro.nextDouble ();
           System.out.println("Introduzca un numero:");
           c = intro.nextDouble ();
           System.out.println("Introduzca un numero:");
           d= intro.nextDouble ();
       
                   
            System.out.println("el mayor es:" + max3(a,b,c,d));
    }
      public static  double max3 (double x, double y, double d, double t){
            
            while (x>y && x>d && x>t){
                return x;}
            while (y>x && y>d && y>t){
                
                return y;  }
            while (d>y && d>x && d>t){
           
                return d;}
            
                return t;
       }
}
