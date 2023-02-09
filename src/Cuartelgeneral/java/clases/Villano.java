package clases ;

import org.example.Heroe;

public class Villano {
    
   protected String nombre;
    public int poder;
    private Heroe heroe;

   public int destruir (){
      int resultado= this.poder-this.heroe.getPorder();
      return resultado; 
    }
}
