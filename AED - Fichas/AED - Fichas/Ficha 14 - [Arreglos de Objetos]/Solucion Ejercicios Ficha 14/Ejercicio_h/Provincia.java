public class Provincia
{
    private String nombre;
    private float media;
    
    public Provincia()
    {
        nombre = "Desconocido";
    }
    
    public Provincia( String nom, float med )
    {
        nombre = nom;
        media = med;
    }

    public float getMedia()
    {
        return media;   
    }
    
    public void setMedia( float med )
    {
        media = med;   
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public void setNombre( String nom )
    {
        nombre = nom;   
    }

    public String toString()
    {
        return "Provincia: " + nombre + "\tTemperatura media: " + media;
    }
}
