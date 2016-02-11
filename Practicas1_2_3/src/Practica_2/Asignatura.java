/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_2;

/**
 *
 * @author mati
 */
public class Asignatura {
     private double cali;
    private int id;
    
    public Asignatura (int p){
       id = p;
    } 
     public void setcali (double a){
        cali=a;
        
    }
     public double getid (){
        return id;
    }
     public double getcali (){
        return cali;
     }
}
