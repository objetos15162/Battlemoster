import greenfoot.*;


/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase crea el objeto mina que pertenece a cualquier nivel que se requiera.
 */
public class Mina extends Enemigo
{
   /**
   * Este metodo es un loop que ejecuta todo lo que esta en su interior.
   */
    public void act() 
    {
       moverAbajo();
       super.borde();
       super.disparo();
    } 
    
   /**
   *Esta metodo hace que el objeto se mueva en una unidad hacia abajo.
   */
   public void moverAbajo()
   {
       setLocation(getX(),getY()+1);
   }
}
