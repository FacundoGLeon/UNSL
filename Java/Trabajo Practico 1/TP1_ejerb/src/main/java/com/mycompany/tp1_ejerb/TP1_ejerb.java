/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejerb;

import java.util.Scanner;

public class TP1_ejerb {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingrese Primer Numero: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese Segundo Numero: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese Tercer Numero: ");
        num3 = teclado.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println("Numero Menor Ingresado: "+num1);
        }
        else{
            if(num2<num3){
                System.out.println("Numero Menor Ingresado: "+num2);
            }
            else{
                System.out.println("Numero Menor Ingresado: "+num3);
            }
        }
    }
}
