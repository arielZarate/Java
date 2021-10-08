/**
 * Esta clase se usa para representar un contador de frecuencias.
 * Se usa contenida en alguna estructura de datos.
 * @author Ing. Valerio Frittelli 
 * @version 2.0 - 20/03/2005
 */

public class Contador
{
    private int dni;         // la clave a contar
    private int frecuencia;  // la cantidad de veces que aparece la clave

    /**
     * Constructor por defecto para objectos de la clase Contador
     */
    public Contador()
    {
        frecuencia = 1;
    }

    /**
     * Constructor sobrecargado para objectos de la clase Contador
     * @param clave   el valor de la clave a almacenar
     */
    public Contador(int clave)
    {
       dni = clave; 
       frecuencia = 1;
    }

    /**
     * Método de acceso al valor de la clave
     * @return     el valor del atributo clave 
     */
    public int getDni()
    {
       return dni;
    }

    /**
     * Método de acceso al valor del contador
     * @return     el valor del atributo frecuencia 
     */
    public int getFrecuencia()
    {
       return frecuencia;
    }

    /**
     * Método modificador del atributo dni
     * @param clave   el valor a almacenar como dni 
     */
    public void setDni(int clave)
    {
       dni = clave;
    }

    /**
     * Método modificador del atributo frecuencia
     * @param valor   el valor a almacenar en el frecuencia 
     */
    public void setFrecuencia(int valor)
    {
       frecuencia = valor;
    }

    /**
     * Método para incrementar el atributo frecuencia
     */
    public void contar()
    {
       frecuencia++;
    }

    /**
     * Método para sobre escribir toString (heredado desde Object)
     * @return   una cadena representando los valores contenidos
     */
    public String toString()
    {
       return "Dni: " + dni + "\t" + "Frecuencia: " + frecuencia;
    }
    

}
