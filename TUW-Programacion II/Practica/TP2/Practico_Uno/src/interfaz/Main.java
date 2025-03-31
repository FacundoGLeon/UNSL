/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz;

import java.util.Scanner;
import practico2.Cliente;
import practico2.Compra;
import practico2.CuentaCorriente;
import practico2.Gerbil;
import practico2.Hamster;
import practico2.Kiosco;
import practico2.Persona;
import practico2.Pixel;
import practico2.Raton;
import practico2.Roedor;

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
                                +"\n<3> Ejercicio 3, 4, 5, y 6."
                                +"\n<7> Ejercicio 7."
                                +"\n<8> Ejercicio 8."
                                +"\n<9> Ejercicio 9."
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
                case 7: ejercicio7(); break;
                case 8: ejercicio8(); break;
                case 9: break;
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
                                +"\n<1> Realizar compra."
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
    
    public static void ejercicio7(){
        Scanner teclado = new Scanner(System.in);
        int opcion=1;
        Pixel p = null;
        int x,y,color,valor;
        while(opcion!=0){
            System.out.println("Indique la accion:"
                                +"\n<1> Crear Instancia Pixel."
                                +"\n<2> Trasladar Pixel."
                                +"\n<3> Cambiar de Color."
                                +"\n<4> Mostrar Pixel."
                                +"\n<0> Salir.");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: 
                    if(p!=null){
                        System.out.println("Ya se ha creado la Intancia.");
                        break;
                    }
                    System.out.println("Ingrese valor de coordenada x:");
                    x = teclado.nextInt();
                    System.out.println("Ingrese valor de coordenada y:");
                    y = teclado.nextInt();
                    System.out.println("Ingrese color del Pixel:");
                    do{
                        System.out.println("[0-255]");
                        color = teclado.nextInt();
                    }while(color<0 || color>255);
                    p = new Pixel(x,y,color);
                    break;
                case 2:
                    int opc=1;
                    if(p==null){
                        System.out.println("Primero debe crear la Instancia");
                        break;
                    }
                    System.out.println("Indique hacia donde quiero trasladar el pixel:");
                    System.out.println("<1> Hacia la IZQUIERDA");
                    System.out.println("<2> Hacia la DERECHA");
                    System.out.println("<3> Hacia ARRIBA");
                    System.out.println("<4> Hacia ABAJO");
                    System.out.println("<5> No Trasladar");
                    opc = teclado.nextInt();
                    while(opc < 0 || opc > 5){
                        System.out.println("Ingrese un valor valido:");
                        opc = teclado.nextInt();
                    }
                    if(opc!=5){
                        System.out.println("Ingrese la cantidad de posiciones que desea mover el pixel:");
                        valor = teclado.nextInt();
                        p.trasladar(opc, valor);
                    }
                    break;
                case 3: 
                    if(p==null){
                        System.out.println("Primero debe crear la Instancia");
                        break;
                    }
                    System.out.println("Ingrese el valor del color al que desea cambiar");
                    do{
                        System.out.println("[0-255]");
                        color = teclado.nextInt();
                    }while(color<0 || color>255);
                    p.setColor(color);
                    break;
                case 4: 
                    if(p==null){
                        System.out.println("Primero debe crear la Instancia");
                        break;
                    }
                    System.out.println("Datos de Pixel:");
                    System.out.println(p.toString());
                    break;
                case 0: 
                    System.out.println("...");
                    break;
                default: System.out.println("Ingrese un valor valido.");break;
            }
            
        }
        
    }
    
    public static void ejercicio8(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de roedores a crear: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Roedor[] roedores = new Roedor[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nSeleccione el tipo de roedor:");
            System.out.println("1. Ratón");
            System.out.println("2. Gerbil");
            System.out.println("3. Hamster");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Ingrese el nombre del roedor: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la edad del roedor (en meses): ");
            int edad = scanner.nextInt();
            System.out.print("Ingrese el peso del roedor (en gramos): ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1: roedores[i] = new Raton(nombre, edad, peso); break;
                case 2: roedores[i] = new Gerbil(nombre, edad, peso); break;
                case 3: roedores[i] = new Hamster(nombre, edad, peso); break;
                default:
                    System.out.println("Opción inválida. Se asignará un Ratón por defecto.");
                    roedores[i] = new Raton(nombre, edad, peso);
            }
        }
        System.out.println("\nMostrando el comportamiento de los roedores:");
        for (Roedor roedor : roedores) {
            roedor.mostrarInfo();
            roedor.comer();
            roedor.moverse();
            System.out.println("----------------");
        }

        
    }
}
