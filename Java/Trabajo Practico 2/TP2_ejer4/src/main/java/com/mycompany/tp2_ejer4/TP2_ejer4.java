/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp2_ejer4;

/**
 *
 * @author usuario
 */
public class TP2_ejer4 {

    public static void main(String[] args) {
        Fraccion op1 = new Fraccion();
        Fraccion op2 = new Fraccion();
        Fraccion result = Fraccion.multiplicacion(op1, op2);
        System.out.println(result.getNumerador()+"/"+result.getDenominador());
    }
}
