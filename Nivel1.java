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
public class Nivel1 extends World
{
    private Heroe hN1 = new Heroe(1);
    
    private Cangrejo canN1 = new Cangrejo();;
    private Medusa medN1 = new Medusa(1);
    private Medusa med2N1 = new Medusa(1);
    
    private Mina amN1 = new Mina();
    private Mina bmN1 = new Mina();
    
    private Caja caN1= new Caja(1);
    private Caja2 ca2N1= new Caja2(1);
    private SimpleTimer tiempoN1 = new SimpleTimer();
    
    Tablero puntosN1;
    Tablero vidasN1;
   
    
    /**
     * Metodo que especifica las dimeciones del la pantalla asi como el menu y el otros niveles.
     */
    public Nivel1()
    {    
        super(900, 600, 1); 
        Greenfoot.setWorld(new Menu());
        construyeNivelN1();
    }
    
    
    /**
     * El metodo  atc (esta funcion es un ciclo infinito que va a ejecutando cada metodo en su interior).
     */
    public void act()
    {
        if(puntosN1.obtenerValor()<5)
        {
          posicionesN1();
          disparoN1();
          checarPosicionHeroeN1();
        }
        else
        {
            elimina_escenario();
            Greenfoot.setWorld(new Nivel2());
        }
    }
    
    
    /**
     * Esta Metodo inicializa todo el primer nivel colando los objetos previamente ya declarados es una posicion determinada.
     */
    public void construyeNivelN1()
    {
        
        setBackground("Fondo Nivel 1.png");
        
        addObject(hN1, 150, 140);
        
        addObject(medN1, 899, 500);
        addObject(med2N1, 899, 400);
        addObject(canN1, 1, 550);
        
        addObject(amN1,250,1);
        addObject(bmN1,450,1);
        
        addObject(caN1,899,0);
        addObject(ca2N1,500,0);
        
        puntosN1 =new Tablero(0,"puntaje:");
        vidasN1 =new Tablero(10,"vidas:");
        
        addObject(puntosN1,150,85);
        addObject(vidasN1,300,85);        
    }
    
    
    /**
     * Metodo que es ejecutado si nuestro heroe fue alcansado por algun enemigo, quitando una vida a nuestro heroe.
     */
    public void heroeAlcanzado()
    {
        hN1.pierdeUnaVida();
        hN1.setLocation(150, 140);
    }
    
    
    /**
     * Metodos que debuelve la posicion de nuestro heroe a quien lo solicite(en X).
     */
    public int obtenXDeHeroe()
    {
        return hN1.dimeX();
    }
    
    /**
     * Metodos que debuelve la posicion de nuestro heroe a quien lo solicite(en Y).
     */
    public int obtenYDeHeroe()
    {
        return hN1.dimeY();
    }
    
    
    /**
     * Metodos que agrega el dispara del enemigo.
     */
    public void agregaDispIzq()
    {
        addObject(new DisparoD(1,0),hN1.dimeX(), hN1.dimeY());
    }
    
    public void agregaDispDer()
    {
        addObject(new DisparoD(1,1),hN1.dimeX() ,hN1.dimeY());
    }
    
    
    /**
     * Metodo que checa si a tocada el borde, de ser cierto es colocado en una posicion de reinicio.
     */
    public void posicionesN1()
    {
        int x,y; 

         if(caN1.getWorld ()!= null)
         {
              if(caN1.borde()==1)
                {
                   removeObject(caN1);           
                }
         }
         else 
         {
             if(caN1.getWorld ()==null && tiempoN1.millisElapsed()>30000 )
             {
                 x=Greenfoot.getRandomNumber(899);
                 addObject(caN1,x,1);
             }
         }
         
         if(ca2N1.getWorld ()!= null)
         {
              if(ca2N1.borde()==1)
                {
                   removeObject(ca2N1);           
                }
         }
         else 
         {
             if(caN1.getWorld ()==null && tiempoN1.millisElapsed()>50000 )
             {
                 x=Greenfoot.getRandomNumber(899);
                 addObject(ca2N1,x,1);
             }
         }

        if(medN1.borde()==1)
        {
            removeObject(medN1);
            y=Greenfoot.getRandomNumber(500);
            addObject(medN1,899,y);
        }
        
        if(med2N1.borde()==1)
        {
            removeObject(med2N1);
            y=Greenfoot.getRandomNumber(500);
            addObject(med2N1,899,y);
        }
        
        if(canN1.borde()==1)
        {
            removeObject(canN1);
            addObject(canN1,1,550);
        }
       
        if(amN1.borde()==1)
        {
            removeObject(amN1);
            x=Greenfoot.getRandomNumber(598);
            addObject(amN1,x,0);
        }
        
        if(bmN1.borde()==1)
        {
            removeObject(bmN1);
            x=Greenfoot.getRandomNumber(598);
            addObject(bmN1,x,0);
        }
    }
    
    
    /**
     * Metodo que verifica si algun enemigo a sido alcanzado por nuestra bala. 
     */
    public void disparoN1()
    {
        int y,x;
        
        if(medN1.disparo()==1)
        {
         removeObject(medN1);
         puntosN1.incrementa();
         y=Greenfoot.getRandomNumber(500);
         addObject(medN1,899,y);
        } 
        
         if(med2N1.disparo()==1)
        {
            removeObject(med2N1);
            puntosN1.incrementa();
            y=Greenfoot.getRandomNumber(500);
            addObject(med2N1,899,y);
        }
        
        if(canN1.disparo()==1)
        {
        removeObject(canN1);
        puntosN1.incrementa();
        addObject(canN1,1,550);
        }      
        
        if(amN1.disparo()==1)
        {
            removeObject(amN1);
            x=Greenfoot.getRandomNumber(598);
            addObject(amN1,x,0);
        }
        
        if(bmN1.disparo()==1)
        {
            removeObject(bmN1);
            x=Greenfoot.getRandomNumber(598);
            addObject(bmN1,x,0);
        }
    } 
    
    
    /**
     * Este metodo verifica si nuestro heroe a tocada el fondo, de aver sido a si, al heroe se el baja una vida y sele regresa a la posicion de reinicio.
     */
    public void checarPosicionHeroeN1()
    {
        if(hN1.dimeY()>=590)
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
