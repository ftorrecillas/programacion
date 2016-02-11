
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
public class Ej20 {
     public static void main (String args[]) {
       
         double porcentaje, intere, interefinal, ingreso, plazo, intereplazo, intereconrete;
         Scanner intro = new Scanner(System.in);
         System.out.println ("Introduzca su ingreso, a continuación su interes y por último el plazo de la inversión en meses:");
         ingreso = intro.nextDouble ();
         intere = intro.nextDouble ();
         plazo = intro.nextDouble ();
        
         porcentaje = (plazo*intere)/12;
         intereplazo = ingreso*(porcentaje/100);
         interefinal= intereplazo*0.82F;
         
         System.out.println("El plazo fijo en "+plazo+ " meses es "+  porcentaje+"%");
         intere = ingreso*porcentaje;
         System.out.println("El interes sin retención es "+  intereplazo+"€");
         intereconrete= porcentaje*0.82F;
         System.out.println("El porcentaje con restención es "+  intereconrete);
         System.out.println("El interes final es "+  interefinal+"€");
     }
}
