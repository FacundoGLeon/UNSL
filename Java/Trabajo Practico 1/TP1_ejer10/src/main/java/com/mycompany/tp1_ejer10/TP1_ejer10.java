/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1_ejer10;

public class TP1_ejer10 {
    final static int TAM = 5;
  
    public static void main(String[] args) {
        
        int i;
        int [] num = new int[TAM];
        if(TAM%2==0){
            for(i=1;i<=TAM;i++){
                num[i-1] = 2*i;
            }
        }
        else{
            for(i=0;i<TAM;i++){
                num[i] = 2*i+1;
            }
        }
        for(i=0;i<TAM;i++){
            System.out.print(num[i]+", ");
        
        }
    }
}
