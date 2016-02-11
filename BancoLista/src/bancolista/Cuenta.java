/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancolista;

/**
 *
 * @author mati
 */
public class Cuenta {
    private String nombre;
    private String cuenta;
    private double saldo ;
    private double tipoDeInteres;

    public Cuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
        
    }
     public Cuenta() {
        
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void setTipoDeInteres(double tipoDeInteres) throws Exception  {
        try{
        if (tipoDeInteres>0)
        this.tipoDeInteres = tipoDeInteres;
        else 
           throw new Exception ("LOL");
        }catch 
        
    }
    
    
    
}
