/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author facun
 */
public abstract class Roedor {
    private String nombre;
    private int edad;
    private double peso;

    public Roedor(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPes() {
        return peso;
    }

    public void setPes(double peso) {
        this.peso = peso;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " meses, Peso: " + peso + "g");
    }

    
    public abstract void comer();
    public abstract void moverse();
}
