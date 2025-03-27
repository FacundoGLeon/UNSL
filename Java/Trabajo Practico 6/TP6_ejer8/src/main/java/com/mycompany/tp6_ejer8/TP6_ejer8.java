/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp6_ejer8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class TP6_ejer8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        File f = new File("parrafo.txt");
        String frase;
        try{
            FileWriter escr = new FileWriter(f);
            BufferedWriter fEscr = new BufferedWriter(escr);
            
        
            int i;
            
            while(true){
                System.out.println("INGRESA UNA FRASE( '*' PARA TERMINAR)");
                frase = teclado.nextLine();
                if(frase.equals("*")){
                    break;
                }
                fEscr.append(frase+"\n");
            }
            fEscr.close();
        }catch(IOException e){
            System.out.println("ERROR: el archivo no puede ser escrito");
        }
        try{
            FileReader leo = new FileReader(f);
            BufferedReader fLeo = new BufferedReader(leo);
            System.out.println("El archivo contiene: ");
            while((frase=fLeo.readLine())!=null){
               System.out.println(frase);
            }
            fLeo.close();
        }catch(IOException e){
            System.out.println("ERROR: el archivo no puede ser leido");
        }    
    }
}
