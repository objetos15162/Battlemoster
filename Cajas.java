import greenfoot.*;

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase se creo para evitar la duplicidad de codigo, en ella se encuentra verificar borde y toca
 * el toca es el encargado de mover en una unidad hacia abajo y verifica si nuestro heroe toco el objeto,
 * el borde es el encargado de verificar si a tocado el borde de ser cierto elimina ese objeto.
 * 
 * Tambien contiene una variable nivel que sirve hacia donde hay que enviar los mensajes de eliminacion.
 */
public class Cajas extends Actor
{
    //Variables requeridas 
   private Nivel1 mundo;
   private Nivel2 mundo2;
   private Nivel3 mundo3;
   
   public int nivel;
    
   /**
    * Esta metodo mueve el objeto,verifica si a tocado el borde y verifica si el heroe lo a tocado.
    */
    public void toca()
    {
        if(nivel==1)
        {
          mundo = (Nivel1)getWorld();
         
          if(this.getWorld ()!= null)
          {
               mover();
               borde();
               if(this.isTouching(Heroe.class))
               {
                 mundo.removeObject(this);
               }
          }
        }
        
        if(nivel==2)
        {
          mundo2 = (Nivel2)getWorld();
         
          if(this.getWorld ()!= null)
          {
               mover();
               borde();
               if(this.isTouching(Heroe.class))
               {
                 mundo2.removeObject(this);
               }
          }
        }
        
        if(nivel==3)
        {
          mundo3 = (Nivel3)getWorld();
         
          if(this.getWorld ()!= null)
          {
               mover();
               borde();
               if(this.isTouching(Heroe.class))
               {
                 mundo3.removeObject(this);
               }
          }
        }
    }
    
   
  /**
   * Este metodo mueve hacia abajo a el objeto.
   */
   public void mover()
   {
      setLocation(getX(),getY()+1);
   }
    
    
   /**
    * Este metodo verifica si el objeto a tocado el borde de la pantalla.
    */ 
   public int borde()
   {
        int x=0;  
        if(getY()==599)
        {
            x=1;
        }
        return(x);
   }
}