/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico_uno;

/**
 *
 * @author facun
 */
public class Conjunto {
    private int [] conj;
    
    public Conjunto(int [] conj){
        this.conj = conj;
    }
    
    public int[] getConjunto(){
        return conj;
    }
    public static int cantInter(Conjunto conj1, Conjunto conj2){
        int cant=0;
        for(int i=0;i<conj1.getConjunto().length;i++){
            for(int j=0;j<conj2.getConjunto().length;j++){
                if(conj1.getConjunto()[i]==conj2.getConjunto()[j]){
                   cant++;
                }
            }
        }
        return cant;
    }
    public static Conjunto interseccion(Conjunto conj1, Conjunto conj2){
        int [] inter = new int[cantInter(conj1, conj2)];
        int pos=0;
        for(int i=0;i<conj1.getConjunto().length;i++){
            for(int j=0;j<conj2.getConjunto().length;j++){
                if(conj1.getConjunto()[i]==conj2.getConjunto()[j]){
                   inter[pos]=conj1.getConjunto()[i];
                   pos++;
                }
            }
        }
        return new Conjunto(inter);
    }
    
    public void mostrar(){
        System.out.print("Conjunto: {");
        for(int i = 0; i<conj.length; i++){
            System.out.print(conj[i]+",");
        }
        System.out.println("}");
    }
}
