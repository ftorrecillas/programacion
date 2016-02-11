/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;
import 
java.util.ArrayList;
import 
java.util.Iterator;
/**
 *
 * @author mati
 */
public class Archivador {
    private  ArrayList pacientes =  new  ArrayList();
// Métodos
public void guardar(Ficha param)
{
    pacientes.add(param);
}
public void  eliminar(Ficha param)
{
    pacientes.remove(param);
}
public void listar()
{
    System.out.println(
    "Número de fichas: " + pacientes.size());
    Iterator it = pacientes.iterator();
    while(it.hasNext())
        System.out.println((Ficha)it.next());
}
}
