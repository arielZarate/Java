
public class Particular extends Vehiculo
{
    private int puertas;  // cantidad de puertas del vehículo.
    
    public Particular()
    {
    }
    
    public Particular(String mar, int mod, float pre, int pue)
    {
        super(mar, mod, pre);  
        puertas = pue;  
    }  
    
    public int getPuertas()
    {
       return puertas;   
    }
    
   
    public void setPuertas( int pue )
    {
       puertas = pue;   
    }

    public void actualizarPrecio ()
    {
       float p = getPrecio();
       float a = p * 0.03f;
       p += a;
       if (getModelo() > 2005)
       {
            p += 400;    
       }
       setPrecio(p);
    }

    
    public String toString()
    { 
      
       return super.toString() + " Cantidad de Puertas: " + puertas;
    }
}
