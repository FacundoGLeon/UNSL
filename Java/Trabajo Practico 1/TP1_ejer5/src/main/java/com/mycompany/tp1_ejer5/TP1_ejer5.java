/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejer5;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TP1_ejer5 {

    public static void main(String[] args) {
      Scanner numeros = new Scanner(System.in);  
      float a,b;
       System.out.println("Ingrese el primer numero:");
       a = numeros.nextFloat();
       System.out.println("Ingrese el segundo numero:");
       b = numeros.nextFloat();
        
       System.out.println("la suma entre a="+a+" y b="+b+" es: "+(a+b)); 
       System.out.println("la resta entre a="+a+" y b="+b+" es: "+(a-b)); 
       System.out.println("la multiplicacion entre a="+a+" y b="+b+" es: "+(a*b)); 
       System.out.println("la division entre a="+a+" y b="+b+" es: "+(a/b)); 
        
        
   
    }
}
