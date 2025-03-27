/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author facun
 */
public class Notebook extends Computadora {
    private float capacidadBateria;
    private float peso;

    public Notebook(float capacidadBateria, float peso, String marcaProcesador, float velocidadProcesador, int capacidadMemoria, int capacidadDiscoGB, int rpm, String marcaPlacaVideo, int capacidadPlacaVideoMB) {
        super(marcaProcesador, velocidadProcesador, capacidadMemoria, capacidadDiscoGB, rpm, marcaPlacaVideo, capacidadPlacaVideoMB);
        this.capacidadBateria = capacidadBateria;
        this.peso = peso;
    }

    public float getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(float capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCapacidad de Batería: " + capacidadBateria +"mAh"+
               "\nPeso: " + peso + " kg";
    }
}
