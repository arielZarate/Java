package SimpleList05.clases;

public class Cliente implements Comparable
{
    private int dni;
    private String nombre;
    
    public Cliente()
    {
    }

    public Cliente(int d, String nom)
    {
      dni = d;
      nombre = nom;
    }
    
    public int getDni()
    {
       return dni;   
    }

    public String getNombre()
    {
       return nombre;   
    }
    
    public void setDni( int num )
    {
       dni = num;   
    }

    public void setNombre( String nom )
    {
       nombre = nom;   
    }

    @Override
    public String toString()
    {
       return "Dni del cliente: " + dni +  " - Nombre: " + nombre;
    }

    @Override
    public int compareTo(Object x)
    {
       Cliente c = (Cliente) x;
       return this.getDni() - c.getDni(); 
    }
}
