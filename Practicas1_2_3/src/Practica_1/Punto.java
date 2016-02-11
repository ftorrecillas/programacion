/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_1;

/**
 *
 * @author mati
 */
public class Punto {
    private double x, y;
    private Punto a;
    //constructor
    
    public Punto(double a, double b){
        x=a;
        y=b;
    } 
    public Punto(){
        x=0;
        y=0;
    } 
    
    public void setx (double a){
        x=a;
    }
    public void sety (double b){
        y=b;
    }
     public void setxy (double a){
        x=a;
        y=a;
    }
     public double getx (){
        return x;
    }
     public double gety (){
        return y;
     }
      public double calcularDistanciaDesde (Punto b){
          double inx=x-b.x;
          double iny=y-b.y;
          
        return Math.sqrt((Math.pow(inx, 2)+(Math.pow(iny, 2))));
    }
}
