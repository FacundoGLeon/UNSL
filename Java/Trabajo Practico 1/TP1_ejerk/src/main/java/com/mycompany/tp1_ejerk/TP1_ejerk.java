/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejerk;

import java.util.Scanner;


public class TP1_ejerk {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un Numero: ");
        num = teclado.nextInt();
        System.out.println("El Numero Ingresado es "+(num<0?"Negativo":"Positivo"));
    }
}
