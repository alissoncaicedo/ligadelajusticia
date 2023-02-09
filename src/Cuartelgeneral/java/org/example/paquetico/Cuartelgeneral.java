package org.example.paquetico;

import clases.Villano;
import org.example.Heroe;

public class Cuartelgeneral {
    public static void main (String[] args){

        //creo un heroe
        Heroe heroe=new Heroe();
        heroe.setNombre("batman");
        heroe.setPorder(800);

        System.out.println(heroe.getNombre());
        System.out.println(heroe.getPorder());


        //creo un villano. objeto
        Villano villano = new Villano();


        //creo pareja, SI SE LLAMA IGUAL A AL CLASE ES UN CONSTRUCTOR
        Pareja pareja = new Pareja("ali");
    }
}
