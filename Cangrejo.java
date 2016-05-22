import greenfoot.*;

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase crea el objeto Cangrejo que pertenece al nivel 1.
 */
public class Cangrejo extends Enemigo
{
  /**
  * Este metodo es un loop que ejecuta todo lo que esta en su interior.
  */
  public void act() 
  {
    super.mover();
    sprites();
    super.borde();
    super.disparo();
  }  
    
 
  /**
   * Este metodo cambia las imagenes a una velocidad considerable que aparente que nuestro objeto Cangrejo se mueva.
   */
  public void sprites()
  {
           setImage("CangrejoD1.png");
           Greenfoot.delay(1);
      
           setImage("CangrejoD2.png");
           Greenfoot.delay(1);
        
           setImage("CangrejoD3.png");
           Greenfoot.delay(1);
      
           setImage("CangrejoD4.png");
           Greenfoot.delay(1);
        
           setImage("CangrejoD5.png");
           Greenfoot.delay(1);
       
           setImage("CangrejoD6.png");
           Greenfoot.delay(1);

           setImage("CangrejoD7.png");
           Greenfoot.delay(1);
  }

}
