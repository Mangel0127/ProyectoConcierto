
package com.mycompany.proyectoconcierto;

import java.util.Arrays;


public class Venta {
    private String fecha;
    private int monto;
    private Persona Persona;
    private Entrada Entrada[];

    public Venta(String fecha, int monto, Persona Persona, Entrada[] Entrada) {
        this.fecha = fecha;
        this.monto = monto;
        this.Persona = Persona;
        this.Entrada =  Entrada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona Persona) {
        this.Persona = Persona;
    }

    public Entrada[] getEntrada() {
        return Entrada;
    }

    public void setEntrada(Entrada[] Entrada) {
        this.Entrada = Entrada;
    }

    
    
    public boolean Anular(){
        return true;
    }

    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", monto=" + monto + ", Persona=" + Persona + ", Entrada=" + Arrays.toString(Entrada) + '}';
    }
    

}
