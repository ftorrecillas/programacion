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
public class Ej19 {
    
    public static void main ( String [] args){
	
        double km1, litros, precio, litros2, precio2, km2, costekm, kmtotal, litrostot, preciomedio,preciototal, consumo;
        Scanner intro = new Scanner(System.in);
        System.out.println ("Introduzca kilometros, a continuación litros totales y por último precio gasolina");
        km1 = intro.nextDouble ();
        litros = intro.nextDouble ();
        precio = intro.nextDouble ();
        System.out.println ("Introduzca litros totales y precio gasolina");
        litros2 = intro.nextDouble ();
        precio2 = intro.nextDouble ();
        System.out.println ("Introduzca kilometros");
        km2 = intro.nextDouble ();
        kmtotal= km2-km1;
        preciototal= (precio2+precio);
        preciomedio = preciototal/2;
        litrostot= litros+litros2;
        consumo= (100*litrostot)/kmtotal;
        costekm = preciototal/kmtotal;
         System.out.println( "consumo medio a los 100 km " +consumo /*+" \n horas "+ horas +"\n dias "+dias */);
         System.out.println( "coste por km " +costekm /*+" \n horas "+ horas +"\n dias "+dias */);
    }
}
