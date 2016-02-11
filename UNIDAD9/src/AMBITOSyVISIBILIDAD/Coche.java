/*
 4.a.- Escribe una clase Coche de la que van a heredar CocheCambioManual y CocheCambioAutomatico.
 * Los atributos de los coches son la matrícula, la velocidad y la marcha. Para este ejercicio no se permite 
 * la marcha atrás, por tanto no se permiten ni velocidad negativa, ni marcha negativa. 
 * En el constructor se recibe el valor de la matrícula por parámetro y se inicializa el valor de la velocidad 
 * y la marcha a 0. Además tendrá los siguientes métodos: getMatrícula(): que devuelve el valor de la matrícula.
 * getMarcha(): devuelve el valor de la marcha. 
 * getVelocidad(): devuelve el valor de la velocidad. 
 * acelerar(): recibe por parámetro un valor al acelerar el coche. 
 * frenar(): recibe por parámetro un valor al frenar el coche. 
 * toString(): devuelve en forma de String la información del coche. 
 * cambiaMarcha(): recibe por parámetro la marcha a la que se tiene que cambiar el coche. 
 * Este método es protected, para que puedan acceder a él las clases que heredan de Coche, pero no las clases de otros paquetes.
 */
package AMBITOSyVISIBILIDAD;

public class Coche {

    private String matricula;
    protected double velocidad;
    protected int marcha;

    public Coche(String matricula) {
        this.matricula = matricula;
        velocidad = 0;
        marcha = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getMarcha() {
        return marcha;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void acelerar(double velocidad) {
        this.velocidad += velocidad;
    }

    public void frenar(double velocidad) throws Exception {
        if (velocidad < 0 || this.velocidad < velocidad) {
            throw new Exception("La velocidad no puede ser negativa");
        } else {
            this.velocidad -= velocidad;
        }
    }


    /* Este método es protected, para que puedan acceder a él las clases que heredan de Coche,
     * pero no las clases de otros paquetes.*/
    protected void cambiarMarcha(int marcha) throws Exception {
        if (marcha < 0) {
            throw new Exception("La marcha marcha no puede ser negativa");
        } else {
            this.marcha = marcha;
        }

    }

    public String toString() {
        return "Matricula: " + matricula + "\nVelocidad: " + velocidad + "\nMarcha: " + marcha + "\n";
    }
}
