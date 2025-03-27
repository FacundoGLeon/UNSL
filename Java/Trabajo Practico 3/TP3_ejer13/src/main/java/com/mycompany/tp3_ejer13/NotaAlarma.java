/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer13;

/**
 *
 * @author USUARIO
 */
public class NotaAlarma extends Nota {
    private int hora;
    private int minuto;

    public NotaAlarma(int identificador, String linea,int hora, int minuto) {
        super(identificador,linea);
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return "ALARMA; HORA: "+hora+":"+minuto;
    }
    
    
    
}
