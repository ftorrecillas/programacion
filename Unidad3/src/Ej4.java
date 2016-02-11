
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
public class Ej4 {
    public static void main (String args[]) {
         float num1, num2;
     Scanner intro = new Scanner(System.in);
         System.out.println("Introduzca un numero:");
         num1 = intro.nextFloat ();
         System.out.println("Introduzca un segundo:");
         num2 = intro.nextFloat ();
        
         if (num1<num2)
             System.out.println(+num1+" es menor que "+num2);
	

         else if (num2<num1)
 	System.out.println(+num2+" es menor que "+num1);
         else 
             System.out.println(+num2+" es igual que "+num1);
}
}
