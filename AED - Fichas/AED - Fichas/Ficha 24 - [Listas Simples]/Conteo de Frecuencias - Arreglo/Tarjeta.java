/**
 * Representa una tarjeta de control de entrada, con una clave (que puede ser el dni) y el nombre de la persona dueña de 
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
     * Inicializa la clave y el nombre con los parámetros
     */
    public Tarjeta (int d, String nom)
    {
       dni = d; 
       nombre = nom;
    }

    /**
     * Método de acceso al valor del dni
     * @return el valor del dni 
     */
    public int getDni()
    {
       return dni;
    }

    /**
     * Método de acceso al valor del nombre
     * @return el valor del nombre 
     */
    public String getNombre()
    {
       return nombre;
    }

    /**
     * Método modificador del dni
     * @param d el valor a almacenar como dni 
     */
    public void setDni(int d)
    {
       dni = d;
    }

    /**
     * Método modificador del nombre
     * @param nom el valor a almacenar como nombre
     */
    public void setNombre(String nom)
    {
       nombre = nom;
    }

    /**
     * Método para redefinir el método toString heredado desde Object
     * @return  una cadena representando los valores contenidos
     */
    public String toString()
    {
       return "Dni: " + dni + "\tNombre: " + nombre;
    }
}
