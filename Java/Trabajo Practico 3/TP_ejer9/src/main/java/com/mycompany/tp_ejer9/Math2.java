/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_ejer9;

/**
 *
 * @author USUARIO
 */
final public class Math2 {
    private float [] reales;

    public Math2(float[] reales) {
        this.reales = reales;
    }
    
    public float maximo(){
        int i;
        int max=1;
        for(i=0;i<reales.length;i++){
            if(reales[i]>reales[max]){
                max=i;
            }
        }
        return reales[max];
    }
    public float minimo(){
        int i;
        int min=1;
        for(i=0;i<reales.length;i++){
            if(reales[i]<reales[min]){
                min=i;
            }
        }
        return reales[min];
    }
    public float sumatoria(){
        int i;
        float total = 0;
        for(i=0;i<reales.length;i++){
            total += reales[i];
        }
        return total;
    }
     public float mediaAritmetica(){
        int i;
        float promedio = 0;
        for(i=0;i<reales.length;i++){
            promedio += reales[i];
        }
        return promedio/reales.length;
    }
     public int promedioEntero(){
        int i;
        float promedio = 0;
        for(i=0;i<reales.length;i++){
            promedio += reales[i];
        }
        return (int)promedio/reales.length;
    }
}
