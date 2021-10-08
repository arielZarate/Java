public class Auto
{
    private int codigo;
    private String nombre;
    private float precio;
    private int pais;
    
    public Auto()
    {
        nombre = "Desconocido";
    }
    
    public Auto( int cod, String nom, float pre, int ps )
    {
        codigo = cod;
        nombre = nom;
        precio = pre;
        pais = ps;
    }

    public int getCodigo()
    {
        return codigo;   
    }
    
    public void setCodigo( int cod )
    {
        codigo = cod;   
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;   
    }

    public float getPrecio()
    {
        return precio;   
    }
    
    public void setPrecio( int pre )
    {
        precio = pre;   
    }
    
    public int getPais()
    {
        return pais;   
    }
    
    public void setPais( int ps )
    {
        pais = ps;   
    }

    public String toString()
    {
        return "Codigo: " + codigo + "\tNombre: " + nombre + "\tPrecio: " + precio + "\tNúmero de pais: " + pais;
    }
}
