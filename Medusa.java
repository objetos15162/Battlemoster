import greenfoot.*;

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase crea el objeto Medusa que pertenece al nivel 1.
 */
public class Medusa extends Enemigo
{
    //Variable necesarias para la clase
    private Nivel1 mundo;
   
  /**
  * Este metodo es el constructor y sirve para enviar el nivel del objeto a la clase padre.
  */
  public Medusa(int nivel)
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
      
           setImage("Medusa1.png");
           Greenfoot.delay(1);
           
           setImage("Medusa2.png");
           Greenfoot.delay(1); 
           
           setImage("Medusa3.png");
           Greenfoot.delay(1);
       
           setImage("Medusa4.png");
           Greenfoot.delay(1);
       
           setImage("Medusa5.png");
           Greenfoot.delay(1);
        
           setImage("Medusa6.png");
           Greenfoot.delay(1);
       
           setImage("Medusa7.png");
           Greenfoot.delay(1);
        
           setImage("Medusa8.png");
           Greenfoot.delay(1);
       
           setImage("Medusa9.png");
           Greenfoot.delay(1);
        
           setImage("Medusa10.png");
           Greenfoot.delay(1);
       
           setImage("Medusa11.png");
           Greenfoot.delay(1);
       
           setImage("Medusa12.png");
           Greenfoot.delay(1);
        
           setImage("Medusa13.png");
           Greenfoot.delay(1);
       
           setImage("Medusa14.png");
           Greenfoot.delay(1);
       
           setImage("Medusa15.png");
           Greenfoot.delay(1);  
    }
}
