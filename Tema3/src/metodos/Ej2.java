/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;
//import static metodos.Ej1.sumador;

/**
 *
 * @author mati
 */
public class Ej2 {
    public static void main (String args[]) {
        double radio;
        Scanner intro = new Scanner(System.in);
	   System.out.println("Introduzca un numero:");
           radio = intro.nextDouble ();
           System.out.println("area es:" + area(radio));
           System.out.println("longitud es:" + log(radio));
    }
    
    public static  double area (double x){
            double  suma=0;
            
            suma= Math.PI*(x*x);
            
            return suma;
                    
        }
    public static  double log (double x){
            double  suma=0;
            suma=Math.PI*x*2;
            return suma;
                    
        }
}
