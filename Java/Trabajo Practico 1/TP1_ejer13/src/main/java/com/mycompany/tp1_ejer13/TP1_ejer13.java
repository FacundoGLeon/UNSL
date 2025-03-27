/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejer13;

import java.util.Scanner;

public class TP1_ejer13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        char letra;
        int cont=0,i=0;
        System.out.println("Ingrese Cadena de caracteres: ");
        cadena = teclado.next();
        
        do{
            letra = cadena.charAt(i);
            if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u' || letra=='A' || letra=='E' || letra=='I' || letra=='O' || letra=='U'){
                cont++;
            }
            i++;
        }while(i < cadena.length());
        System.out.println("Cantidad de Vocales en la Cadena: "+cont);
        
        
    }
    
    
}
