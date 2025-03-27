/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp6_ejer14;

/**
 *
 * @author facun
 */

public class Punto1erCuadrante {
    private double x;
    private double y;

    public Punto1erCuadrante() {
        x = 0;
        y = 0;
    }

    public Punto1erCuadrante(double x, double y) throws PuntoFueraDelPrimerCuadranteException  {
        if(x>=0 && y >=0){
            this.x = x;
            this.y = y;
        }else{
            throw new PuntoFueraDelPrimerCuadranteException();
        }
        
    }
    
    
    

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return   "(" + x + ", " + y + ")";
    }
    
}
