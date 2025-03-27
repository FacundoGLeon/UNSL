/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer12;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    private String nombre;
    private String dni;
    private int edad;
    private boolean casado;
    private float salario;
    
    public Empleado(){
        nombre = null;
        dni = null;
        edad = 0;
        casado = false;
        salario = 0;
    }
    public Empleado(String nombre, String dni, int edad, boolean casado, float salario){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void mostrarEmpleado(){
        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+dni);
        System.out.println("Edad: "+edad);
        System.out.println("Casado: "+casado);
        System.out.println("Salario: "+salario);
    }
    
    public void clasificacion(){
        System.out.print("Clasificacion: ");
        if(edad<=21){
            System.out.println("Principiante");
        }
        else{
            if(edad>=22 && edad<=35){
                System.out.println("Intermedio");
            }
            else{
                if(edad>35){
                    System.out.println("Senior");
                }
            }
        }
    }
    public void aumentaSalario(int porcentaje){
        salario = (salario*porcentaje)/100;
        
    }
}
