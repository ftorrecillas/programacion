/*
 3.b.- Escribe una clase Película que herede de la clase Multimedia anterior.
 * La clase Película tiene, además de los atributos heredados, un actor principal y una actriz principal.
 * Se permite que uno de los dos sea nulo, pero no los dos. 
 * La clase debe tener dos métodos para obtener los dos nuevos atributos y debe sobrescribir el método toString()
 * para que devuelva, además de la información heredada, la nueva información.
 */
package HERENCIA;

public class PELICULA extends MULTIMEDIA {

    private String actorPrincipal, actrizPrincipal;

    public PELICULA(String titulo, String autor, format formato, String duracion, 
            String actorPrincipal, String actrizPrincipal) throws Exception {
        
        super(titulo, autor, formato, duracion);
        if ((actorPrincipal == null && actrizPrincipal == null)
                || (actorPrincipal.isEmpty() &&actrizPrincipal.length()==0)) {
            throw new Exception("Datos incorrectos. cuenta no creada");
        } else {
            this.actorPrincipal = actorPrincipal;
            this.actrizPrincipal = actrizPrincipal;
        }
    }
    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    public String toString() {
        return super.toString()+ "\nActor Principal: " + actorPrincipal 
                + "\nActriz Principal: " + actrizPrincipal;
    }
}
