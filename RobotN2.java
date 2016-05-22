import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase crea el objeto RobotN2 que pertenece al nivel 2.
 */
public class RobotN2 extends Enemigo
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
   * Este metodo cambia las imagenes a una velocidad considerable que aparente que nuestro objeto RobotN2 se mueva.
   */
  public void sprites()
  {
           setImage("Nave1.png");
           Greenfoot.delay(1);
       
           setImage("Nave2.png");
           Greenfoot.delay(1);
       
           setImage("Nave3.png");
           Greenfoot.delay(1);
       
           setImage("Nave4.png");
           Greenfoot.delay(1);
       
           setImage("Nave5.png");
           Greenfoot.delay(1);
       
           setImage("Nave6.png");
           Greenfoot.delay(1);
      
           setImage("Nave7.png");
           Greenfoot.delay(1);
       
           setImage("Nave8.png");
           Greenfoot.delay(1);
       
           setImage("Nave9.png");
           Greenfoot.delay(1);
  }    
}
