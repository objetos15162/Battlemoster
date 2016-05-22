import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta es una clase es usado cuando hemos ganado el juego.
 */
public class Ganaste extends Actor
{
    //Variables necesarias
    GreenfootImage imagen;
    String mensaje;
    
    /**
     * Este metodo es es llamado cuando hemos ganado el juego, nos manda un mensaje de ganaste.
     */
    public Ganaste()
    {
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(250,100,0,255));
        imagen.setFont(new Font("Verdana",Font.BOLD,34));
        imagen.drawString("GANASTE",0,30);
        setImage(imagen);  
    }   
}