/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_ejer9;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP_ejer9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Math2 real;
        int n,i;
        float [] reales;
        do{
            System.out.println("CUANTOS REALES DESEA INGRESAR?");
            n = teclado.nextInt();
        }while(n<2 || n>50);
        reales = new float[n];
        for(i=0;i<n;i++){
            System.out.println("INGRESE REAL");
            reales[i] = teclado.nextFloat();
        }
        real = new Math2(reales);
        System.out.println("VALOR MAXIMO: "+real.maximo());
        System.out.println("VALOR MINIMO: "+real.minimo());
        System.out.println("SUMATORIA: "+real.sumatoria());
        System.out.println("MEDIA ARITMETICA: "+real.mediaAritmetica());
        System.out.println("PROMEDIO ENTERO: "+real.promedioEntero());
    }
}
