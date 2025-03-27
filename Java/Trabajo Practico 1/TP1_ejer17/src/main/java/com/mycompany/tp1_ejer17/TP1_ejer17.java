/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejer17;

import java.util.Scanner;

public class TP1_ejer17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float horasPagas = 0;
        int horasTrab = 0;
        float total = 0;
        int horMen=40,horDob=8;
        do{
            System.out.println("A cuanto se paga la hora de Trabajo: ");
            horasPagas = teclado.nextInt();
        }while(horasPagas < 100.0);
        do{
            System.out.println("Cuanta horas trabajo este Mes: ");
            horasTrab = teclado.nextInt();
        }while(horasTrab < 0);
        
        if(horasTrab >(horDob+horMen)){
            total = horMen*horasPagas;
            total = total + horDob*(horasPagas*2);
            total = total + (horasTrab-(horDob+horMen))*(horasPagas*3);
        
        }
        else{
            if(horasTrab >horMen){
                total = horMen*horasPagas;
                total = total + (horasTrab-horMen)*(horasPagas*2);
            }
            else{
                total = horasPagas * horasTrab;
            }
        }
        
        System.out.println("Total a Pagar: "+total);
        
        
        
        
    }
}
