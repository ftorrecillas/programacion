/*
 6.b.- Utilizando las clases del ejercicio anterior, implementa una aplicación que haga lo siguiente: 
 */
package POLIMORFISMO;

public class E6_MAIN {

    public static void main(String[] args) {
        
        // a) Declare y cree un array de 4 vehículos. 
        //b) Cree 2 camiones y 2 coches y los añada al array. 
        
        Coche coche1 = new Coche("V-1234HT-", 5);
        Coche coche2 = new Coche("V-4657GW", 3);
        Camion camion1 = new Camion("4598-HGT");
        Camion camion2 = new Camion("5768-DHV");

        Vehiculo[] vehiculos = {coche1, coche2, camion1, camion2};

        //c) Suponiendo que no se sabe en qué celdas los coches y en cuáles los camiones:
        //1. Ponga un remolque de 5000 Kg a los camiones del array.

        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] instanceof Camion) {
                //Hacer un downcasting para poder utilizar el metodo del hijo
                         /*Importante los dos parentesis*/
                ((Camion) vehiculos[i]).ponRemolque(5000);
            }
        }

        //2. Acelere todos los vehículos.
        for (int i = 0; i < vehiculos.length; i++) {
            try {
                vehiculos[i].acelerar(110);
            } catch (Exception x) {
                System.out.println("Frena o quita el remolque!!!!");
            }
        }

        //3. Escriba por pantalla la información de todos los vehículos.
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i]);
        }
    }
}
