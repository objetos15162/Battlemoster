import greenfoot.*;

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Este escenario es el primero en mostrarce al ejecutar el programa
 * en ella estan las opciones de ayuda y juego.
 */
public class Menu extends World
{
    //Declaracion de los botones disponibles en el juego
    private BotonInicio inicio;
    private BotonAyuda ayuda;
    
    /**
     * Este metodo inicializa la pantalla.
     */
    public Menu()
    {    
        super(900, 600, 1); 
        
        setBackground("Fondo Menú.jpg");
        muestraBotones();
    }
    
    
    /**
     * Este metodo coloca en la pantalla nuestros objetos.
     */
    public void muestraBotones()
    {        
        inicio = new BotonInicio();
        ayuda = new BotonAyuda();
        
        addObject(inicio, 450, 300);
        addObject(ayuda, 450, 400);
    }
    
    
    
    /**
     * Este metodo es un loop infinito(verifica simepre lo que esta en su interior).
     */
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)
        {
            if(Greenfoot.mousePressed(inicio))
            {
                Greenfoot.setWorld(new Nivel1());
            }
            
            if(Greenfoot.mousePressed(ayuda))
            {
                Greenfoot.setWorld(new Ayuda());
            }
        }
    }
}
