
package com.mycompany.proyectoconcierto;


public class Persona {
   
    private String Dni;
    private String nombre;
    private String apellido;
    private String contraseña;
    private Tarjeta Tarjeta;
    

    public Persona(String Dni, String nombre, String apellido, String contraseña, Tarjeta Tarjeta) {
        this.Dni = Dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.Tarjeta = Tarjeta;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Tarjeta getTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(Tarjeta Tarjeta) {
        this.Tarjeta = Tarjeta;
    }
    
    
    public boolean RegistrarTarjeta(){
        return true;
    } 
    
     public boolean EliminarTarjeta(){
        return true;
    }    
    public boolean AnularVenta(){
        return true;
    }    
    public boolean Comprar(){
        return true;
    }  

    @Override
    public String toString() {
        return "Persona{" + "Dni=" + Dni + ", nombre=" + nombre + ", apellido=" + apellido + ", contrase\u00f1a=" + contraseña + ", Tarjeta=" + Tarjeta + '}';
    }
    
    
}
