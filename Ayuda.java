import greenfoot.*;

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Este Escenario es puesto cuando necesitamos la auyda de este juego.
 */
public class Ayuda extends World
{
    //Boton de regreso
    private BotonRegresar regresa;
    
    /**
     * Este metodo pre-inicializa la pantalla.
     */
    public Ayuda()
    {    
        super(900, 600, 1); 
        setBackground("FondoA.png");
        muestraBoton();
    }
    
    
    /**
     * Este metodo coloca los objetos en la patalla.
     */
    public void muestraBoton()
    {
        regresa = new BotonRegresar();
        
        addObject(regresa, 799, 36);
    }
    
    
    /**
     * Este metodo es un loop infinito(siempre se esta ejecutando).
     */
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)
        {
            if(Greenfoot.mousePressed(regresa))
            {
                Greenfoot.setWorld(new Menu());
            }
        }
    }
}
