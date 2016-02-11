/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
import java.util.*;
public class Ej1 {
     public static void main (String args[]) {
         int edad;
     Scanner intro = new Scanner(System.in);
         System.out.println("Introduzca su edad:");
         edad = intro.nextInt ();
         
         if (edad>=18)
            System.out.println("Eres mayor de edad");
	
        else
            System.out.println("Eres menor de edad");
     }
    
}
