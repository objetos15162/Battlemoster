import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase crea el objeto NaveN3 que pertenece al nivel 3.
 */
public class NaveN3 extends Enemigo
{
  //Variables necesarias para la clase
  private Nivel3 mundo;
    
  /**
  * Este metodo es un loop que ejecuta todo lo que esta en su interior.
  */
  public void act() 
  {
     super.mover();
     super.disparo();
     super.borde();
  }      
}