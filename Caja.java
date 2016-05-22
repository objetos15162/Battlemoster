import greenfoot.*;

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase es la caja magica que en ella se encuentra un poder
 */
public class Caja extends Cajas
{  
    /**
     * Este metodo es el constructor que se encarga de inicializar la clase y que a su vez inicializa a Cajas con el nivel(para que sepa a donde enviar los mensajes).
     */
   public Caja(int nivel)
   {
       super.nivel=nivel;
   }
   
   
   /**
    * Este metodo es el loop infinito que verifica por medio de la herencia el metodo  tocar de la clase Cajas(ejecuta todo lo que que este en su interior).
    */
   public void act() 
   {
      super.toca();
   }    
}
