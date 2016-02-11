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
public class Punto {
    private double x, y;
    
    //constructor
    public Punto(){
        x=0;
        y=0;
    } 
    public Punto(double a, double b){
        x=a;
        y=b;
    } 
    
    public Punto (double a){
        x=a;
        y=a;
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
      public void puntomedio(){
             double x1=0;
             double y1=0;
             double x2=5;
             double y2=3;
             double x3=2;
             double y3=-1;
             double x4=;
             double y4=;
             
            
        }
      public double distancia (double a, double b){
          double inx=this.x-a;
          double iny=this.y-b;
          
        return Math.sqrt((Math.pow(inx, 2)+(Math.pow(iny, 2))));
    }
      public double distanciaorigen (double a, double b){
          double inx=this.x-a;
          double iny=this.y-b;
          
        return Math.sqrt((Math.pow(inx, 2)+(Math.pow(iny, 2))));
    }
}
