/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejer6;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class TP1_ejer6 {

   public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in); 
        int [] a=new int[5];
        int i;
        for(i=0;i<5;i++){
            System.out.println("Ingrese Numero: "+(i+1));
            a[i] = teclado.nextInt();
        }
        System.out.print("Datos Ingresados: ");
        for(i=0;i<5;i++){
            System.out.print(a[i]+", ");
        
        
        }
        System.out.println("");
        System.out.print("Datos invertidos y duplicados: ");
        
        for(i=4;i>=0;i--){
            System.out.print((a[i]*2)+", ");
        
        
        }
    }
}
