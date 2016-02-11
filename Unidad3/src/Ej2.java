
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Ej2 {
    public static void main (String args[]) {
         int edad;
     Scanner intro = new Scanner(System.in);
         System.out.println("Introduzca su edad:");
         edad = intro.nextInt ();
         
         if (edad>25)
            System.out.println("Eres mayor de 25");
	
         else if(edad==25)
            System.out.println("Tienes 25");
         else
             System.out.println("Eres menor de 25");
     }
    
}
