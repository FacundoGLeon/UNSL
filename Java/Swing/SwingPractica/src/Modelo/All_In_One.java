/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author facun
 */
public class All_In_One extends Computadora {
    private boolean perifericosBluetooth;

    public All_In_One(boolean perifericosBluetooth, String marcaProcesador, float velocidadProcesador, int capacidadMemoria, int capacidadDiscoGB, int rpm, String marcaPlacaVideo, int capacidadPlacaVideoMB) {
        super(marcaProcesador, velocidadProcesador, capacidadMemoria, capacidadDiscoGB, rpm, marcaPlacaVideo, capacidadPlacaVideoMB);
        this.perifericosBluetooth = perifericosBluetooth;
    }

    public boolean isPerifericosBluetooth() {
        return perifericosBluetooth;
    }

    public void setPerifericosBluetooth(boolean perifericosBluetooth) {
        this.perifericosBluetooth = perifericosBluetooth;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nSoporta Bluetooth: " + (perifericosBluetooth ? "Sí" : "No");
    } 
    
}
