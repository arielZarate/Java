/**
 * Representa un vehiculo de carga básico.
 * 
 * @author Ing. Valerio Frittelli.
 * @version Agosto de 2008.
 */
public class Carga extends Vehiculo
{
    private int tara;  // capacidad de carga del vehículo, en toneladas  

    /**
     * Constructor por defecto
     */
    public Carga()
    {
    }
    
    /**
     * Constructor con parámetros para cada atributo. 
     * @param mar la marca del vehículo.
     * @param mod el modelo del vehículo.
     * @param pre el precio del vehículo.
     * @param tar capacidad de carga del vehículo.
     */
    public Carga(String mar, int mod, float pre, int tar)
    {
        super(mar, mod, pre);   // invoca al constructor de la super clase con tres parámetros
        tara = tar;  
    }
    
    /**
     *  Método de consulta para la capacidad de carga.
     *  @return un int con la capacidad de carga.
     */
    public int getTara()
    {
       return tara;   
    }
    
    /**
     *  Método modificador para la capacidad de carga.
     *  @param tar la nueva capacidad de carga.
     */
    public void setTara( int tar )
    {
       tara = tar;   
    }

    /** 
     *  Redefinición del método toString
     *  @return el contenido del objeto en forma String con formato adecuado para ser visualizado
     */
    public String toString()
    { 
       // observar la forma de invocar a un método de la super clase
       return super.toString() + " - Tara: " + tara;
    }
}
