
/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Clase creada por Greenfoot que recoge el tiempo de la maquina del momento de su ejecucion 
 * y sirve como contador de tiempo
 */
public class SimpleTimer  
{
  private long lastMark = System.currentTimeMillis();
    
    public void mark()
    {
        lastMark = System.currentTimeMillis();
    }
    
    public int millisElapsed()
    {
        return (int) (System.currentTimeMillis() - lastMark);
    }
}
