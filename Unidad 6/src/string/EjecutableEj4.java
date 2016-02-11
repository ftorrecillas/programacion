/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author mati
 */
public class EjecutableEj4 {
     public static void main (String args[]) {
        //Objeto clase punto
        Ej4 frase=new Ej4("esto1234es5678bueno900");
      
        System.out.println("Cambio de es por no por: "+   frase.getespor());
        System.out.println("Cambio de numeros por *: "+   frase.getasterisco());
    }
}
