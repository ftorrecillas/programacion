
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
import java.util.*;
public class Suma {
    
      public static void main (String args[]) {
        int valor, valor1, result;
        Scanner tcl= new Scanner(System.in); 
        System.out.println("Pon un numero");
        valor=tcl.nextInt();
        System.out.println("Pon otro numero");
        valor1=tcl.nextInt();
        result= valor+valor1;
        System.out.println("La suma es"+ result);
        
      }   
  
      
}
