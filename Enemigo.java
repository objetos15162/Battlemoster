import greenfoot.*;

/**
 * Oscar Efren Macias Ramirez
 * Universidad Autonoma de San Luis Potosi
 * Area de Computacion e Informatica
 * 20 de Mayo del 2016
 * Vercion 1.0
 */

/**
 * Esta clase se creo para evitar la duplicidad de codigo, en ella se encuentra verificar borde,disparo,mover y sigue.
 * El metodo borde checa si algun enemigo a tocado el borde de la pantalla.
 * El metodo disparo verifica si la bala del heroe a tocado algun enemigo.
 * El metodo mover sirve para mover el objeto en una unidad hacia la derecha.
 * El metodo sigue es para que el objeto pueda seguir a heroe.
 */
public class Enemigo extends Actor
{ 
  private Nivel1 mundo;
  private Nivel2 mundo2;
  private Nivel3 mundo3;
  public int nivel=0;
   /**
    * Este metodo verifica si algun enemigo a tocado el borde de la patalla.
    */
    public int borde()
    {
        int x=0;
        if(this.getX()==0)
        {
            x=1;
        }
        if(this.getX()==899)
        {
            x=1;
        }
        if(this.getY()==599)
        {
            x=1;
        }
        if(this.getY()==0)
        {
            x=1;
        }
        return(x);
    }
    
    
   /**
   * Este metodo verifiaca si algun enemigo a sido alcanzado por la bala del heroe.
   */
   public int disparo()
   {
        int x=0;
         if(this.isTouching(DisparoD.class))
         {
             x=1;
             removeTouching(DisparoD.class);
         }
        return(x);
   }
   
  /**
  *Esta metodo hace que el objeto se mueva en una unidad hacia adelante.
  */
  public void mover()
  {
      move(1);
  }
  
  /**
   * Este metodo pide las coordenadas a mundo del heroe para que nuestro objeto pueda seguirl
   */
  public void sigue()
  {
    int vel,res; 
    vel = 1; //Establece la velocidad con que seguirá al héroe.
    if(nivel==1)
    {
       mundo = (Nivel1)getWorld();
       res=(((mundo.obtenXDeHeroe()-getX())^2)+((mundo.obtenYDeHeroe()-getY())^2))^(1/2);
        
        if(res<=10)
       {
         if ( mundo.obtenXDeHeroe() > getX() )
         {
            setLocation( getX()+vel, getY() );
         }
         else if ( mundo.obtenXDeHeroe() < getX() )
         {
            setLocation( getX()-vel, getY() );
         }
         if ( mundo.obtenYDeHeroe() > getY() )
         {
            setLocation( getX(), getY()+vel );
         }
         else if ( mundo.obtenYDeHeroe() < getY() )
         {
            setLocation( getX(), getY()-vel );
         }
       }
        else
       {
          move(-1);
       }
    } 
    
    if(nivel==2)
    {
      mundo2 = (Nivel2)getWorld();
      res=(((mundo2.obtenXDeHeroe()-getX())^2)+((mundo2.obtenYDeHeroe()-getY())^2))^(1/2);
        
      if(res<=10)
      {
        if ( mundo2.obtenXDeHeroe() > getX() )
        {
            setLocation( getX()+vel, getY() );
        }
        else if ( mundo2.obtenXDeHeroe() < getX() )
        {
            setLocation( getX()-vel, getY() );
        }
        if ( mundo2.obtenYDeHeroe() > getY() )
        {
            setLocation( getX(), getY()+vel );
        }
        else if ( mundo2.obtenYDeHeroe() < getY() )
        {
            setLocation( getX(), getY()-vel );
        }
      }
      else
      {
          move(-1);
      } 
    }
    
    if(nivel==3)
    {
      mundo3 = (Nivel3)getWorld();
      res=(((mundo3.obtenXDeHeroeN3()-getX())^2)+((mundo3.obtenYDeHeroeN3()-getY())^2))^(1/2);
        
      if(res<=10)
      {
        if ( mundo3.obtenXDeHeroeN3() > getX() )
        {
            setLocation( getX()+vel, getY() );
        }
        else if ( mundo3.obtenXDeHeroeN3() < getX() )
        {
            setLocation( getX()-vel, getY() );
        }
        if ( mundo3.obtenYDeHeroeN3() > getY() )
        {
            setLocation( getX(), getY()+vel );
        }
        else if ( mundo3.obtenYDeHeroeN3() < getY() )
        {
            setLocation( getX(), getY()-vel );
        }
      }
      else
      {
          move(1);
      }
    }
  }
}
