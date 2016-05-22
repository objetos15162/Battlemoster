import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase sirve como contador de puntos y de vidas de acuerdo a su inicializacion.
 */
public class DisparoD extends Actor
{
    //Variables que necesita la clase
    private Nivel1 mundo;
    private Nivel2 mundo2;
    private Nivel3 mundo3;
    
    private int direccion;
    private int nivel;
    
    /**
     * Este metodo es el constructor de la misma clase, al crear un objeto de esta pide como parametro el nivel (un numero) para saber a quien pretenece y la 
     * direccion para enviar al objeto a la derecha o a la izquierda.
     */
    public DisparoD(int nivel,int direccion)
    {
        this.nivel=nivel;
        this.direccion=direccion;
    }
    
    
    /**
     * Este metodo es un loop infinito que siempre ejecuta lo que este en su interior.
     */
    public void act() 
    {
        muevete();
        checaOrilla();
    }    
    
    
    /**
     * Este metodo solo hace que el objeto se mueva a la izquierda.
     */
    public void muevete()
    {
        if(direccion==1)
          setLocation(getX()+2, getY());
        else
          setLocation(getX()-2, getY());
    }  
    
    /**
     * Esta Metodo es utilizado para detectar si la bala a tocado alguna orilla de la pantalla.
     */
    public void checaOrilla()
    {
        if(nivel==1)
        {
          mundo = (Nivel1)getWorld();
          if(this.isAtEdge())
          {
            mundo.removeObject(this);
          }
        }
        
        if(nivel==2)
        {
          mundo2 = (Nivel2)getWorld();
          if(this.isAtEdge())
          {
            mundo2.removeObject(this);
          }
        }
        
        if(nivel==3)
        {
          mundo3 = (Nivel3)getWorld();
          if(this.isAtEdge())
          {
            mundo3.removeObject(this);
          }
        }
    }
}
