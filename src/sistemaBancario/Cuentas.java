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
    
    public  void imprimirVector(){
        System.out.println("Los numeros de cuenta asociados son");
        for(int k=0;k<cuenta.length;k++)
            System.out.print(cuenta[k].getNumeroCuenta() + " ");
    }
    
    public double consignarDinero(double dineroAConsignar){
        double nuevoSaldo=getSaldoCuenta()+dineroAConsignar;
 
        return nuevoSaldo;
    }
    
    public boolean retirarDinero(double dineroARetirar){
        
        if(dineroARetirar<=getSaldoCuenta()){
            double nuevoSaldo=getSaldoCuenta()-dineroARetirar;
            return true;
            
        }else
            return false;
    }
    
    
    
            
    
    
    
    
}
