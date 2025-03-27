/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp6_ejer12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class TP6_ejer12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<Character,Integer> conteo = new HashMap<Character,Integer>();
        String cadena, nombreArchivo;
        System.out.println("Ingrese el nombre del archivo que desea abrir: ");
        // nombre del archivo existente cadena.txt
        nombreArchivo = teclado.next();
        try{
             BufferedReader lector= new BufferedReader(new FileReader(nombreArchivo+".txt"));
        
            while((cadena = lector.readLine())!=null){
                for(int i=0;i<cadena.length();i++){
                    if(conteo.containsKey(cadena.charAt(i))){
                        conteo.put(cadena.charAt(i),conteo.get(cadena.charAt(i))+1 );
                    }
                    else{
                        conteo.put(cadena.charAt(i), 1);
                    }
                } 
            }
            lector.close();
        }catch(FileNotFoundException e){
            System.out.println("ERROR: "+e.toString());
        }catch(IOException e){
            System.out.println("ERROR: "+e.toString());
        }
        for(char i : conteo.keySet()){
            System.out.println("("+i+","+conteo.get(i)+")");
        }
    }

}