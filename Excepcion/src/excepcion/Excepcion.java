/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author mati
 */
public class Excepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean verdadero=false;
        int tcl_Dividendo, tcl_Divisor, auxiliar=0;
        Scanner intro=new Scanner(System.in);
       
   do{     
        
        try {
                System.out.print("Dividendo: ");
                 tcl_Dividendo =  intro.nextInt();
                
                 System.out.print("Divisor: ");
                 tcl_Divisor =  intro.nextInt();
                
	  auxiliar = tcl_Dividendo / tcl_Divisor;
               
                verdadero=true;
            } catch (ArithmeticException e1) {
                System.out.println("Error no posible division en cero");
                intro.nextLine();
            } catch (InputMismatchException e2) {
                System.out.println("No se ha leido un entero....");  
                intro.nextLine();
            } catch (Exception e9) {
                System.out.println("Error general");
} 
    } while (!verdadero);
    System.out.println("La division es: " + auxiliar);  
}
}
