/*
 6.a.- Se va a implementar un simulador de Vehículos. Existen dos tipos de Vehículo: Coche y Camión. 
 * a) Sus características comunes son la matrícula y la velocidad. 
 * En el momento de crearlos, la matrícula se recibe por parámetro y la velocidad se inicializa a 0. 
 * El método toString() de los vehículos devuelve información acerca de la matrícula y la velocidad.
 * Además se pueden acelerar, pasando por parámetro la cantidad en km/h que se tiene que acelerar.
 */
package POLIMORFISMO;

public class Vehiculo {

    private String matricula;
    private double velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        velocidad = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String toString() {
        return "Matricula: " + matricula + "\nVelocidad: " + velocidad + "\n";
    }
//Ojo! trows DemasiadoRapidoException es requerido en ñla superclase
    //por ser un método redefinido  en la subclase camion   
    public void acelerar(double acelerar) throws DemasiadoRapidoException {
        velocidad += acelerar;
    }
}
