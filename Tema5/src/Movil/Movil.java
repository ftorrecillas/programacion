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
public class Movil {
    private double x, y, v,t;
    
    //constructo
    public Movil(double a){
        x=2.1;
        y=5.2;
        v=2.4;
        t=a;
    } 
    public void setx (double a){
        x=a;
    }
    public void sety (double b){
        y=b;
    }
     public void setv (double l){
        v=l;
        
    }
      public void sett (double p){
        t=p;
        
    }
      public double getx (){
           
        return Math.cos((Math.atan(2)))*(v*t);
    }
       public double gety (){
           
        return Math.sin((Math.atan(2)))*(v*t);
    }
}
