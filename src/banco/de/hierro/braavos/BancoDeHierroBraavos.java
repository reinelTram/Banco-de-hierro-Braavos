/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.de.hierro.braavos;

import java.util.Scanner;
import usuariosBanco.Clientes;
import sistemaBancario.Cuentas;

/**
 *
 * @author RT
 */
public class BancoDeHierroBraavos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] productos = new String[10];
        Scanner input = new Scanner(System.in);
        int opcion;
        int numeroProducto = 0;
        String nombreUsuario, apellidoUsuario, cedulaUsuario;
        System.out.println("*********** BANCO DE HIERRO DE LA ISLA DE BRAAVOS ***********");
        System.out.println("**************************************************");
        Clientes[] cliente = new Clientes[1];

        for (int i = 0; i < cliente.length; i++) {
            cliente[i] = new Clientes();
            System.out.print("Bienvenido por favor digite su Nombre ");
            cliente[i].setNombreCliente(input.next());
            System.out.print("Digite su Apellido: ");
            cliente[i].setCedulaCliente(input.next());
            System.out.println("Digite su cédula: ");
            cliente[i].setCedulaCliente(input.next());

        }
        String nombreCliente = cliente[0].getNombreCliente();

        do {
            System.out.println("**************************************************");
            System.out.println("*********** BANCO DE HIERRO DE LA ISLA DE BRAAVOS ***********");
            System.out.println("**** 1.Agregar una cuenta a su nombre");
            System.out.println("**** 2.Ver cuentas asociadas a su nombre");
            System.out.println("**** 3.Consignar a una cuenta en especifico");
            System.out.println("**** 4.Retirar dinero de una cuenta especifica");
            System.out.println("**** 5.Consultar el saldo de una de sus cuentas");
            System.out.println("**** 6.salir");
            System.out.println("**************************************************");
            System.out.println("Señor " + nombreCliente + " Por favor digite la opcion deseada: ");
            opcion = input.nextInt();

            Cuentas[] cuenta = new Cuentas[5];

            switch (opcion) {

                case 1:
                    int contadorCuentas = 0;
                    for (int i = 0; i < cuenta.length; i++) {
                        cuenta[i] = new Cuentas();
                        System.out.println("Su numero de cuenta es: ");
                        int numeroCuenta = cuenta[i].obtenerNumeroCuenta();
                        cuenta[i].setNumeroCuenta(numeroCuenta);
                        System.out.println(numeroCuenta);
                        System.out.println("Ingrese el saldo de su cuenta ");
                        cuenta[i].setSaldoCuenta(input.nextInt());
                        contadorCuentas++;

                        System.out.println(contadorCuentas);

                    }
                    /*}else{
                        System.out.println("ha superado el numero de cuentas permitidas");
                    }*/

                    break;

                case 2:
                    for (int i=0; i<cuenta.length;i++){
                        cuenta[i].imprimirVector();
                    }                  
                    break;

                case 3:
                    System.out.println("Digite el numero de cuenta a la que quiere consignar");
                    int cuentaABuscar=input.nextInt();
                    for(int i=0;i<cuenta.length;i++){
                        if(cuentaABuscar==cuenta[i].getNumeroCuenta()){
                            System.out.println("Digite el valor a consignar: ");
                            double nuevoSaldo=cuenta[i].consignarDinero(input.nextInt());
                            cuenta[i].setSaldoCuenta(nuevoSaldo);
                        }else{
                            System.out.println("revise su numero de cuenta e intente de nuevo");
                        }
                    }

                    break;

                case 4:
                    System.out.println("Digite el numero de la que desea retirar");
                    cuentaABuscar=input.nextInt();
                    for(int i=0;i<cuenta.length;i++){
                        if(cuentaABuscar==cuenta[i].getNumeroCuenta()){
                            System.out.println("Digite el valor a retirar: ");
                            boolean nuevoSaldo=cuenta[i].retirarDinero(input.nextInt());
                            if(nuevoSaldo=true){
                                System.out.println("Por favor retire su dinero");
                            }else{
                                System.out.println("No cuenta con saldo suficiente para realizar esta acción ");                                
                            }
                            
                        }else{
                            System.out.println("revise su numero de cuenta e intente de nuevo");
                        }
                    }

                    break;

                case 5:
                    System.out.println("Digite el numero de cuenta a revisar el saldo");
                    cuentaABuscar=input.nextInt();
                    for(int i=0;i<cuenta.length;i++){
                        if(cuentaABuscar==cuenta[i].getNumeroCuenta()){
                            System.out.println("Digite el valor a consignar: ");
                            double saldo=cuenta[i].getSaldoCuenta();
                            System.out.println("Su saldo es: " + saldo);
                        }else{
                            System.out.println("revise su numero de cuenta e intente de nuevo");
                        }
                    }
                    break;

                case 6:
                    System.exit(0);
                    break;

            }

        } while (opcion != 6);
    }

}
