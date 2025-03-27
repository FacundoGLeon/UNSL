/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp6_ejer4;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP6_ejer4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] num = {1,2,3,4,5};
        try{
            for(int i=0;i<num.length+1;i++){
                System.out.println("numero "+(i+1)+": "+num[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR: INDICE FUERA DEL RANGO DEL ARREGLO");
        }
        
        
        System.out.println("Hello World!");
    }
}
