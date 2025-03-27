/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_ejer7;


public class pilaPersona10 {
    Persona [] pPer;
    int tope;

    public pilaPersona10(int max) {
        this.pPer = new Persona[max];
        this.tope = -1;
    }

    public void push(Persona pPer) {
        tope++;
        this.pPer[tope] = pPer;
    }

    public void supress() {
        tope--;
    }
    public Persona copy(){
        return pPer[tope];
    }
    public int isEmpty(){
        if(tope==-1)
            return 1;
        else{
            return 0;}
    }
    public int isFull(){
        if(tope>=pPer.length)
            return 1;
        else{
            return 0;}
    }
    
    
    
}
