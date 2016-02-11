/*
 3.a.- Escribe una clase Multimedia para almacenar información de objetos de tipo multimedia
 * (películas, discos, mp3...). Esta clase contiene título, autor, formato y duración como atributos. 
 * El formato puede ser uno de los siguientes: wav, mp3, midi, avi, mov, mpg, cdAudio y dvd. 
 * El valor de todos los atributos se pasa por parámetro en el momento de crear el objeto. 
 * Esta clase tiene, además, un método para devolver cada uno de los atributos y un método toString() 
 * que devuelve la información del objeto. Por último un método equals() que recibe un objeto de 
 * tipo Multimedia y devuelve true en caso de que el título y el autor sean iguales a los del 
 * objeto que llama al método y false en caso contrario.
 */
package HERENCIA;

public class MULTIMEDIA {
    private String titulo, autor, duracion;
    private format formato;

    public MULTIMEDIA(String titulo, String autor, format formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public format getFormato() {
        return formato;
    }

    public void setFormato(format formato) {
        this.formato = formato;
    }

    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nFormato: " + 
                formato + "\nDuración: " + duracion + "\n";
    }

    public boolean equals(MULTIMEDIA m) {
        boolean igual = false;

        if (m.getTitulo().equalsIgnoreCase(this.getTitulo()) && 
                m.getAutor().equalsIgnoreCase(this.getAutor())) {
            igual = true;
        } else {
            igual = false;
        }
        return igual;
    }
}
