import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase crea el objeto MedusaN2 que pertenece al nivel 2.
 */
public class MedusaN2 extends Enemigo
{
    //Variable necesarias para la clase
    private Nivel2 mundo2;
    
    /**
    * Este metodo es el constructor y sirve para enviar el nivel del objeto
    */
    public MedusaN2(int nivel)
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
    * Este metodo cambia las imagenes a una velocidad considerable que aparente que nuestro objeto MedusaN2 se mueva.
    */
    public void sprite()
    {
           setImage("MedusaN21.png");
           Greenfoot.delay(1);
        
           setImage("MedusaN22.png");
           Greenfoot.delay(1);
       
           setImage("MedusaN23.png");
           Greenfoot.delay(1);
        
           setImage("MedusaN24.png");
           Greenfoot.delay(1);
        
           setImage("MedusaN25.png");
           Greenfoot.delay(1);
       
           setImage("MedusaN26.png");
           Greenfoot.delay(1);
        
           setImage("MedusaN27.png");
           Greenfoot.delay(1);
        
           setImage("MedusaN28.png");
           Greenfoot.delay(1);
       
           setImage("MedusaN29.png");
           Greenfoot.delay(1);
        
           setImage("MedusaN210.png");
           Greenfoot.delay(1);
        
           setImage("MedusaN211.png");
           Greenfoot.delay(1);
        
           setImage("MedusaN212.png");
           Greenfoot.delay(1);
        
           setImage("MedusaN213.png");
           Greenfoot.delay(1);
        
           setImage("MedusaN214.png");
           Greenfoot.delay(1);
    }
}
