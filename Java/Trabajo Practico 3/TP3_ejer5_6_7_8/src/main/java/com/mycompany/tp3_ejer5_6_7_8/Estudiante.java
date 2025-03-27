/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_ejer5_6_7_8;

/**
 *
 * @author USUARIO
 */
public class Estudiante extends Persona {
    private String carrera;
    private int añoCursa;
    
    public Estudiante(){
        
    }

    public Estudiante(String carrera, int añoCursa, String nombre,String apellido, String tipoDocumento, long documento, String estadoCivil, Fecha fechaNacimiento) {
        super(nombre, apellido, tipoDocumento, documento, estadoCivil, fechaNacimiento);
        this.carrera = carrera;
        this.añoCursa = añoCursa;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAñoCursa() {
        return añoCursa;
    }

    public void setAñoCursa(int añoCursa) {
        this.añoCursa = añoCursa;
    }
    
    public void mostrarEstudiante(){
        mostrarPersona();
        System.out.println("Carrera: "+carrera);
        System.out.println("Año Que Cursa: "+añoCursa+"º");
    }
    
    
}
