/*
 * 2.b.- Utilizando la clase Punto del ejercicio anterior, escribe una clase Polígono. 
 * Esta clase tiene como atributo un array de objetos Punto. Se consideran adyacentes los objetos 
 * Punto que estén en celdas consecutivas del array y los puntos que están en la primera y última celda.
 * Esta clase ha de tener los siguientes métodos:
 * 
 * a) El constructor, recibirá por parámetro un array con los 
 * objetos Punto que definen el Polígono.
 * b) trasladar(), recibe por parámetro el desplazamiento en la 
 * coordenada x y el desplazamiento en la coordenada y. 
 * c) escalar(), recibe por parámetro el factor de 
 * escala para la coordenada x y el factor de escala para la coordenada y.
 * d) numVértices(), devuelve el 
 * número de vértices del Polígono. 
 * e) toString(), devuelve la información de los puntos del Polígono, uno 
 * en cada línea. 
 * f) perímetro(). Devuelve el perímetro del polígono.
 */

package REVISION;

public class Poligono {
    //Atributo array puntos

    private Punto[] punto;

    //a)Constructor
    public Poligono(Punto[] p) {
        this.punto = p;
    }

    //b) METODO TRASLADAR
    public void trasladar(int x, int y) {
        //Este método consiste en sumar a cada posicion del array el desplazamiento introducido en x y en y
        for (int i = 0; i < punto.length; i++) {
            punto[i].setX(punto[i].getX() + x);
            punto[i].setY(punto[i].getY() + y);
        }
    }

    //c)METODO ESCALAR
    public void escalar(int x, int y) {
        //Este método consiste en multiplicar a cada posicion del array el desplazamiento introducido en x y en y
        //Para reducirlo o aumentarlo aunque se deforme el poligono original
        for (int i = 0; i < punto.length; i++) {
            punto[i].setX(punto[i].getX() * x);
            punto[i].setY(punto[i].getY() * y);
        }
    }

    //d)numVertices()
    public int numVertices() {
        return punto.length;
    }

    //e)toString
    public String toString() {
        String res = "";

        for (int i = 0; i < punto.length; i++) {
            res = res + "Punto [" +i+ "]: " + punto[i].toString() + "\n";
        }
        return res;
    }

    //f)Perimetro
    public double perimetro() {
        double perimetro = 0;
        //Recorro el array de puntos menos el último
        for (int i = 0; i < punto.length - 1; i++) {
            perimetro = perimetro + punto[i].distancia(punto[i + 1]);
        }
        //Calculo distancia entre primer y ultimo punto
        perimetro = perimetro + punto[0].distancia(punto[punto.length - 1]);

        return perimetro;
    }
}
