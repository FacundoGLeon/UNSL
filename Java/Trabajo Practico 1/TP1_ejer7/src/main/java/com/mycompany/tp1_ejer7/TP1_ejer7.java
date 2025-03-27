/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejer7;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class TP1_ejer7 {

     public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner teclado = new Scanner(System.in);
        int n, i;
        
        
        do{
           System.out.println("Ingrese un numero entre 0 y 10:");
           n=teclado.nextInt();
        }while(n<=0 || n>=10);
        System.out.println("La Tabla de "+n+" es:");
        for(i=1;i<=10;i++){
            System.out.println(n+"x"+i+" = "+(i*n));
        
        }
    
   
    }
}
