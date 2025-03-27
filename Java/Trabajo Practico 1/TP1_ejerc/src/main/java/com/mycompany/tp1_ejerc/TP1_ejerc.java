/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejerc;

import java.util.Scanner;


public class TP1_ejerc {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero pertenenciente a la tabla ASCII: ");
        do{
        num = teclado.nextInt();
        }while(num<0 || num>255);
        System.out.println("El Numero "+num+" en la Tabla ASCII Pertenece al Caracter: "+(char)num);
        
    }
}
