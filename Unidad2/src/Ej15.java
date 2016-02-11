/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Ej15 {
       public enum DiaSemana {LUNES, MARTES, MIERCOLES, JUEVES, 
	VIERNES, SABADO, DOMINGO}
        public static void main ( String [] args){
	DiaSemana marte = DiaSemana.MARTES;
	DiaSemana ultimo= DiaSemana.DOMINGO;
	
	System.out.println( "Hoy es " +marte +"\n Y el ultimo dia de la semana es "+ultimo );
    }
}
