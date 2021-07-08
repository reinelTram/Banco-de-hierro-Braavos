/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaBancario;



/**
 *
 * @author RT
 */
public class Cuentas {
    
    private int numeroCuenta;
    private double saldoCuenta;
    private Cuentas[] cuenta;

    public Cuentas(Cuentas[] cuenta) {
        this.cuenta = cuenta;
    }
    
    

    public Cuentas(int numeroCuenta, double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public Cuentas() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    
    public int obtenerNumeroCuenta(){
        double numeroCuenta=100+Math.random() * 900;
        return (int) numeroCuenta;
    }
    
    public void imprimirVector(){
        System.out.println("Los elementos del vector son");
        for(int k=0;k<cuenta.length;k++)
            System.out.print(cuenta[k].getNumeroCuenta() + " ");
    }
    
    public int consignarDinero(){
        int nuevoSaldo=0;
               
        
        return nuevoSaldo;
    }
    
    public int retirarDinero(){
        int nuevoSaldo=0;
        
        return nuevoSaldo;
    }
    
    
    
    
    
    
}
