/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp6_ejer7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class TP6_ejer7 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESA UNA FRASE");
        String frase = teclado.nextLine();
        File f = new File("texto.txt");
        FileWriter escr = new FileWriter(f,true);
        BufferedWriter fEscr = new BufferedWriter(escr);
        if(!f.exists()){
            f.createNewFile();
        }
        
        fEscr.append(frase+"\n");
       
        fEscr.close();
       
        
    }
}
