/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejerg;

import java.util.Scanner;

public class TP1_ejerg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float promedio=0;
        int  i, cant;
        do{
            System.out.println("Cuantas Calificaciones Desea Ingresar?");
            cant = teclado.nextInt();
        }while(cant<0);
        for(i=1;i<=cant;i++){
            System.out.println("Ingresar Calificacion "+i+":");
            promedio = promedio + teclado.nextFloat();
        
        }
        System.out.println("Promedio Total de Calificaciones: "+(promedio/cant));
    }
}
