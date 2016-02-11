/*
 4.c.- La clase CocheCambioAutomatico sobrescribe los métodos acelerar() y frenar() 
 * para que cambie automáticamente de marcha conforme se va acelerando y frenando.
 */
package AMBITOSyVISIBILIDAD;

public class CocheCambioAutomatico extends Coche {
    //Debemos crear un constructor que llame al constructor de la superclase

    public CocheCambioAutomatico(String matricula) {
        super(matricula);
    }

    @Override
    public void acelerar(double velocidad) {
        this.velocidad += velocidad;  //tsmbién puedo escribir super.velocidad 

        try {
            if (this.velocidad <= 20) {
                cambiarMarcha(1);
            } else if (this.velocidad >= 20 && this.velocidad <= 45) {
                cambiarMarcha(2);
            } else if (this.velocidad > 45 && this.velocidad <= 70) {
                cambiarMarcha(3);
            } else if (this.velocidad > 70 && this.velocidad <= 100) {
                cambiarMarcha(4);
            } else if (this.velocidad > 100 && this.velocidad <= 140) {
                cambiarMarcha(5);
            }
        } catch (Exception x) {
            System.out.println("Marcha negativa");
        }
    }

    @Override
    public void frenar(double velocidad) throws Exception {
        if (velocidad < 0 || this.velocidad < velocidad) {
            throw new Exception("La velocidad no puede ser negativa");
        } else {
            this.velocidad -= velocidad;
            try {
                if (this.velocidad <= 20) {
                    cambiarMarcha(1);
                } else if (this.velocidad >= 20 && this.velocidad <= 45) {
                    cambiarMarcha(2);
                } else if (this.velocidad > 45 && this.velocidad <= 70) {
                    cambiarMarcha(3);
                } else if (this.velocidad > 70 && this.velocidad <= 100) {
                    cambiarMarcha(4);
                } else if (this.velocidad > 100 && this.velocidad <= 140) {
                    cambiarMarcha(5);
                }
            } catch (Exception x) {
                System.out.println("Marcha negativa");
            }
        }
    }
}
