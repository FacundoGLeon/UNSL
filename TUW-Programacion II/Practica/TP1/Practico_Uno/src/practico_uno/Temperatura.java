/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico_uno;

/**
 *
 * @author facun
 */
public class Temperatura {
    private float tempF;
    
    public Temperatura(float tempF){
        this.tempF = tempF;
    }
    public float calcularCelsius(){
        return (tempF-32)*5/9;
    }
    public void mostrarTempC(){
        System.out.println(tempF+"ºF son "+calcularCelsius()+"ºC");
       
    }
}
