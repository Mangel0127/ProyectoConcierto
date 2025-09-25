
package com.mycompany.proyectoconcierto;


public class Entrada {
   private int numero;
   private String estado;

    public Entrada(int numero, String estado) {
        this.numero = numero;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   public boolean vender(){
       return true;
   }
   public boolean liberar(){
       return true;
   }

    @Override
    public String toString() {
        return "Entrada{" + "numero=" + numero + ", estado=" + estado + '}';
    }
 
   
}
