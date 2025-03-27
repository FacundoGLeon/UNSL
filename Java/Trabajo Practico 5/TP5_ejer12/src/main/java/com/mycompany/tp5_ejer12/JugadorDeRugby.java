/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5_ejer12;

/**
 *
 * @author facun
 */
public class JugadorDeRugby extends Jugador{
    private int cantidadTackles;

    public JugadorDeRugby(int cantidadTackles, String nombre, String deporte) {
        super(nombre, deporte);
        this.cantidadTackles = cantidadTackles;
    }

    

    public int getCantidadTackles() {
        return cantidadTackles;
    }

    public void setCantidadTackles(int cantidadTackles) {
        this.cantidadTackles = cantidadTackles;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nTackles Realizados(en contra) :" + cantidadTackles;
    }
    
    
}

