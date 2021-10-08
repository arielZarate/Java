/**
 * Representa una tarjeta de control de entrada, con una clave (que puede ser el dni) y el nombre de la persona due�a de 
 * la Tarjeta.
 * 
 * @author Ing. Valerio Frittelli
 * @version Marzo de 2005
 */
public class Tarjeta  
{
    private int dni;     
    private String nombre;  
    
    /**
     * Constructor por defecto. 
     */
    public Tarjeta()
    {
    }

    /**
     * Inicializa la clave y el nombre con los par�metros
     */
    public Tarjeta (int d, String nom)
    {
       dni = d; 
       nombre = nom;
    }

    /**
     * M�todo de acceso al valor del dni
     * @return el valor del dni 
     */
    public int getDni()
    {
       return dni;
    }

    /**
     * M�todo de acceso al valor del nombre
     * @return el valor del nombre 
     */
    public String getNombre()
    {
       return nombre;
    }

    /**
     * M�todo modificador del dni
     * @param d el valor a almacenar como dni 
     */
    public void setDni(int d)
    {
       dni = d;
    }

    /**
     * M�todo modificador del nombre
     * @param nom el valor a almacenar como nombre
     */
    public void setNombre(String nom)
    {
       nombre = nom;
    }

    /**
     * M�todo para redefinir el m�todo toString heredado desde Object
     * @return  una cadena representando los valores contenidos
     */
    public String toString()
    {
       return "Dni: " + dni + "\tNombre: " + nombre;
    }
}
