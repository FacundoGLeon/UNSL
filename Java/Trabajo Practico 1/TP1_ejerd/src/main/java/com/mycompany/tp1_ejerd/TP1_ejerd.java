/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejerd;

import java.util.Scanner;

public class TP1_ejerd {
    final static int IVA = 21;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float precio;
        do{
            System.out.println("Ingrese el Precio del Producto: ");
            precio = teclado.nextFloat();
        }while(precio<=0);
        precio = precio + (IVA*precio/100);
        System.out.println("Precio del Producto mas IVA: "+precio);
        
        
    }
}
