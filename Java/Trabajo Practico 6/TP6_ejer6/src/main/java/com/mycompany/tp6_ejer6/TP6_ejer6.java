/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp6_ejer6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author facun
 */
public class TP6_ejer6 {

    public static void main(String[] args) throws FileNotFoundException {
        try{
            File f = new File("Leer.txt");
            FileReader leo = new FileReader(f);
            BufferedReader fLeo = new BufferedReader(leo);
            String s ;
            while((s = fLeo.readLine())!=null){
                System.out.println(s);
            }
        }catch(FileNotFoundException e){
            System.out.println("ERROR: "+e.toString());
        }catch(IOException e){
            System.out.println("ERROR: "+e.toString());
        }
        
    }
}
