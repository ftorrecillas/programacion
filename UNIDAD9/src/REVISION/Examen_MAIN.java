/*
 1.b.- Realiza una aplicación que cree un objeto de tipo Examen, lo muestre por
 * pantalla, modifique su fecha y hora y lo vuelva a mostrar por pantalla.
 */
package REVISION;

public class Examen_MAIN {

    public static void main(String[] args) {
        Fecha Hoy = new Fecha(17, 4, 2013);
        Hora Actual = new Hora(13, 47);

        Examen Programacion = new Examen("Programacion", "6J", Hoy, Actual);

        //Al mostrar el objeto se llama por defecto al método toString
        // como lo hemos sobrecargado sale con el formato deseado
        System.out.println(Programacion);
        //Modifico Hora
        Actual.setHora(12);
        Actual.setMinuto(22);
        System.out.println("=== MODIFICO HORA ===");
        System.out.println(Programacion);
        //Modifico Fecha
        Hoy.setDia(1);
        Hoy.setMes(12);
        Hoy.setAnyo(1987);
        System.out.println("=== MODIFICO FECHA ===");
        System.out.println(Programacion);

    }
}
