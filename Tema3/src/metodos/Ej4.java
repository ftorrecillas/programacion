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
public class Ej4 {
    public static void main (String args[]) {
        double a, b, c, d;
        Scanner intro = new Scanner(System.in);
	   System.out.println("Introduzca un numero:");
           a = intro.nextInt ();
           System.out.println("Introduzca un numero:");
           b = intro.nextInt ();
           System.out.println("Introduzca un numero:");
           c = intro.nextInt ();
            d=max1(b,a);
                   
            System.out.println("el mayor es:" + max(d,c));
    }
    public static  double max1 (double x, double y){
            
            if (x>y)
                return x;
            return y;         
        }
    public static  double max (double x, double y){
            
            if (x>y)
                return x;
            return y;         
        }
}
