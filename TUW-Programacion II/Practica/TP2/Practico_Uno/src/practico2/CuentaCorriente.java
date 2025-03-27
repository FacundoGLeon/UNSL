/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author facun
 */
public class CuentaCorriente {
    private int numeroCtaCte;
    private String nombreCliente;
    private float dineroDepositado;
    private float dineroAdeudado;

    public CuentaCorriente(int numeroCtaCte, String nombreCliente, float dineroDepositado, float dineroAdeudado) {
        this.numeroCtaCte = numeroCtaCte;
        this.nombreCliente = nombreCliente;
        this.dineroDepositado = dineroDepositado;
        this.dineroAdeudado = dineroAdeudado;
    }

    public int getNumeroCtaCte() {
        return numeroCtaCte;
    }

    public void setNumeroCtaCte(int numeroCtaCte) {
        this.numeroCtaCte = numeroCtaCte;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public float getDineroDepositado() {
        return dineroDepositado;
    }

    public void setDineroDepositado(float dineroDepositado) {
        this.dineroDepositado = dineroDepositado;
    }

    public float getDineroAdeudado() {
        return dineroAdeudado;
    }

    public void setDineroAdeudado(float dineroAdeudado) {
        this.dineroAdeudado = dineroAdeudado;
    }
    
    public float calcularSaldo(){
        return dineroDepositado - dineroAdeudado;
    }
    
}
