/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico1;

/**
 *
 * @author facun
 */
public class Fibonacci {
    public static void SerieFibonacci(int cant){
        int a=0 ,b=1,i=0;
        System.out.println("Serie de Fibonacci: Cantidad ("+cant+")");
        while(i<cant){
            System.out.println(b);
            a=a+b;
            System.out.println(a);
            b=a+b;
            i=i+2;
        }
    }
    
    public static void FooBarBaz(int cant){
        String mensaje = "";
        int i;
        System.out.println("FooBarBaz:");
        for(i=1;i<=cant;i++){
            if(i%3==0){
                mensaje = mensaje + "Foo "; 
            }
            if(i%5==0){
                mensaje = mensaje + "Bar ";
            }
            if(i%7==0){
                mensaje = mensaje + "Baz ";
            }
            System.out.println(i+" "+mensaje);
            mensaje = "";
        }
    }
}
