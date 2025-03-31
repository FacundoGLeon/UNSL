/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author facun
 */
public class Pixel {
    private int x;
    private int y;
    private int color;

    public Pixel(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    //Metodos de Traslacion
    public void izquierda(int x){
        this.x = this.x - x;
    }
    public void derecha(int x){
        this.x = this.x + x;
    }
    public void arriba(int y){
        this.y = this.y + y;
    }
    public void abajo(int y){
        this.y = this.y - y;
    }
    
    public void trasladar(int direccion, int valor){
        //1 = izquierda
        //2 = derecha
        //3 = arriba
        //4 = abajo
        if(direccion == 1){
            izquierda(valor);
        }
        if(direccion == 2){
            derecha(valor);
        }
        if(direccion == 3){
            arriba(valor);
        }
        if(direccion == 4){
            abajo(valor);
        }
    }
    //----------------------

    @Override
    public String toString() {
        return "Coordenadas:"
                +"\nx: "+x
                +"\ny: "+y
                +"\nColor: \n"+color;
    }
    
    
    
}
