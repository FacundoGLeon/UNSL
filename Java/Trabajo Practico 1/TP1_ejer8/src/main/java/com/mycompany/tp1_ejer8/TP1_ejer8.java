/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejer8;

import java.util.Scanner;

public class TP1_ejer8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] num = new int[40];
        int i=0;
        do{
            System.out.println("Ingrese Numero: ");
            num[i] = teclado.nextInt();
            i++;
        }while((num[i-1]%2)!=0 && i<40);
        System.out.println("");
        System.out.println("Numeros Almacenados: ");
        for(int j=0;j<i;j++){
            System.out.println(num[j]);
        
        }
    }
}
