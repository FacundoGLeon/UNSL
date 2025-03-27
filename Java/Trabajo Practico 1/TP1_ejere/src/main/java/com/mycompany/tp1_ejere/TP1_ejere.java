/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejere;

import java.util.Scanner;

public class TP1_ejere {
    final static int TAM = 50;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] nros = new int[TAM];
        int i=0,j,menor=0;
        System.out.println("Ingrese Secuencia de Numeros: ");
        do{
            System.out.println("Ingrese Numero: ");
            nros[i] = teclado.nextInt();
            i++;
        }while(nros[i-1]!=-1);
        
        for(j=0;j<i-1;j++){
            if(nros[j]<=nros[menor]){
                menor=j;
            
            }
         }
        System.out.println("El Numero Menor Ingresado es: "+nros[menor]);
    }
}
