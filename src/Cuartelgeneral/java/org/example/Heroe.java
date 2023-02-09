package org.example;

public class Heroe {
    
    
    
   private String nombre;
   private int porder = 900;

    public Heroe() {
    }


    public Heroe(String nombre, int porder) {
        this.nombre = nombre;
        this.porder = porder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorder() {
        return porder;
    }

    public void setPorder(int porder) {
        if(porder>0 && porder<=100){
            this.porder=porder;
        }else{
            System.out.println("poder incorrecto");
        }
    }

    public String saludar(String nombre){
        
        return ("te vencere"+nombre);
    }
}
