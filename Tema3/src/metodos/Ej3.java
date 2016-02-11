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
public class Ej3 {
    public static void main (String args[]) {
        double a, b;
        Scanner intro = new Scanner(System.in);
	   System.out.println("Introduzca un numero:");
           a = intro.nextInt ();
           System.out.println("Introduzca un numero:");
           b = intro.nextInt ();
          
                   
            System.out.println("el mayor es:" + max(a,b));
    }
    public static  double max (double x, double y){
            
            if (x>y)
                return x;
            return y;         
        }
}
