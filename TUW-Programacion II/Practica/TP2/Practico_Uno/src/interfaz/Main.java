/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz;

import java.util.Scanner;
import practico2.Cliente;
import practico2.Compra;
import practico2.CuentaCorriente;
import practico2.Kiosco;
import practico2.Persona;

/**
 *
 * @author facun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kiosco compras = new Kiosco(100);
        Scanner teclado = new Scanner(System.in);
        int opcion=1;
        while(opcion!=0){
            System.out.println("\nMENU"
                                +"\n<1> Ejercicio 1."
                                +"\n<2> Ejercicio 2."
                                +"\n<3> Ejercicio 3 4 5 y 6."
                                +"\n<7> Ejercicio 4."
                                +"\n<8> Ejercicio 5."
                                +"\n<9> Ejercicio 6."
                                +"\n<0> Salir.");
            System.out.print("Ingrese opcion: ");
            opcion = teclado.nextInt();
            System.out.println("\n");
            switch(opcion){
                case 0: System.out.println("..."); break;
                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3_4_5_6(compras);
                    //crear cliente
                    //inicializar compra
                    //agregar productos
                    break;
                case 4: break;
                case 5: break;
                case 6: break;
                default: System.out.println("Ingrese una opcion valida.");break;
            }
        }
        teclado.close();
        
    }
    
    public static void ejercicio1(){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int edad;
        String domicilio;
        String estadoCivil;
        Persona per1,per2;
        System.out.println("Ingrese datos de la Persona 1");
        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese edad: ");
        edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese domicilio: ");
        domicilio = teclado.nextLine();
        System.out.println("Ingrese estado civil: ");
        estadoCivil = teclado.nextLine();
        per1 = new Persona(nombre, edad, domicilio, estadoCivil);
        
        System.out.println("Ingrese datos de la Persona 2");
        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese edad: ");
        edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese domicilio: ");
        domicilio = teclado.nextLine();
        System.out.println("Ingrese estado civil: ");
        estadoCivil = teclado.nextLine();
        per2 = new Persona(nombre, edad, domicilio, estadoCivil);
        
        System.out.println("\nPersona 1:");
        System.out.println(per1.toString());
        System.out.println("\nPersona 2:");
        System.out.println(per2.toString());
    }
    
    public static void ejercicio2(){
        Scanner teclado = new Scanner(System.in);
        int numeroCtaCte;
        String nombreCliente;
        float dineroDepositado;
        float dineroAdeudado;
        
        System.out.println("Datos de la cuenta 1");
        System.out.println("Ingrese numero de la Cuenta Corriente:");
        numeroCtaCte = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese Nombre del Cleinte:");
        nombreCliente = teclado.nextLine();
        System.out.println("Ingrese cantidad de dinero depositado:");
        dineroDepositado = teclado.nextFloat();
        System.out.println("Ingrese cantidad de dinero Adeudado:");
        dineroAdeudado = teclado.nextFloat();
        CuentaCorriente cta1 = new CuentaCorriente(numeroCtaCte, nombreCliente,dineroDepositado,dineroAdeudado);
        
        System.out.println("Datos de la cuenta 2");
        System.out.println("Ingrese numero de la Cuenta Corriente:");
        numeroCtaCte = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese Nombre del Cleinte:");
        nombreCliente = teclado.nextLine();
        System.out.println("Ingrese cantidad de dinero depositado:");
        dineroDepositado = teclado.nextFloat();
        System.out.println("Ingrese cantidad de dinero Adeudado:");
        dineroAdeudado = teclado.nextFloat();
        CuentaCorriente cta2 = new CuentaCorriente(numeroCtaCte, nombreCliente,dineroDepositado,dineroAdeudado);
        
        System.out.println("Cuenta 1:");
        System.out.println("Nombre: "+cta1.getNombreCliente());
        System.out.println("Numero de Cuenta: "+cta1.getNumeroCtaCte());
        System.out.println("Saldo: $"+cta1.calcularSaldo());
        
        System.out.println("Cuenta 2:");
        System.out.println("Nombre: "+cta2.getNombreCliente());
        System.out.println("Numero de Cuenta: "+cta2.getNumeroCtaCte());
        System.out.println("Saldo: $"+cta2.calcularSaldo());
        
    
    }
    public static void ejercicio3_4_5_6(Kiosco compras){
        Scanner teclado = new Scanner(System.in);
        Cliente cliente;
        int idProducto;
        int cantidad;
        int maxProductos = 15;
        String nombre, direccion;
        int telefono;
        int opc=1;
        while(opc!=2){
            System.out.println("\nDesea realizar una accion: "
                                +"\n<0> Ver Monto Total de Todas las Compras."
                                +"\n<1> realizar compra."
                                +"\n<2> No"
                                +"\n<3> Mostrar Historial de Compras.");
            System.out.print("--> ");
            opc = teclado.nextInt();
            System.out.println("");
            switch(opc){
                case 2: System.out.println("..."); break;
                case 1: 
                    teclado.nextLine();
                    System.out.print("Ingrese nombre del cliente: ");
                    nombre = teclado.nextLine();
                    System.out.print("Ingrese dirección del cliente: ");
                    direccion = teclado.nextLine();
                    System.out.print("Ingrese teléfono del cliente: ");
                    telefono = teclado.nextInt();
                    cliente = new Cliente(nombre,direccion,telefono);
                    
                    Compra compra = new Compra(cliente, maxProductos);
                    
                    boolean seguirComprando = true;
                    while (seguirComprando) {
                        System.out.print("Ingrese ID del producto a comprar: ");
                        idProducto = teclado.nextInt();
                        System.out.print("Ingrese cantidad: ");
                        cantidad = teclado.nextInt();
                        teclado.nextLine(); // Consumir el salto de línea

                        compra.agregarProducto(idProducto, cantidad);

                        int opc2=0;
                        
                        while(opc2!=2 && opc2!=1){
                            System.out.println("Desea agregar otro producto?"
                                +"\n<1> Si."
                                +"\n<2> No");
                            opc2=teclado.nextInt();
                        }
                        if(opc2==2){
                            seguirComprando=false;
                        }
                        
                    }
                    compras.registrarCompra(compra);
                    
                    break;
                case 0: 
                    System.out.println("El monto total de todas las compras es: $"+ (compras.montoTotal()));
                    break;
                case 3: compras.mostrarCompras();break;
                default: System.out.println("Ingrese un valor valido.");
                
            }
        }
    }
}
