/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer12;

/**
 *
 * @author USUARIO
 */
public class Programador extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    
    public Programador(){
        super();
        lineasDeCodigoPorHora = 0;
        lenguajeDominante = null;
    }
    
    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String dni, int edad, boolean casado, float salario){
        super(nombre,dni,edad,casado,salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
    
    public void mostrarProgramador(){
        super.mostrarEmpleado();
        System.out.println("Lineas De Codigo Por Hora: "+lineasDeCodigoPorHora);
        System.out.println("Lenguaje Dominante: "+lenguajeDominante);
        
    }
}
