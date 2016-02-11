/*
 4.b.- La clase CocheCambioManual sobrescribe el método cambiaMarcha() y 
 * lo hace público, para que pueda ser llamado desde cualquier clase.
 * No permite que se cambie a una marcha negativa.
 */
package AMBITOSyVISIBILIDAD;

public class CocheCambioManual extends Coche {

    //Debemos crear un constructor que llame al constructor de la superclase
    public CocheCambioManual(String matricula) {
        super(matricula);
    }

    public void cambiarMarcha(int marcha) throws Exception {
        if (marcha < 0) {
            throw new Exception("La marcha no puede ser negativa");
        } else {
            this.marcha = marcha;
        }

    }
}
