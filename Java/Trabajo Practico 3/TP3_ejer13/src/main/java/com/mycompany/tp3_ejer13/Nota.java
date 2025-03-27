/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer13;

/**
 *
 * @author USUARIO
 */
public class Nota {
    private int identificador;
    private String linea;

    public Nota(int identificador,String linea) {
        this.identificador = identificador;
        this.linea = linea;
    }

    public int getIdentificador() {
        return identificador;
    }

   

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

   

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "Nro de Nota: "+identificador+". Nota: "+linea;
    }
    
    
}
