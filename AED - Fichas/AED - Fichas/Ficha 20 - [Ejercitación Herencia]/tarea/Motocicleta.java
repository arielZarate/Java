
public class Motocicleta extends Vehiculo
{
   private int cilindrada;
   
   public Motocicleta()
   {
    
   }
    public Motocicleta(String mar, int mod, float pre, int cil)
    {
        super(mar, mod, pre);   
        cilindrada = cil;  
    }   
    public int getCilindrada()
    {
       return cilindrada;   
    }
     public void setCilindrada( int cil )
    {
       cilindrada = cil;   
    }
    public void actualizarPrecio ()
    {
       float p = getPrecio();
       float a = p * 0.02f;
       p += a;
       if (getModelo() == 2008)
       {
            p += p*0.01f;    
       }
       setPrecio( p );
    }
    public String toString()
    {
        return super.toString()+"\n\tCilindrada: "+cilindrada;
    }

    
   
}
