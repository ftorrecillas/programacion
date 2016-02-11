/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movil;


/**
 *
 * @author mati
 */
public class EjecutarMovil {
    public static void main (String args[]) {
        Movil pu=new Movil(3.5);
        Movil pu1=new Movil(4);
        Movil pu2=new Movil(6.2);
        
        System.out.println("Punto con t=3.5 es "+  pu.getx()+" "+pu.gety());
        System.out.println("Punto con t=4 es "+  pu1.getx()+" "+pu1.gety());
        System.out.println("Punto con t=3.5 es "+  pu2.getx()+" "+pu2.gety());
    }
}

