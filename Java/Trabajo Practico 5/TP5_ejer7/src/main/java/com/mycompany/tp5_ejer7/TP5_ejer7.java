/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp5_ejer7;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TP5_ejer7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<Character,Integer> conteo = new HashMap<Character,Integer>();
        String cadena;
        System.out.println("Ingrese una cadena de caracteres:");
        cadena = teclado.nextLine();
        for(int i=0;i<cadena.length();i++){
            if(conteo.containsKey(cadena.charAt(i))){
                conteo.put(cadena.charAt(i),conteo.get(cadena.charAt(i))+1 );
            }
            else{
                conteo.put(cadena.charAt(i), 1);
            }
        }
        for(char i : conteo.keySet()){
            System.out.println("("+i+","+conteo.get(i)+")");
        }
    }
}
