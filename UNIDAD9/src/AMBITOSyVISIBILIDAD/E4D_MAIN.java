/*
 4.d.- Escribe una aplicación que pida por teclado la matrícula de un coche
 * y pregunte si el coche es con cambio automático o no. 
 * Posteriormente, debe crear un coche con las características 
 * indicadas por el usuario y mostrarlo. 
 * Acelerar el coche en 60 km/h, si es un coche con cambio manual, 
 * cambiar la marcha a tercera y volverlo a mostrar.
 */
package AMBITOSyVISIBILIDAD;

import java.util.*;

public class E4D_MAIN {

    public static void menu() {
        System.out.println("\n======= TIPO DE CAMBIO =======");
        System.out.println("");
        System.out.println("1. Cambio Automático");
        System.out.println("2. Cambio Manual");
        System.out.println("0. Salir");
        System.out.println("");
        System.out.print("Selecciona una opción:");
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = -1;
        String matricula;

        System.out.print("Introduce matricula: ");
        matricula = lector.nextLine();
        menu();
        //Creo el vehiculo
        Coche vehiculo = null; //=new Coche(matricula);

        try {
            opcion = lector.nextInt();

        } catch (InputMismatchException numeroEntero) {
            System.out.println("La opción debe ser un número");
        }
        switch (opcion) {
            case (0):
                System.out.println("\nCerrando......");
                break;
            case (1):
                //Hago upcasting creando un objeto de la clase coche, se lo asigno a un objeto hijo.
                vehiculo = new CocheCambioAutomatico(matricula);
                break;
            case (2):
                //Hago upcasting creando un objeto de la clase coche, se lo asigno a un objeto hijo.
                vehiculo = new CocheCambioManual(matricula);
                break;
            default:
                System.out.println("Opción Incorrecta!!!");
        }
        System.out.println(vehiculo);
        vehiculo.acelerar(60);

        //Si el vehiculo es manual
        //instanceof sirve para comparar clases

        if (vehiculo instanceof CocheCambioManual) {
            try {
                vehiculo.cambiarMarcha(3);
            } catch (Exception e) {
                System.out.println("Problemas con el cambio de marcha");
            }
        }
        /*
         //Si el coche es AUTOMÄTICO. Esto no lo pide
         if (vehiculo instanceof CocheCambioAutomatico) {
         try {
         System.out.println(vehiculo);
         vehiculo.acelerar(30);
         System.out.println(vehiculo);
         vehiculo.acelerar(45);
         } catch (Exception e) {
         System.out.println("Problemas con el cambio automático");
         }
         }
         */
        System.out.println(vehiculo);
    }
}
