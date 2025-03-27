/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author facun
 */
public class Kiosco {
    private Compra[] compras;
    private int totalCompras;

    public Kiosco(int maxCompras) {
        this.compras = new Compra[maxCompras];
        this.totalCompras = 0;
    }

    public void registrarCompra(Compra compra) {
        if (totalCompras < compras.length) {
            compras[totalCompras] = compra;
            totalCompras++;
            System.out.println("✔ Compra registrada.");
        } else {
            System.out.println("❌ No se pueden registrar más compras (límite alcanzado).");
        }
    }

    public void mostrarCompras() {
        System.out.println("\n📜 Historial de Compras (Arrays)");
        for (int i = 0; i < totalCompras; i++) {
            compras[i].mostrarCompra();
        }
    }
    
    public double montoTotal(){
        double total=0;
        for(int i=0;i<totalCompras;i++){
            total+=compras[i].totalCompra();
        }
        
        return total;
    }
}
