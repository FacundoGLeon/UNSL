/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico_uno;

/**
 *
 * @author facun
 */
public class Cheque {
    private int DIGITOS = 10;
    private String _numeroDeCheque;
    
    public Cheque(String numero){
        _numeroDeCheque = numero;
    }
    //Controla si el numero es de 10 digitos y si no tiene letras
    boolean controlCheque(){
        if(_numeroDeCheque.length()!=10){
            return false;
        }
        for(int i =0;i<_numeroDeCheque.length();i++){
            if(_numeroDeCheque.charAt(i)<48 || _numeroDeCheque.charAt(i)>57){
                return false;
            }
        }
        return true;
    }
    boolean esFalso(){
        //cont1 cuenta los ceros
        //cont2 cuenta los distintos a cero
        int cont1 = 0;
        int cont2 = 0;
        int i;
        for(i=0;i<DIGITOS;i++){
            if(_numeroDeCheque.charAt(i)=='0'){
                cont2 = 0;
                cont1++;
            }else{
                cont1 = 0;
                cont2++;
            }
            if(cont1==3 || cont2==4){
                return false;
            }
        }
        return true;
    }

}
