/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp5_ejer4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author USUARIO
 */
public class TP5_ejer4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashSet<Integer> conj = new HashSet<Integer>();
        int opc=1,cont=0,num;
         while(opc!=4){
            do{
                System.out.println("1. Ingresar al Conjunto:");
                System.out.println("2. Consulta:");
                System.out.println("3. Muestra Conjunto:");
                System.out.println("4. Salir.");
                opc = teclado.nextInt();
            }while(opc<1 || opc>4);
            
            switch(opc){
                case 1: 
                    System.out.println("Ingresa un entero:");
                    num = teclado.nextInt();
                    if(conj.add(num)==false){
                        cont++;
                        System.out.println("El Numero Ya Esta Ingresado.");
                    }break;
                case 2:
                    System.out.println("Tamaño del Conjunto: "+conj.size());
                    System.out.println("Se trato de ingresar "+cont+" veces un mismo elemento");break;
                case 3:
                    System.out.println(conj);
                    break;
                case 4: break;
            }
    }
}
}