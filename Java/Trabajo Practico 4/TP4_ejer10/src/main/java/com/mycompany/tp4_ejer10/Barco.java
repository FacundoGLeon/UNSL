/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4_ejer10;

/**
 *
 * @author facun
 */
public class Barco implements Comparador{
    private float largo;
    private float ancho;
    private float area;
    
    boolean esMayor(Barco o){
        return area>o.area;
    }
    boolean esMenor(Barco o){
        return area < o.area;
    }
    boolean esIgual(Barco o){
        return area==o.area;
    }

    public Barco(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
        this.area = largo * ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getArea() {
        return area;
    }

   public void muestraMedidadBarco(){
       System.out.println("Largo: "+largo);
       System.out.println("Ancho: "+ancho);
       System.out.println("Area: "+area);
   }

    @Override
    public boolean esMayor(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esMenor(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esIgual(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
