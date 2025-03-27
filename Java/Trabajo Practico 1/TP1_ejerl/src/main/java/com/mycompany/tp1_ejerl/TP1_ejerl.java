/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejerl;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class TP1_ejerl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] num = new int[10];
        int i;
        float media = 0;
        for(i=0;i<num.length;i++){
            System.out.println("Ingrese Numero: ");
            num[i] = teclado.nextInt();
        }
        for(i=0;i<num.length;i+=2){
            media += num[i];
        }
        media /= (num.length/2) ;
          System.out.println("La Media de los Numeros en Posiciones Pares del Arreglo es: "+media);
      
     }
}
