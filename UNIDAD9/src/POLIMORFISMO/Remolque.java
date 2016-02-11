/*
 e) Hay que implementar la clase Remolque. 
 * Esta clase tiene un atributo de tipo entero que es el peso y cuyo valor se le da en el momento de crear el objeto.
 * Debe tener un método toString() que devuelva la información del remolque.
 */
package POLIMORFISMO;

public class Remolque {

    private int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Peso: " + peso + "\n";
    }
}
