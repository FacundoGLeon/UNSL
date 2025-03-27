/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp6_ejer11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author facun
 */
public class ArchivoDeTexto {
    private String nombreArchivo;
    private BufferedReader lector;
    private BufferedWriter escritor;

    public ArchivoDeTexto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.lector = null;
        this.escritor = null;
    }
    
    public void abrirEscritura() throws IOException{
        escritor= new BufferedWriter(new FileWriter(nombreArchivo+".txt"));
    }
    public void abrirLectura() throws IOException{
        lector= new BufferedReader(new FileReader(nombreArchivo+".txt"));
    }
    public void escribir(String linea) throws IOException{
        if(escritor!=null){
            escritor.append(linea+"\n");
        }
    }
    public String leer() throws IOException{
        if(lector!=null){
            return lector.readLine();
        }
        return null;
    }
    public void cerrar() throws IOException{
        if(lector!=null){
            lector.close();
        }
        if(escritor!=null){
            escritor.close();
        }
    }
}
