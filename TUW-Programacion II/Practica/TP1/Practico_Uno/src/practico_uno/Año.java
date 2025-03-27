/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico_uno;

/**
 *
 * @author facun
 */

public class Año {
    public static boolean esBis(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
    public static void esBisiesto(int año){
        if(año%400==0){
            System.out.println(año+" es año Bisiesto.");
        }else{
            if(año%4==0 && año%100!=0){
                System.out.println(año+" es año Bisiesto.");
            }else{
                System.out.println(año+" NO es año Bisiesto");
            }
        }
    }
    
    public static int diasMes(int mes,int año){
        switch(mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2: 
                return esBis(año)? 29 : 28;
            default: return 0;
        }
    }
}
