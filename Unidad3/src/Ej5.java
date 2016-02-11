
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
public class Ej5 {
     public static void main (String args[]) {
         float num;
        Scanner intro = new Scanner(System.in);
         System.out.println("Introduzca una nota:");
         num = intro.nextFloat ();
         //intro.nextLine;
        
       if (num<3) {
	System.out.println(num+" es M.D "); 
        }

       else if  (num<5) {
	System.out.println(num+" es INS. "); 
}
        else if (num<6) {
	System.out.println(num+" es SUF. "); }
      
        else if (num<7) {
	System.out.println(num+" BIEN ");  
}
        else if (num<9) {
	System.out.println(num+" NOT. ");  
}

        else if (num<=10) {
	System.out.println(num+" SOB. "); 
}

}
}

