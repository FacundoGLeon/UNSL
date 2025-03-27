/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author facun
 */
public class Compra {
     private Cliente cliente;
    private Producto[] productos;
    private int[] cantidades;
    private int totalProductos;
    private String fecha;
    
    private static Producto[] inventario = {
        new Producto("Laptop", 1200.50, 10),
        new Producto("Mouse", 25.00, 50),
        new Producto("Teclado", 45.99, 30),
        new Producto("Monitor", 200.00, 15),
        new Producto("Audífonos", 60.00, 20)
    };

    // Constructor
    public Compra(Cliente cliente, int maxProductos) {
        this.cliente = cliente;
        this.productos = new Producto[maxProductos];  // Array de productos
        this.cantidades = new int[maxProductos];      // Array de cantidades
        this.totalProductos = 0;

        // Obtener la fecha actual en formato "dd/MM/yyyy"
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        this.fecha = formatoFecha.format(new Date());
    }

    // Método para agregar producto con cantidad específica
    public void agregarProducto(int IDProducto, int cantidad) {
        if (totalProductos < productos.length) {
            Producto producto = buscarProducto(IDProducto);
            if (producto != null && producto.getStock() >= cantidad) {
                productos[totalProductos] = producto;
                cantidades[totalProductos] = cantidad;
                totalProductos++;

                // Reducir stock del producto
                inventario[IDProducto].setStock(inventario[IDProducto].getStock() - cantidad);

                System.out.println("✔ Producto agregado: " + producto.getNombre() + " | Cantidad: " + cantidad);
            } else {
                System.out.println("❌ No hay suficiente stock para " + producto.getNombre());
            }
        } else {
            System.out.println("❌ No se pueden agregar más productos. Compra llena.");
        }
    }

    // Método para agregar producto con cantidad por defecto = 1
    public void agregarProducto(int IDProducto) {
        agregarProducto(IDProducto, 1);
    }

    // Método para mostrar detalles de la compra
    public void mostrarCompra() {
        System.out.println("\n📜 Compra realizada el: " + fecha);
        cliente.mostrarInfo();
        System.out.println("\n🛒 Productos comprados:");
        for (int i = 0; i < totalProductos; i++) {
            System.out.println("- " + productos[i].getNombre() + " x" + cantidades[i]);
        }
    }

    // Simula una base de datos de productos
    private Producto buscarProducto(int IDProducto) {
        

        if (IDProducto >= 0 && IDProducto < inventario.length) {
            return inventario[IDProducto];
        }
        System.out.println("❌ Producto no encontrado.");
        return null;
    }
    
    public double totalCompra(){
        double total = 0;
        for(int i = 0; i<totalProductos;i++){
            total+=productos[i].getPrecio();
        }
        return total;
    }
}
