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
public class Alumno {
    private Asignatura a, b, c;
    
     public Alumno (Asignatura e, Asignatura t, Asignatura z){
      a = e;
      b = t;
      c = z;
    } 
     public Alumno (int e, int t, int z){
      a = new Asignatura (e);
      b = new Asignatura (t);
      c = new Asignatura (z);
    } 
      public Asignatura geta (){
        return a;
    }
     public Asignatura getb (){
        return b;
     }
      public Asignatura getc (){
        return c;
     }
}
