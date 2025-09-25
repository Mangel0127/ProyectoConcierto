
package com.mycompany.proyectoconcierto;


public class ProyectoConcierto {

    public static void main(String[] args) {
        
        Tarjeta T=new Tarjeta(5966658,"bcp","30/5/26",356);
        
        Persona P=new Persona("59632889","angel","vergara","25b",T);
        
        
        
        Entrada[] E = new Entrada[4];
        E[0]=new Entrada(1,"aceptado");
        E[1]=new Entrada(2,"aceptado");
        
        Venta V=new Venta("24/09/25",300,P,E);
        
        Zona[] Z=new Zona[2];
        Z[0]=new Zona("A",30,200,E);
        Z[1]=new Zona("B",20,100,E);
        
       Concierto C=new Concierto("badbunny","25/09/25",Z);
       
        
        
        
        
        System.out.println(V);
        System.out.println(C);
    }
}
