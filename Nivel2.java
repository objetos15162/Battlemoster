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
public class Nivel2 extends World
{
    //Declaracion de objetos en el juego a usar
    private Heroe hN2 = new Heroe(2);
    
    private CangrejoN2 canN2 = new CangrejoN2();;
    private MedusaN2 medN2 = new MedusaN2(2);
    
    private Mina amN2 = new Mina();
    private Mina bmN2 = new Mina();
    
    private Caja caN2 = new Caja(2);
    private Caja2 ca2N2 = new Caja2(2);
    
    private RobotN2 rb1N2= new RobotN2();
    private RobotN2 rb2N2=new RobotN2();

    private SimpleTimer tiempoN2 = new SimpleTimer();
    
    Tablero puntosN2;
    Tablero vidasN2;
   
    
    /**
     * Metodo que especifica las dimeciones del la pantalla asi como el menu y el otros niveles.
     */
    public Nivel2()
    {    
        super(900, 600, 1); 
        Greenfoot.setWorld(new Menu());
        construyeNivelN2();
    }
    
    
    /**
     * El metodo  atc=esta funcion es un ciclo infinito que va ejecutando cada metodo en su interior.
     */
    public void act()
    {        
        if(puntosN2.obtenerValor()<10)
        {
          posicionesN2();
          disparoN2();
          checarPosicionHeroeN2();
        }
        else
        {
            elimina_escenario();
            Greenfoot.setWorld(new Nivel3());
        }
    }
    
    
    /**
     * Esta Metodo inicializa todo el primer nivel colando los objetos previamente ya declarados es una posicion determinada.
     */
    public void construyeNivelN2()
    {
        
        setBackground("Fondo Nivel 2.png");
        
        addObject(hN2, 150, 140);
        
        addObject(medN2, 899, 500);
        addObject(canN2, 1, 550);
        
        addObject(amN2,250,1);
        addObject(bmN2,450,1);
        
        addObject(caN2,899,0);
        addObject(ca2N2,500,0);
        
        addObject(rb1N2, 1, 300);
        addObject(rb2N2, 1, 450);
        
        puntosN2=new Tablero(0,"puntaje:");
        vidasN2=new Tablero(10,"vidas:");
        
        addObject(puntosN2,150,85);
        addObject(vidasN2,300,85);        
    }
    
    
    /**
     * Metodo que es ejecutado si nuestro heroe fue alcansado por algun enemigo, quitando una vida a nuestro heroe.
     */
    public void heroeAlcanzado()
    {
        hN2.pierdeUnaVida();
        hN2.setLocation(150, 140);
    }
    
    
    /**
     * Metodos que debuelve la posicion de nuestro heroe a quien lo solicite.
     */
    public int obtenXDeHeroe()
    {
        return hN2.dimeX();
    }
    
    public int obtenYDeHeroe()
    {
        return hN2.dimeY();
    }
    
    
    
    /**
     * Metodos que agrega el diapara del enemigo.
     */
    public void agregaDispIzq()
    {
        addObject(new DisparoD(2,0),hN2.dimeX(), hN2.dimeY());
    }
    
    public void agregaDispDer()
    {
        addObject(new DisparoD(2,1),hN2.dimeX() ,hN2.dimeY());
    }
    
    
    
    /**
     * Metodo que checa si a tocada el borde, de ser cierto es colocado en una posicion de reinicio.
     */
    public void posicionesN2()
    {
        int x,y; 

         if(caN2.getWorld ()!= null)
         {
              if(caN2.borde()==1)
                {
                   removeObject(caN2);           
                }
         }
         else 
         {
             if(caN2.getWorld ()==null && tiempoN2.millisElapsed()>30000 )
             {
                 x=Greenfoot.getRandomNumber(899);
                 addObject(caN2,x,1);
             }
         }
         
         if(ca2N2.getWorld ()!= null)
         {
              if(ca2N2.borde()==1)
                {
                   removeObject(ca2N2);           
                }
         }
         else 
         {
             if(caN2.getWorld ()==null && tiempoN2.millisElapsed()>50000 )
             {
                 x=Greenfoot.getRandomNumber(899);
                 addObject(ca2N2,x,1);
             }
         }

        if(medN2.borde()==1)
        {
            removeObject(medN2);
            y=Greenfoot.getRandomNumber(500);
            addObject(medN2,899,y);
        }
        
        if(canN2.borde()==1)
        {
            removeObject(canN2);
            addObject(canN2,1,550);
        }
       
        if(amN2.borde()==1)
        {
            removeObject(amN2);
            x=Greenfoot.getRandomNumber(598);
            addObject(amN2,x,0);
        }
        
        if(bmN2.borde()==1)
        {
            removeObject(bmN2);
            x=Greenfoot.getRandomNumber(598);
            addObject(bmN2,x,0);
        }
        
        if(rb1N2.borde()==1)
        {
            removeObject(rb1N2);
            y=Greenfoot.getRandomNumber(500);
            addObject(rb1N2,1,y);
        }
        
        if(rb2N2.borde()==1)
        {
            removeObject(rb2N2);
            y=Greenfoot.getRandomNumber(500);
            addObject(rb2N2,1,y);
        }
    }
    
    
    /**
     * Metodo que verifica si algun enemigo a sido alcanzado por nuestra bala. 
     */
    public void disparoN2()
    {
        int y,x;
        
        if(medN2.disparo()==1)
        {
           removeObject(medN2);
           y=Greenfoot.getRandomNumber(500);
           addObject(medN2,899,y);
           //puntos.decrementa();
           puntosN2.incrementa();
        } 
        
        if(canN2.disparo()==1)
        {
           removeObject(canN2);
           puntosN2.incrementa();
           addObject(canN2,1,550);
        }      
        
        if(amN2.disparo()==1)
        {
            removeObject(amN2);
            puntosN2.incrementa();
            x=Greenfoot.getRandomNumber(598);
            addObject(amN2,x,0);
        }
        
        if(bmN2.disparo()==1)
        {
            removeObject(bmN2);
            puntosN2.incrementa();
            x=Greenfoot.getRandomNumber(598);
            addObject(bmN2,x,0);
        }
        
        if(rb1N2.disparo()==1)
        {
            removeObject(rb1N2);
            puntosN2.incrementa();
            y=Greenfoot.getRandomNumber(500);
            addObject(rb1N2,1,y);
        } 
        
        if(rb2N2.disparo()==1)
        {
            removeObject(rb2N2);
            puntosN2.incrementa();
            y=Greenfoot.getRandomNumber(500);
            addObject(rb2N2,1,y);
        } 
    } 
    
    
    /**
     * Este metodo verifica si nuestro heroe a tocada el fondo, de aver sido a si, al heroe se el baja una vida y sele regresa a la posicion de reinicio.
     */
    public void checarPosicionHeroeN2()
    {
        if(hN2.dimeY()>=590)
        {
         heroeAlcanzado();
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