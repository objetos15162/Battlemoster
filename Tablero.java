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
 * Esta clase sirve como contador de puntos y de vidas de acuerdo a su inicializacion.
 */
public class Tablero extends Actor
{
     //Variables necesarias
    GreenfootImage imagen;
    int cont;
    String mensaje;
    
    /**
     * Este metodo es el constructor de la clase en ella se esta estableciendo las configuraciones de un texto con cierto tamaño.
     */
    public Tablero(int c,String msj)
    {
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("Verdana",Font.BOLD,24));
        dibuja();
    }
    
    
    /**
     * Este metodo dibuja lo que establecio el constructor.
     */
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje+cont,20,20);
        setImage(imagen);
    }
    
    
    /**
     * Este metodo incrementa el tablero en una unidad.
     */
    public void incrementa()
    {
        cont++;
        dibuja();
    }
    
    
    /**
     * Este metodo decrementa el tablero en una unidad.
     */
    public void decrementa()
    {
        cont--;
        dibuja();
    }
    
    
    /**
     * Este metodo regresa el valor del tablero a quien lo requiera.
     */
    public int obtenerValor()
    {
        return(cont);
    }
    
}
