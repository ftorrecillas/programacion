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
public class Circulo {
    private double  r;
    private Punto centrocir;
    //constructores
     public Circulo(Punto p, double b){
       centrocir = p;
        r=b;
    } 
    public Circulo(){
        centrocir = new Punto();
         r=1;
    } 
    public Circulo (double a, double b, double z){
      centrocir = new Punto(a,b);
        r=z;
    } 
    public void setr (double a){
        r=a;
    }
    public double getr (){
        return r;
    }
    /*public double getxceentro (){
        
        return ;
    }*/
    public Punto getcentro (){
        return centrocir;
     }
   /*  public double getcentroy (){
        return centrocir.gety();
     }*/
    /* public double calcularDistanciaDesde (Circulo p){
         double distx=  centrocir.getx()-p.getcentrox();
         double disty=  centrocir.gety()-p.getcentroy();

        return Math.sqrt((Math.pow(distx, 2)+(Math.pow(disty, 2))));
     }*/
     public double calcularDistanciaDesde (Punto p){
         return centrocir.calcularDistanciaDesde(p);
         
        /* double distx=  centrocir.getx()-p.
         double disty=  centrocir.gety()-p.gety();*/

       
     }
     public double calcularArea (){
        return     Math.PI*Math.pow(r, 2);
     }
     public double calcularPeímetro (){
        return     Math.PI*r*2;
     }
}
