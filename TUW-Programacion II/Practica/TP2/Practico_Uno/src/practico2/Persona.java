/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author facun
 */
public class Persona {
    private String nombre;
    private int edad;
    private String domicilio;
    private String estadoCivil;

    public Persona() {
    }
    
    public Persona(String nombre, int edad, String domicilio, String estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
        this.estadoCivil = estadoCivil;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + 
               "\nEdad: " + edad + 
                "\nDomicilio: " + domicilio + 
                "\nEstado Civil: " + estadoCivil;
    }
    
    
}
