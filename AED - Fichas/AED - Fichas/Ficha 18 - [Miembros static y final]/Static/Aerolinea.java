public class Aerolinea
{
    public  static final String REGULADOR = "Ministerio de Obras y Servicios Públicos";
    private final String nombre; 
    private static int contador; 
    
    public Aerolinea(String nom)
    {
       nombre = nom; 
       contador = 0;
    }
    
    public String getNombre()
    {
      return nombre;   
    }
    
    /*
    public void setNombre(String nom)
    {
        nombre = nom;   
    }
    //*/
}
