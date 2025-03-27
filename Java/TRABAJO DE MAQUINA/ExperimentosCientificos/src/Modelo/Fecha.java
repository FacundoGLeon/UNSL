/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Fecha {
    private static int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int dia;
    private int mes;
    private int año;

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
    
    public int pasajeADias(){
        int dias=0;
        dias = (año-1)*365;
        for(int i=1;i<mes;i++){
            dias += diasPorMes[i];
        }
        dias += dia;
        return dias;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
    
    
    
    
    
    
    
    
}
