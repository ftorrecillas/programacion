/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author mati
 */
public class Ficha {

// Atributos
private String nombre = null;
private String apellidos = null;
private int edad = 0;

// Contructores
public Ficha(String param1, String param2, int param3){
nombre = param1;
apellidos = param2;
edad = param3;
}
// Métodos
public String toString(){
return "Nombre: " + nombre + " Apellidos: " + apellidos + " Eddad: " + edad;}
}

