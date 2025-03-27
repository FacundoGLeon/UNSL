/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4_ejer10;

/**
 *
 * @author facun
 */
public class Materia implements Comparador{
    private String nombre;
    private int año;
    private int cantEstudiantes;
    private int cuatrimestre;
    
     boolean esMayor(Materia o){
        return cantEstudiantes>o.cantEstudiantes;
    }
    boolean esMenor(Materia o){
        return cantEstudiantes < o.cantEstudiantes;
    }
    boolean esIgual(Materia o){
        return cantEstudiantes==o.cantEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCantEstudiantes() {
        return cantEstudiantes;
    }

    public void setCantEstudiantes(int cantEstudiantes) {
        this.cantEstudiantes = cantEstudiantes;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }
    public void mostrarMateria(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Año: "+año);
        System.out.println("Cantidad de Estudiantes: "+cantEstudiantes);
        System.out.println("Cuatrimestre: "+cuatrimestre);
    }

    @Override
    public boolean esMayor(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esMenor(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esIgual(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
