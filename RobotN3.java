import greenfoot.*;

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase crea el objeto RobotN3 que pertenece al nivel 3.
 */
public class RobotN3 extends Enemigo
{
   //Variables necesarias para la clase
   private Nivel3 mundo;
    
   /**
   * Este metodo es el constructor y sirve para enviar el nivel del objeto a la clase padre.
   */
   public RobotN3(int nivel)
   {
     super.nivel=nivel;  
   }
  
   
   /**
   * Este metodo es un loop que ejecuta todo lo que esta en su interior.
   */
    public void act() 
    {
        super.sigue();
        sprite();
        super.disparo();
        super.borde();
    }    
    
   
   /**
   * Este metodo cambia las imagenes a una velocidad considerable que aparente que nuestro objeto MedusaN3 se mueva.
   */
   public void sprite()
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