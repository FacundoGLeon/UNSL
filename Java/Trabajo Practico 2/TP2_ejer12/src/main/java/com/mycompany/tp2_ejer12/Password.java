/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_ejer12;

import java.util.Random;

/**
 *
 * @author USUARIO
 */
public class Password {
    private String contraseña;
    private int longitud;
    
    public Password(){
        contraseña = null;
        longitud = 8;
    }
    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = null;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public static boolean esSegura(String contraseña){
        int i,numero=0,mayuscula=0,minuscula=0;
        char c;
        for(i=0;i<contraseña.length();i++){
            c = contraseña.charAt(i);
            if(Character.isUpperCase(c)){
                mayuscula++;
            }
            if(Character.isLowerCase(c)){
                minuscula++;
            }
            if(Character.isDigit(c)){
                numero++;
            }
        }
        
        return  mayuscula==2 && minuscula>1 && numero>3 ;
    }
    
    public void generarContraseña(){
        Random ran = new Random();
        String caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789";
        StringBuilder contraseña = new StringBuilder();
        
        int n,i;
       
        for(i=0;i<longitud;i++){
            n = ran.nextInt(caracteres.length());
            contraseña.append(caracteres.charAt(n));
        }
        
        
        this.contraseña = contraseña.toString();
    }
    /*public void generarContraseña2(){
        Random ran = new Random();
        int cont=0,num=4,mayus=2,minus=1;
        String caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789";
        StringBuilder contraseña = new StringBuilder();
        int n,i;
        
        for(i=0;i<longitud;i++){
            if(mayus!=0 && minus!=0 && num!=0){
            do{
                do{
                    cont=0;
                    n = ran.nextInt(caracteres.length());
                    if(Character.isUpperCase(n) && mayus!=0){
                        mayus--;
                        cont=1;
                    }
                    else{
                        if(Character.isLowerCase(n) && minus!=0){
                            minus--;
                            cont=1;
                        }
                        else{
                            if(Character.isDigit(n) && num!=0){
                                num--;
                                cont=1;
                                }
                        }
                    }
                }while(cont==0);
                contraseña.append(caracteres.charAt(n));
            }while(mayus==0 && minus==0 && num==0);
            }
            else{
            n = ran.nextInt(caracteres.length());
            contraseña.append(caracteres.charAt(n));
            }
        }
            
        
        this.contraseña = contraseña.toString();
    }*/
}


