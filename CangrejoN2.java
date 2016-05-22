import greenfoot.*;

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase crea el objeto CangrejoN2 que pertenece al nivel 2.
 */
public class CangrejoN2 extends Enemigo
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
   * Este metodo cambia las imagenes a una velocidad considerable que aparente que nuestro objeto CangrejoN2 se mueva.
   */
  public void sprites()
  {
           setImage("CangrejoD21.png");
           Greenfoot.delay(1);
       
           setImage("CangrejoD22.png");
           Greenfoot.delay(1);
       
           setImage("CangrejoD23.png");
           Greenfoot.delay(1);
        
           setImage("CangrejoD24.png");
           Greenfoot.delay(1);
        
           setImage("CangrejoD25.png");
           Greenfoot.delay(1);
        
           setImage("CangrejoD26.png");
           Greenfoot.delay(1);
        
           setImage("CangrejoD27.png");
           Greenfoot.delay(1);
        
           setImage("CangrejoD28.png");
           Greenfoot.delay(1);
        
           setImage("CangrejoD29.png");
           Greenfoot.delay(1);
        
           setImage("CangrejoD210.png");
           Greenfoot.delay(1);
        
           setImage("CangrejoD211.png");
           Greenfoot.delay(1);
       
           setImage("CangrejoD212.png");
           Greenfoot.delay(1);
  }
}
