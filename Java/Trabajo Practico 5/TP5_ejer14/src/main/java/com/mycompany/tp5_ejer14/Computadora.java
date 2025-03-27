/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5_ejer14;

/**
 *
 * @author USUARIO
 */
public class Computadora  {
    private String marcaProcesador;
    private float velocidadProcesador;
    private int capacidadMemoria;
    private int capacidadDiscoGB;
    private int rpm;
    private String marcaPlacaVideo;
    private int capacidadPlacaVideoMB;
    
    
    

    public Computadora(String marcaProcesador, float velocidadProcesador, int capacidadMemoria, int capacidadDiscoGB, int rpm, String marcaPlacaVideo, int capacidadPlacaVideoMB) {
        this.marcaProcesador = marcaProcesador;
        this.velocidadProcesador = velocidadProcesador;
        this.capacidadMemoria = capacidadMemoria;
        this.capacidadDiscoGB = capacidadDiscoGB;
        this.rpm = rpm;
        this.marcaPlacaVideo = marcaPlacaVideo;
        this.capacidadPlacaVideoMB = capacidadPlacaVideoMB;
    }

    public String getMarcaProcesador() {
        return marcaProcesador;
    }

    public void setMarcaProcesador(String marcaProcesador) {
        this.marcaProcesador = marcaProcesador;
    }

    public float getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public void setVelocidadProcesador(float velocidadProcesador) {
        this.velocidadProcesador = velocidadProcesador;
    }

    public int getCapacidadMemoria() {
        return capacidadMemoria;
    }

    public void setCapacidadMemoria(int capacidadMemoria) {
        this.capacidadMemoria = capacidadMemoria;
    }

    public int getCapacidadDiscoGB() {
        return capacidadDiscoGB;
    }

    public void setCapacidadDiscoGB(int capacidadDiscoGB) {
        this.capacidadDiscoGB = capacidadDiscoGB;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public String getMarcaPlacaVideo() {
        return marcaPlacaVideo;
    }

    public void setMarcaPlacaVideo(String marcaPlacaVideo) {
        this.marcaPlacaVideo = marcaPlacaVideo;
    }

    public int getCapacidadPlacaVideoMB() {
        return capacidadPlacaVideoMB;
    }

    public void setCapacidadPlacaVideoMB(int capacidadPlacaVideoMB) {
        this.capacidadPlacaVideoMB = capacidadPlacaVideoMB;
    }

    @Override
    public String toString() {
        return "Marca del Procesador: " + marcaProcesador +
               "\nVelocidad del Procesador: " + velocidadProcesador + "GHz "+
               "\nCapacidad de Memoria: " + capacidadMemoria + "GB "+
               "\nCapacidad del Disco en GB: " + capacidadDiscoGB + "GB "+
               "\nRevoluciones por Minuto del Motor del Disco: " + rpm +"rpm "+
               "\nMarca de la Placa de Video: " + marcaPlacaVideo +
               "\nCapacidad de la Placa de Video en MB: " + capacidadPlacaVideoMB +"MB ";
    }

    
    
}
