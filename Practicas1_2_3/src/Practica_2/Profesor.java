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
public class Profesor {
    public static void ponerNota(Alumno param){
        param.geta().setcali(Math.random()*10);
        param.getb().setcali(Math.random()*10);
        param.getc().setcali(Math.random()*10);  //el Parametro de tipo alumno llama al metodo getc(de la clase Alumno) que le da la 
        //envia una variable de tipo asignatura por esta razon, este a su vez podemos llamar al metodo setcali de la clase Asignatura.
     }
    public static double calcularMedia(Alumno param){
        
        return (param.geta().getcali()+ param.getb().getcali()+ param.getc().getcali())/3;
     }
}
