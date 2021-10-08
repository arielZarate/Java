public class Laboratorio
{
    private String nombre;
    private int cantidad;
    
    public Laboratorio()
    {
        nombre = "Desconocido";
    }
    
    public Laboratorio( String nom, int cant )
    {
        nombre = nom;
        cantidad = cant;
    }

    public Laboratorio( int cant )
    {
        nombre = "Desconocido";
        cantidad = cant;
    }

    public int getCantidad()
    {
        return cantidad;   
    }
    
    public void setCantidad( int cant )
    {
        cantidad = cant;   
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;   
    }

    public String toString()
    {
        return "Nombre: " + nombre + "\tCantidad de medicamentos provista: " + cantidad;
    }
}
