/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico1;

/**
 *
 * @author facun
 */
public class Triangulo {
    private double catetoAd;
    private double catetoOp;
    
    public Triangulo(double catetoAd, double catetoOp){
        this.catetoAd = catetoAd;
        this.catetoOp = catetoOp;
    }
    public double ObtenerHipotenusa(){
        return Math.sqrt(Math.pow(catetoAd, 2) + Math.pow(catetoOp, 2));
    } 
    public void mostrarTriangulo(){
        System.out.println("TRIANGULO:"
                            +"\nCateto Adyacente: "+catetoAd
                            +"\nCateto Opuesto: "+catetoOp
                            +"\nHipotenusa: "+ObtenerHipotenusa());
    }
}
