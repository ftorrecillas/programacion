/*
 2.a.- Escribe una clase Punto () que contenga los siguientes métodos: a) los 
 * constructores y los métodos getX(), getY(), setX(), setY() y distancia() b) Un método toString() 
 * que devuelva la información del Punto de la siguiente manera (x,y).
 */
package REVISION;

public class Punto {

    private double x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Punto a) { //Método calcular distancia otro punto
        double distancia = Math.sqrt(Math.pow(this.getX() - a.getX(), 2) + 
                Math.pow(this.getY() - a.getY(), 2));
        return distancia;
    }

    public double distancia() {// Método que calcula distancia entre punto y origen
        double distancia = Math.sqrt(Math.pow(this.getX() - 0, 2) + 
                Math.pow(this.getY() - 0, 2));
        return distancia;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
