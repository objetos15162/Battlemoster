import greenfoot.*;

/**
 * Write a description of class Minan3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinAN3 extends EnemigoN3
{
    public void act() 
    {
       setLocation(getX(),getY()+1);
       super.borde();
       super.disparo();
    } 
}