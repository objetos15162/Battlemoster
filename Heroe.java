import greenfoot.*;

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase es una de las mas importes ya que este es nuestro heroe, en ella se encuentra todo lo indispensable que requiere el heroe.
 */
public class Heroe extends Actor

{
    //Variables necesarias para las clases
    private Nivel1 mundo;
    private Nivel2 mundo2;
    private Nivel3 mundo3;
    
    private SimpleTimer tiempo = new SimpleTimer();
    private int velocidadDisparo=250;
    private int dir = 1;    //Dirección hacia la que está mirando el héroe. Se usará para determinar la dirección de sus disparos.
    private int nivel;
    
    
    /**
     * Construtor del hero, este se le asigna un nivel.
     */
    public Heroe(int nivel)
    {
        this.nivel=nivel;
    }
    
    
    /**
     * Este metodo es un loop y ejecuta todo lo que este dentro sullo.
     */
    public void act() 
    {
        muevete();
        hundete();
        dir = dimeDir();
        
        dispara();
        verificaAlcanzado();
        contadordeVidas();
        verificarTocarCaja();
    }    
   
    
    /**
     * Metodo que verifica si el jugador presiono una tecla validad, su funcion es mover al heroe.
     */
    public int muevete()
    {
        int w=0;
        
        if(Greenfoot.isKeyDown("left"))
        {       
            w=2;
            move(-3);
            dir = 0;
            setImage("SubmarinoI1.png");
        }
        if(Greenfoot.isKeyDown("right"))
        {
            w=1;
            move(3);
            dir = 1;
            setImage("SubmarinoD1.png");
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-3);
            setLocation(getX(),getY()-2);
            dir = 1;
            setImage("SubmarinoD1.png");
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+3);
            dir = 1;
            setImage("SubmarinoD1.png");
        }
        return w;
    }
    
    
    /**
     * Este metodo simula el undimiento por el agua.
     */
    public void hundete()
    {
        setLocation(getX(),getY() +1);
    }
   
    
    /**
     * Retorna la posicon de nuestro heroe (ejemplo derecha o izquierda).
     */
    public int dimeDir()
    {
        return dir;
    }
    
    
    /**
     * Metodos que regresan el valor de la posicion del heroe(a el mundo).
     */
        public int dimeX()
    {
        return this.getX();
    }
    
    public int dimeY()
    {
        return this.getY();
    }
    
    //Funciones que tiene un grado de seleccion deacuerdo al nivel
    
    
    /**
     * Este metodo verifica si el jugador a presionado la letra "A" de ser cierto manda a mundo colocar una baja de acuerdo a su posicion.
     */
    public void dispara()
    {
        
        if(nivel==1)
        {
            mundo = (Nivel1)getWorld();
            if(Greenfoot.isKeyDown("a")&&tiempo.millisElapsed()>velocidadDisparo)
            {
              if(dir==0)
                mundo.agregaDispIzq();
              else if (dir==1)
                mundo.agregaDispDer();
              tiempo.mark();
            }
       }
        
       if(nivel==2)
       {
           mundo2 = (Nivel2)getWorld();
           if(Greenfoot.isKeyDown("a")&&tiempo.millisElapsed()>velocidadDisparo)
           {
              if(dir==0)
               mundo2.agregaDispIzq();
              else if (dir==1)
               mundo2.agregaDispDer();
               tiempo.mark();
            }
       }
       
       if(nivel==3)
       {
          mundo3 = (Nivel3)getWorld();
          if(Greenfoot.isKeyDown("a")&&tiempo.millisElapsed()>velocidadDisparo)
          {
            if(dir==0)
                mundo3.agregaDispIzqN3();
            else if (dir==1)
                mundo3.agregaDispDerN3();
            tiempo.mark();
          }
       }
    }
    
    
    /**
     * Este metodo verifica si nuestro heroe fue alcanzado por algun enemigo de ser cierto, manda a mundo un mensaje de perder una vida.
     */
    public void verificaAlcanzado()
    {
        if(nivel==1)
        {
          mundo = (Nivel1)getWorld();  
          if(this.isTouching(Enemigo.class))
          {
            mundo.heroeAlcanzado();
          }
        
          if(this.isTouching(Mina.class))
          {
             mundo.heroeAlcanzado();
          }
        }
        
        if(nivel==2)
        {
          mundo2 = (Nivel2)getWorld();
          if(this.isTouching(Enemigo.class))
          {
            mundo2.heroeAlcanzado();
          }
        
          if(this.isTouching(Mina.class))
          {
             mundo2.heroeAlcanzado();
          }
        }
        
        if(nivel==3)
        {
          mundo3 = (Nivel3)getWorld();  
          if(this.isTouching(Enemigo.class))
          {
            mundo3.heroeAlcanzadoN3();
          }
        
          if(this.isTouching(Mina.class))
          {
             mundo3.heroeAlcanzadoN3();
          }
        }
    }
    
    
    /**
     * Este metodo verifica si nuestro heroe a perdido todas sus vidas, de ser cierto coloca un mensaje se perder y  para el juego.
     */
     public void contadordeVidas()
    {
        if(nivel==1)
        {
           Nivel1 mundo=(Nivel1)getWorld();
           if(mundo.vidasN1.obtenerValor()<=0)
           {
             GameOver t=new GameOver();
             getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
           }
        }
        
        if(nivel==2)
        {
            Nivel2 mundo2=(Nivel2)getWorld();
            if(mundo2.vidasN2.obtenerValor()<=0)
            {
              GameOver t=new GameOver();
              getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
            }
        }
        
        if(nivel==3)
        {
            Nivel3 mundo3=(Nivel3)getWorld();
            if(mundo3.vidasN3.obtenerValor()<=0)
            {
              GameOver t=new GameOver();
              getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
            }
        }
    }
    
    
    /**
     * Este metodo  hace que a nuestro heroe se le baje una vida(en via el emsaje a el mundo).
     */
    public void pierdeUnaVida()
    {
       if(nivel==1)
       {
          Nivel1 mundo =(Nivel1)getWorld();  
          mundo.vidasN1.decrementa();
       }
       if(nivel==2)
       {
          Nivel2 mundo2 =(Nivel2)getWorld();
          mundo2.vidasN2.decrementa();
       }
       
       if(nivel==3)
       {
          Nivel3 mundo3 =(Nivel3)getWorld();
          mundo3.vidasN3.decrementa();
       }
    }
    
    
    /**
     * Metodo que verifica si a tocado a una caja, de ser cierto dependiendo de la caja esta incrementa una vida o 1 punto de velocidad de rafaga de disparo.
     */
    public int verificarTocarCaja()
    {
        int x=0;
        if(nivel==1)
        {
            Nivel1 mundo =(Nivel1)getWorld(); 
             if(this.isTouching(Caja.class))
             {
                mundo.vidasN1.incrementa();
                x=1;
             }
             if(this.isTouching(Caja2.class))
             {
                velocidadDisparo=velocidadDisparo-100;
                x=1;
             }
        }
        
        if(nivel==2)
        {
            Nivel2 mundo2 =(Nivel2)getWorld(); 
            if(this.isTouching(Caja.class))
            {
              mundo2.vidasN2.incrementa();
              x=1;
            }
            if(this.isTouching(Caja2.class))
            {
              velocidadDisparo=velocidadDisparo-100;
              x=1;
             }
        }
        
        if(nivel==3)
        {
          Nivel3 mundo3 =(Nivel3)getWorld(); 
          if(this.isTouching(Caja.class))
          {
            mundo3.vidasN3.incrementa();
            x=1;
          }
          if(this.isTouching(Caja2.class))
          {
            velocidadDisparo=velocidadDisparo-100;
            x=1;
          }
        }
        return (x);
    }   
 
}
