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
public class Ad {
    
    public static void main (String args[]) {
        Scanner tcl= new Scanner(System.in); 
        int valor;
        
        System.out.println("Piensa un numero"); 
        tcl.nextLine();
        System.out.println("Multiplicalopor 5");
        tcl.nextLine();
        System.out.println("Sumale6");
        tcl.nextLine();
        System.out.println("Multiplıcalopor 4");
        tcl.nextLine();
        System.out.println("Sumale9"); 
        tcl.nextLine();
        System.out.println("Multiplıcalopor 5");
        tcl.nextLine();
        System.out.println("Escribe el resultado");
        valor=tcl.nextInt();
        System.out.println("El numero que habıas pensado es: ");
        System.out.println((valor-165)/100);
    }
}
