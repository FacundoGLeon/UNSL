/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_ejer7;

/**
 *
 * @author facun
 */
public class Fecha {
    private int dia, mes, año;
    public Fecha() {
        this.dia = 0;
        this.mes = 0;
        this.año = 0;
    }
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public int cantDias(Fecha d){
        int dias;
        dias = ((año*365)+(mes*30)+dia)-((d.año*360)+(d.mes*30)+d.dia);
        return dias;
    }

    public String MostrarFecha(){
        return dia+"/"+mes+"/"+año;
    }
}
