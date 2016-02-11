
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
public class EjB4 {
    public static void main (String args[]) {
        
         int i, num,num1, cont=0;
         Scanner intro = new Scanner(System.in);
         System.out.println("Introduzca A:");
         num = intro.nextInt ();
         System.out.println("Introduzca B:");
         num1 = intro.nextInt ();
         if(num1>num){
              for (i=num;  i<=num1; i++){
                 System.out.println(i);
                     if(i%2==0){
                        cont++;
             }
                     
             }
        
             
         }
         
         else System.out.println("Mal");
         System.out.println("Los pares son "+cont);
    }
}
