
package com.mycompany.proyectoconcierto;

import java.util.Arrays;


public class Concierto {
   private String nombre;
   private String fecha;
   private Zona[] Zona;

    public Concierto(String nombre, String fecha, Zona[] Zona) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.Zona = Zona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Zona[] getZona() {
        return Zona;
    }

    public void setZona(Zona[] Zona) {
        this.Zona = Zona;
    }
    public boolean AgregarZona(String nombre){
        return true;
    }
    public boolean EliminarZona(String nombre){
            return true;
           } 

    @Override
    public String toString() {
        return "Concierto{" + "nombre=" + nombre + ", fecha=" + fecha + ", Zona=" + Arrays.toString(Zona) + '}';
    }
    
    
   }
   
   