/*
 c) Los camiones tienen un atributo de tipo Remolque que inicializa a null (para indicar que no tiene remolque)
 * . Además tiene un método ponRemolque(), que recibe el Remolque por parámetro, 
 * y otro quitaRemolque(). Cuando se muestre la información de un camión que lleve remolque, 
 * además de la matrícula y velocidad del camión, debe aparecer la información del remolque.
 * 
 * d) En esta clase hay que sobrescribir el método acelerar de manera que si el camión tiene remolque y 
 * la velocidad más la aceleración superan los 100 km/h se lance una excepción de tipo DemasiadoRapidoException.
 */
package POLIMORFISMO;

public class Camion extends Vehiculo {

    private Remolque remolque = null;

    public Camion(String matricula) {
        super(matricula);
    }

    public void ponRemolque(int remolque) {
        this.remolque = new Remolque(remolque);
    }

    public void quitaRemolque() {
        this.remolque = null;
    }
    
    public void acelerar(double aceleracion) throws  DemasiadoRapidoException{
        if(super.getVelocidad()+aceleracion>100 && remolque != null){
            DemasiadoRapidoException error=new DemasiadoRapidoException("Frena o quita el remolque!!!!");
            throw error;
        }
    }

    public String toString() {

        if (remolque == null) {
            return super.toString();
        } else {
            return super.toString() + remolque.toString();
        }

    }
}
