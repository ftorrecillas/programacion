/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto;

/**
 *
 * @author mati
 */
public class EjecutablePunto {
    public static void main (String args[]) {
        Punto pu=new Punto(8, 4);
        Punto pu1=new Punto();
       
        System.out.println("Distancia entre puntos "+  pu.distancia(2, 1));
        System.out.println("Distancia desde el origen "+  pu1.distancia(2, 1));
    }
}
