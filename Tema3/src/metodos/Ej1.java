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
public class Ej1 {
    public static void main (String args[]) {
          int a, b;
          Scanner intro = new Scanner(System.in);
	   System.out.println("Introduzca un numero:");
           a = intro.nextInt ();
           System.out.println("Introduzca un numero:");
           b = intro.nextInt ();
           
            System.out.println("suma es:" + sumador(a,b));
    }
            public static  int sumador (int x, int y){
            int  suma=0;
            suma=x+y;
            return suma;
                    
        }
    
}
