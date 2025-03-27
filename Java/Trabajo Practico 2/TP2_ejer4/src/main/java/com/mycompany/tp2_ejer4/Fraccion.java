/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_ejer4;

/**
 *
 * @author usuario
 */
public class Fraccion {
    private int numerador;
    private int denominador;
    
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 0;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public static Fraccion multiplicacion(Fraccion op1,Fraccion op2){
        Fraccion result = new Fraccion(op1.getNumerador()*op2.getNumerador(),op1.getDenominador()*op2.getDenominador());
        return result;
    }
    public static Fraccion division(Fraccion op1,Fraccion op2){
        Fraccion result = new Fraccion(op1.getNumerador()*op2.getDenominador(),op1.getDenominador()*op2.getNumerador());
        return result;
    }
    public static Fraccion suma(Fraccion op1,Fraccion op2){
        Fraccion result = new Fraccion(op1.getDenominador()*op2.getDenominador(),op1.getNumerador()*op2.getDenominador() + op1.getDenominador()*op2.getNumerador());
        return result;
    }
    public static Fraccion resta(Fraccion op1,Fraccion op2){
        Fraccion result = new Fraccion(op1.getDenominador()*op2.getDenominador(),op1.getNumerador()*op2.getDenominador() - op1.getDenominador()*op2.getNumerador());
        return result;
    }
}
