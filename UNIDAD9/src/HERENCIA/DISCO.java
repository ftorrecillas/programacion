/*
 3.f.- Escribe una clase Disco que herede de la clase Multimedia ya realizada. 
 * La clase Disco tiene, aparte de los elementos heredados, un atributo para almacenar 
 * el género al que pertenece (rock, pop, punk, etc.). La clase debe tener un método para obtener 
 * el nuevo atributo y debe sobrescribir el método toString() para que devuelva, además de la información heredada,
 * la nueva información.
 */
package HERENCIA;

public class DISCO extends MULTIMEDIA {

    private String genero;

    public DISCO(String titulo, String autor, format formato, String duracion, 
            String genero)  {
     
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return super.toString()+ "\nGénero: " + genero + "\n";
    }
}
