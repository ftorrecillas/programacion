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
public class Ej17 {
    
    public static void main ( String [] args){
	
        double dias, horas, minutos, x;
            Scanner intro = new Scanner(System.in);

            System.out.println ("Introduzca segundos");
            x = intro.nextDouble ();
            minutos = (x/60);
            horas= (x/3600);
            dias = (horas)/24;
            
         System.out.println( "minutos " +minutos +" \n horas "+ horas +"\n dias "+dias );
    }	
}
