

public class Carga extends Vehiculo
{
    private int capacidad;  // capacidad de carga del vehículo 

    
    public Carga()
    {
    }
    
  
    public Carga(String mar, int mod, float pre, int cap)
    {
        super(mar, mod, pre);  
        capacidad = cap;  
    }
    
    public int getCapacidad()
    {
       return capacidad;   
    }
    

    public void setCapacidad( int cap )
    {
       capacidad = cap;   
    }

    public String toString()
    { 
       return super.toString() + "\tCapacidad: " + capacidad+ "Tn";
    }
}
