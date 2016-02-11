
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
public class Ej3 {
     public static void main (String args[]) {
         int num;
     Scanner intro = new Scanner(System.in);
         System.out.println("Introduzca su edad:");
         num = intro.nextInt ();
         if (num%2==0)
              System.out.println(+num+" es par");
	
        else
            System.out.println(+num+" es impar");
}
}
     
