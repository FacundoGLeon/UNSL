/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejerh;

import java.util.Scanner;

public class TP1_ejerh {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float dinero = 0;
        int cont100=0,cont50=0,cont20=0,cont10=0,cont5=0,cont2=0,cont1=0,cont0=0;
        do{
            System.out.println("Ingrese el Monto de Dinero: ");
            dinero = teclado.nextFloat();
        }while(dinero<0.0);
        
        while(dinero>=0.50){
            if(dinero>=100){
                cont100 = (int)(dinero/100);
                dinero = dinero-(cont100*100);
            }
            else{
                if(dinero>=50){
                    cont50 = (int)(dinero/50);
                    dinero = dinero-(cont50*50);
                }
                else{
                    if(dinero>=20){
                        cont20 = (int)(dinero/20);
                        dinero = dinero-(cont20*20);
                    }
                    else{
                        if(dinero>=10){
                            cont10 = (int)(dinero/10);
                            dinero =dinero-(cont10*10);
                        }
                        else{
                            if(dinero>=5){
                                cont5 = (int)(dinero/5);
                                dinero = dinero-(cont5*5);
                            }
                            else{
                                if(dinero>=2){
                                    cont2 = (int)(dinero/2);
                                    dinero = dinero-(cont2*2);
                                }
                                else{
                                    if(dinero>=1){
                                        cont1 = (int)(dinero/1);
                                        dinero = dinero-(cont1*1);
                                    }
                                    else{
                                        if(dinero>=0.50){
                                            cont0 = 1;
                                            dinero = (float)(dinero - 0.50);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }    
            System.out.println("Se necesitan: ");
            
            if(cont100>0){
                System.out.println("Billetes de 100: "+cont100);
            }
            if(cont50>0){
                System.out.println("Billetes de 50: "+cont50);
            }
            if(cont20>0){
                System.out.println("Billetes de 20: "+cont20);
            }
            if(cont10>0){
                System.out.println("Billetes de 10: "+cont10);
            }
            if(cont5>0){
                 System.out.println("Billetes de 5: "+cont5);
            }
            if(cont2>0){
                System.out.println("Billetes de 2: "+cont2);
            }
            if(cont1>0){
                System.out.println("Billetes de 1: "+cont1);
            }
            if(cont0>0){
                System.out.println("Monedas de 0.50: "+cont0);
            }
    }
}
                            
                        
                    
                
            
            
            
        
    

