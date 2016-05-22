import greenfoot.*;
import java.util.*;

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Metodo que pre-inicia todo en el juego.
 */
public class Nivel3 extends World
{
    private Heroe hN3 = new Heroe(3);
    
    private RobotN3 robN3 = new RobotN3(3);
    private MedusaN3 medN3 = new MedusaN3(3);
    private MedusaIN3 med2N3 = new MedusaIN3(3);
    
    private Mina amN3 = new Mina();
    private Mina bmN3 = new Mina();
    private Mina cmN3 = new Mina();
    private Mina dmN3 = new Mina();
    
    private NaveN3 navN3 = new NaveN3();
    private NaveN3 nav2N3 = new NaveN3();
    
    private Caja caN3 = new Caja(3);
    private Caja2 ca2N3 = new Caja2(3);

    private SimpleTimer tiempoN3 = new SimpleTimer();
    
    Tablero puntosN3;
    Tablero vidasN3;
   
    
    /**
     * Metodo que especifica las dimeciones del la pantalla asi como el menu y el otros niveles.
     */
    public Nivel3()
    {    
        super(900, 600, 1); 
        Greenfoot.setWorld(new Menu());
        construyeNivelN3();
    }
    
    
    /**
     * El metodo  atc(esta funcion es un ciclo infinito que va ejecutando cada metodo en su interior).
     */
    public void act()
    {        
        posicionesN3();
        disparoN3();
        checarPosicionHeroeN3();
        if(puntosN3.obtenerValor()<15)
        {
           posicionesN3();
           disparoN3();
           checarPosicionHeroeN3();
        }
        else
        {
            elimina_escenario();
            Ganaste g=new Ganaste();
            addObject(g,((getWidth()/2)+30),((getHeight()/2)+150));
            Greenfoot.delay(10000);
            Greenfoot.setWorld(new Menu());
        }
    }
    
    
    /**
     * Esta Metodo inicializa todo el primer nivel colando los objetos previamente ya declarados es una posicion determinada.
     */
    public void construyeNivelN3()
    {
        
        setBackground("Fondo Nivel 3.png");
        
        addObject(hN3, 150, 140);
        
        addObject(medN3, 1, 500);
        addObject(med2N3, 899, 300);
        
        addObject(robN3, 899, 500);
        
        addObject(amN3,250,1);
        addObject(bmN3,450,1);
        addObject(cmN3,250,1);
        addObject(dmN3,450,1);
        
        addObject(navN3, 1, 250);
        addObject(nav2N3, 1, 300);
        
        addObject(caN3,899,0);
        addObject(ca2N3,500,0);
        
        puntosN3=new Tablero(0,"puntaje:");
        vidasN3=new Tablero(20,"vidas:");
        
        addObject(puntosN3,150,85);
        addObject(vidasN3,300,85);        
    }
    
    
    /**
     * Metodo que es ejecutado si nuestro heroe fue alcansado por algun enemigo, quitando una vida a nuestro heroe.
     */
    public void heroeAlcanzadoN3()
    {
        hN3.pierdeUnaVida();
        hN3.setLocation(150, 140);
    }
    
    
    /**
     * Metodos que debuelve la posicion de nuestro heroe a quien lo solicite.
     */
    public int obtenXDeHeroeN3()
    {
        return hN3.dimeX();
    }
    
    public int obtenYDeHeroeN3()
    {
        return hN3.dimeY();
    }
    
    
    /**
     * Metodos que agrega el dispara del enemigo.
     */
    public void agregaDispIzqN3()
    {
        addObject(new DisparoD(3,0),hN3.dimeX(), hN3.dimeY());
    }
    
    public void agregaDispDerN3()
    {
        addObject(new DisparoD(3,1),hN3.dimeX() ,hN3.dimeY());
    }
    
    
    /**
     * Metodo que checa si a tocada el borde, de ser cierto es colocado en una posicion de reinicio.
     */
    public void posicionesN3()
    {
        int x,y; 

         if(caN3.getWorld ()!= null)
         {
              if(caN3.borde()==1)
                {
                   removeObject(caN3);           
                }
         }
         else 
         {
             if(caN3.getWorld ()==null && tiempoN3.millisElapsed()>30000 )
             {
                 x=Greenfoot.getRandomNumber(899);
                 addObject(caN3,x,1);
             }
         }
         
         if(ca2N3.getWorld ()!= null)
         {
              if(ca2N3.borde()==1)
                {
                   removeObject(ca2N3);           
                }
         }
         else 
         {
             if(caN3.getWorld ()==null && tiempoN3.millisElapsed()>50000 )
             {
                 x=Greenfoot.getRandomNumber(899);
                 addObject(ca2N3,x,1);
             }
         }

        if(robN3.borde()==1)
        {
            removeObject(robN3);
            y=Greenfoot.getRandomNumber(500);
            addObject(robN3,899,y);
        }
        
        if(navN3.borde()==1)
        {
            removeObject(navN3);
            y=Greenfoot.getRandomNumber(500);
            addObject(navN3,1,y);
        }
        
        if(nav2N3.borde()==1)
        {
            removeObject(nav2N3);
            y=Greenfoot.getRandomNumber(500);
            addObject(nav2N3,1,y);
        }
        
        if(medN3.borde()==1)
        {
            removeObject(medN3);
            y=Greenfoot.getRandomNumber(500);
            addObject(medN3,1,y);
        }
        
        if(med2N3.borde()==1)
        {
            removeObject(med2N3);
            y=Greenfoot.getRandomNumber(500);
            addObject(med2N3,899,y);
        }
       
        if(amN3.borde()==1)
        {
            removeObject(amN3);
            x=Greenfoot.getRandomNumber(598);
            addObject(amN3,x,0);
        }
        
        if(bmN3.borde()==1)
        {
            removeObject(bmN3);
            x=Greenfoot.getRandomNumber(598);
            addObject(bmN3,x,0);
        }
        
        if(cmN3.borde()==1)
        {
            removeObject(cmN3);
            x=Greenfoot.getRandomNumber(598);
            addObject(cmN3,x,0);
        }
        
        if(dmN3.borde()==1)
        {
            removeObject(dmN3);
            x=Greenfoot.getRandomNumber(598);
            addObject(dmN3,x,0);
        }
    }
    
    
    /**
     * Metodo que verifica si algun enemigo a sido alcanzado por nuestra bala. 
     */
    public void disparoN3()
    {
        int y,x;
        
        if(robN3.disparo()==1)
        {
         removeObject(robN3);
         puntosN3.incrementa();
         y=Greenfoot.getRandomNumber(500);
         addObject(robN3,1,y);
        } 
        
        if(amN3.disparo()==1)
        {
            removeObject(amN3);
            x=Greenfoot.getRandomNumber(598);
            addObject(amN3,x,0);
        }
        
        if(bmN3.disparo()==1)
        {
            removeObject(bmN3);
            x=Greenfoot.getRandomNumber(598);
            addObject(bmN3,x,0);
        }
        
        if(cmN3.disparo()==1)
        {
            removeObject(cmN3);
            x=Greenfoot.getRandomNumber(598);
            addObject(cmN3,x,0);
        }
        
        if(dmN3.disparo()==1)
        {
            removeObject(dmN3);
            x=Greenfoot.getRandomNumber(598);
            addObject(dmN3,x,0);
        }
        
         if(navN3.disparo()==1)
        {
            removeObject(navN3);
            y=Greenfoot.getRandomNumber(500);
            puntosN3.incrementa();
            addObject(navN3,899,y);
        }
        
         if(nav2N3.disparo()==1)
        {
            removeObject(nav2N3);
            y=Greenfoot.getRandomNumber(500);
            puntosN3.incrementa();
            addObject(nav2N3,899,y);
        }
        
        if(medN3.disparo()==1)
        {
            removeObject(medN3);
            y=Greenfoot.getRandomNumber(500);
            puntosN3.incrementa();
            addObject(medN3,1,y);
        }
        
        if(med2N3.disparo()==1)
        {
            removeObject(med2N3);
            y=Greenfoot.getRandomNumber(500);
            puntosN3.incrementa();
            addObject(med2N3,1,y);
        }
    } 
    
    
    /**
     * Este metodo verifica si nuestro heroe a tocada el fondo, de aver sido a si, al heroe se el baja una vida y sele regresa a la posicion de reinicio.
     */
    public void checarPosicionHeroeN3()
    {
        if(hN3.dimeY()>=590)
        {
         heroeAlcanzadoN3();
        }
    }
    
    
    /**
     * Este metodo es ejecutado cuando hemos logrado el limite para cambiar de nivel
     * eliminando absolutamente todo.
     */
     public void elimina_escenario()
    {
        List lista_mundo = getObjects(null);
        Iterator i = lista_mundo.iterator();
        while(i.hasNext())
        {
            Actor a = (Actor) i.next();
            if( a!= null ) 
            {
                removeObject(a);
            }
        }
    }
    
}