/*
 2.c.- Escribe una aplicación en la que: 
 * a) Cree un Polígono de cuatro vértices, que serán (0,0), (2,0), (2,2), 
 * (0,2) y de color rojo. 
 * b) Muestra la información del polígono y su perímetro por pantalla. 
 * c) Trasladar el polígono 4 en el eje x y -3 en el eje y. 
 * e) Muestra la información del polígono por pantalla.
 */

package REVISION;

public class Poligono_MAIN {

    public static void main(String[] args) {

        //Creo puntos
        Punto a = new Punto(0, 0);
        Punto b = new Punto(2, 0);
        Punto c = new Punto(2, 2);
        Punto d = new Punto(0, 2);

        //Creo array puntos
        Punto[] arrayPuntos = {a, b, c, d};

        //Creo poligono
        Poligono poligono = new Poligono(arrayPuntos);

        //Muestro información poligono y perimetro
        System.out.println("=== INFORMACIÓN POLÍGONO ===");
        System.out.println(poligono);
        System.out.println("=== PERÍMETRO ===");
        System.out.println("Perimetro: " + poligono.perimetro() + "\n");

        //Traslado el poígono 4 en el eje x y -3 en el eje y
        poligono.trasladar(4, -3);

        //Muestro información poligono y perimetro
        System.out.println("=== INFORMACIÓN POLÍGONO ===");
        System.out.println(poligono);
        System.out.println("=== PERÍMETRO ===");
        System.out.println("Perimetro: " + poligono.perimetro());



    }
}
