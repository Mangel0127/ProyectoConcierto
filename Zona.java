
package com.mycompany.proyectoconcierto;

import java.util.Arrays;


public class Zona {
 private String nombre;
    private int capacidad;
    private int precio;
    private Entrada[] Entrada;

    public Zona(String nombre, int capacidad, int precio, Entrada[] Entrada) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
        this.Entrada = Entrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Entrada[] getEntrada() {
        return Entrada;
    }

    public void setEntrada(Entrada[] Entrada) {
        this.Entrada = Entrada;
    }
    public boolean generarEntrada(){
        return true;
       
    }
    public Entrada[] mostrarEntrada(){
        return Entrada;
    }
    public Entrada[] venderEntrada(int numero){
        
        return Entrada;
        
    }

    @Override
    public String toString() {
        return "Zona{" + "nombre=" + nombre + ", capacidad=" + capacidad + ", precio=" + precio + ", Entrada=" + Arrays.toString(Entrada) + '}';
    }
    
}
