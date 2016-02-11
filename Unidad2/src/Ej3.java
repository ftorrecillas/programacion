
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
public class Ej3 {
    public static void main (String args[]) {
         int valor, valor1, result;
        Scanner tcl= new Scanner(System.in); 
        System.out.println("Pon nota primer parcial");
        valor=tcl.nextInt();
        System.out.println("Pon nota segundo parcial");
        valor1=tcl.nextInt();
        
        System.out.println("Programación:");
        System.out.println("Nota 1: "+valor);
        System.out.println("Nota 2: "+valor1);
        result= (valor+valor1)/2;
        System.out.println("La nota final es "+ result);
     }
}
