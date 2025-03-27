/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp6_ejer10;

import com.mycompany.tp6_ejer10.Persona.OrdenarAlfabeticamente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author facun
 */
public class TP6_ejer10 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Persona> per = new ArrayList<Persona>();
        File f = new File("registro.txt");
        FileReader leo = new FileReader(f);
        BufferedReader fLeo = new BufferedReader(leo);
        String linea;
// leer datos de persona desde regitro.txt
        while((linea = fLeo.readLine())!=null){
            
            String [] datos = linea.split(", ");
            if(datos.length==5){
                per.add(new Persona(datos[0], datos[1], datos[2], datos[3],datos[4]));
            }
        }
        fLeo.close();
        
// ordenar lista alfabeticamente
        Collections.sort(per,new Persona.OrdenarAlfabeticamente());
        System.out.println("Personas en la Lista: ");
        File a = new File("registro.txt");
        FileWriter escr = new FileWriter(a,true);
        BufferedWriter fEscr = new BufferedWriter(escr);
        
// guardar datos en registro.txt
        ListIterator<Persona> it = per.listIterator();
        while(it.hasNext()){
            Persona i = it.next();
            fEscr.append(i.toString()+"\n");
        }
        fEscr.close();
    }
    public static void imprimir(ArrayList <Persona> per){
        ListIterator<Persona> it = per.listIterator();
        while(it.hasNext()){
            Persona i = it.next();
            System.out.println(i);
        }
    }
}
