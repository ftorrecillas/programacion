/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;
//import static metodos.Ej11.capi;

/**
 *
 * @author mati
 */
public class Ej12 {
    public static void main (String args[]) {
        String nom;
        
        int a;
       
        Scanner intro = new Scanner(System.in);
	   System.out.println("Introduzca su nombre:");
           nom= intro.next();
           System.out.println("Introduzca un idioma siendo 1= Valenciano, 2=Castellano, 3=Inglés:");
           a= intro.nextInt ();         
           if (a==1)
                System.out.println("Bon dia " + nom);
           if (a==2)
                System.out.println("Buenos dias " + nom);
           if (a==3)
                System.out.println("Good morning " + nom);
           
     }
}
