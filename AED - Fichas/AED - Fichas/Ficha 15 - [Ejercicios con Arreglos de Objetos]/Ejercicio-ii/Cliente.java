public class Cliente
{
    private int dni;
    private String nombre;
    private float importe;
    
    public Cliente()
    {
    }
    
    public Cliente(int d, String nom, float imp)
    {
        dni = d;
        nombre = nom;
        importe = imp;
    }

    public Cliente (int d)
    {
        dni = d;
    }

    public int getDNI()
    {
        return dni;   
    }
    
    public void setDNI(int d)
    {
        dni = d;   
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;   
    }

    public float getImporte()
    {
        return importe;   
    }
    
    public void setImporte(float f)
    {
        if ( f >= 0 ) importe = f;   
    }

    public String toString()
    {
        return "DNI: " + dni + "\tNombre: " + nombre + "\tImporte última compra: " + importe; 
    }
}
