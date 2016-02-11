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
public class GestionHostipal {
    public static void main(String[] args)
{
Archivador documento = new Archivador();
Ficha f = new Ficha("Nombre1","Apellidos1",22);
documento.guardar(f);
documento.guardar(new Ficha("Nombre2","Apellidos2",12));
documento.guardar(new Ficha("Nombre3","Apellidos3",34));
documento.listar();
documento.eliminar(f);
documento.listar();
System.out.println(f.toString());
System.out.println(f);
}
}
