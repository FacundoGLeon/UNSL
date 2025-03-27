/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico1;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class Practico_Uno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        while(opcion != 0){
            System.out.println("\nSeleccione el numero del ejercicio a ejecutar\n"
                                +"<5> Ejercicio 5.\n"
                                +"<6> Ejercicio 6.\n"
                                +"<7> Ejercicio 7.\n"
                                +"<8> Ejercicio 8.\n"
                                +"<9> Ejercicio 9.\n"
                                +"<10> Ejercicio 10.\n"
                                +"<11> Ejercicio 11.\n"
                                +"<12> Ejercicio 12.\n"
                                +"<13> Ejercicio 13.\n"
                                +"<15> Ejercicio 15.\n"
                                +"<0> Salir.\n");
            System.out.print("Ingrese: ");
            opcion = teclado.nextInt();
            System.out.println("");
            switch(opcion){
                case 0: System.out.println("..."); break;
                case 5:
                    ComparaNum may = new ComparaNum();
                    System.out.println("Ingrese un numero x:");
                    int x = teclado.nextInt();
                    System.out.println("Ingrese un numero y:");
                    int y = teclado.nextInt(); 
                    String mensaje = may.mayor(x,y)?"El numero "+x+" es mayor por dos o mas que el numero "+y+".":"El numero "+x+" no es mayor que el numero "+y+".";
                    System.out.println(mensaje);
                    break;
                case 6: 
                    ConvPulgadas pulg = new ConvPulgadas();
                    pulg.conversion(teclado); break;
                case 7: 
                    Cheque cheque;
                    String numero;
                    do{
                        System.out.println("Ingrese un numero de 10 digitos:");
                        numero = teclado.next();
                        cheque = new Cheque(numero);
                    }while(!cheque.controlCheque());
                    if(cheque.esFalso()){
                        System.out.println("El cheque es verdadero.");
                    }else{
                        System.out.println("El cheque es falso.");
                    }
                    break;
                case 8: 
                    int [] conjunto1 = {1,3,5,7,8};
                    int [] conjunto2 = {2,3,5,6,8,10};
                    Conjunto conj1 = new Conjunto(conjunto1);
                    Conjunto conj2 = new Conjunto(conjunto2);
                    conj1.mostrar();
                    conj2.mostrar();
                    System.out.println("Interseccion:");
                    Conjunto.interseccion(conj1, conj2).mostrar();
                    break;
                case 9: 
                    int años;
                    do{
                       System.out.println("Ingrese la cantidad de Años que tiene: ");
                       años = teclado.nextInt(); 
                    }while(años<=0);
                    Persona per = new Persona(años);
                    per.segundoVividos();
                    break;
                case 10: 
                    float tempF;
                    System.out.println("Ingrese la temperatura en Fahrenheit: ");
                    tempF = teclado.nextFloat();
                    Temperatura temperatura = new Temperatura(tempF);
                    temperatura.mostrarTempC();
                    break;
                case 11: 
                    double catetoAd;
                    double catetoOp;
                    System.out.println("Ingrese el valor del cateto Adyacente:");
                    catetoAd = Math.abs(teclado.nextDouble());
                    System.out.println("Ingrese el valor del cateto Opuesto:");
                    catetoOp = Math.abs(teclado.nextDouble());
                    Triangulo triangulo = new Triangulo(catetoAd,catetoOp);
                    triangulo.mostrarTriangulo();
                    break;
                case 12: 
                    int mes;
                    int año;
                    System.out.println("Ingrese mes y anio para determinar cuantos dias tiene dicho mes:");
                    System.out.print("Mes: ");
                    mes = teclado.nextInt();
                    System.out.print("\nAnio: ");
                    año = teclado.nextInt();
                    System.out.println();
                    if(Año.diasMes(mes, año)!=0){
                        System.out.println("El Mes "+mes+" del Anio "+año+" tiene "+Año.diasMes(mes, año)+" Dias.");
                    }else{
                        System.out.println("Mes Invalido");
                    }
                    break;
                case 13: 
                    Fibonacci.SerieFibonacci(20);
                    System.out.println("");
                    Fibonacci.FooBarBaz(50);
                    break;
                case 15: 
                    A b = new A ( );
                    b.y = b.x;
                    b.f (b.y);
                    b.g ( );
                    System.out.println (b.x[0] + " " + b.x[1]); //(1)
                    System.out.println (b.y[0] + " " + b.y[1]); //(2)
                    
                    break;
                default: System.out.println("INGRESE CORRECTAMENTE.");
            }
        }
        
       teclado.close();
    }
    
    













}
