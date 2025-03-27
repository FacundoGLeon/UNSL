/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejer9;

import java.util.Scanner;

/**
 *
 * @author facun
 */
public class TP1_ejer9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String let;
        char opc;
        char [] listado = new char[26];
        int [] abec = new int[26];
        int k,i,ascii=97;
        boolean cond = true;
        for(i=0;i<26;i++){
            listado[i] = (char)ascii;
            ascii++;
        }
        System.out.println("Cuantas veces quiere que se repita una letra para detener el programa?");
        do{
            System.out.println("Desde 2 Hasta 10: ");
            k = teclado.nextInt();
        }while(k<2 || k>10);
        
        while(cond){
            do{
            System.out.println("Ingrese Letra: ");
            let = teclado.next();
            opc = let.charAt(0);
            if(opc<'a' || opc>'z')System.out.println("SOLAMENTE LETRAS...[a-z]:");
            }while(opc<'a' || opc>'z');
            for(i=0;i<abec.length;i++){
                if(opc==listado[i]){
                    abec[i]++;
                }
            }
            
            for(i=0;i<abec.length;i++){
                if(abec[i]==k)
                    cond = false;
            }
        }
        System.out.println("");
        System.out.println("Listado de Letras: ");
        for(i=0;i<abec.length;i++){
            if(abec[i]!=0){
                System.out.println(listado[i]+" = "+abec[i]+";");
            }    
           
        }
    }
}

