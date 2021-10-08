/**
 * Representa un vehiculo de carga b�sico.
 * 
 * @author Ing. Valerio Frittelli.
 * @version Agosto de 2008.
 */
public class Carga extends Vehiculo
{
    private int tara;  // capacidad de carga del veh�culo, en toneladas  

    /**
     * Constructor por defecto
     */
    public Carga()
    {
    }
    
    /**
     * Constructor con par�metros para cada atributo. 
     * @param mar la marca del veh�culo.
     * @param mod el modelo del veh�culo.
     * @param pre el precio del veh�culo.
     * @param tar capacidad de carga del veh�culo.
     */
    public Carga(String mar, int mod, float pre, int tar)
    {
        super(mar, mod, pre);   // invoca al constructor de la super clase con tres par�metros
        tara = tar;  
    }
    
    /**
     *  M�todo de consulta para la capacidad de carga.
     *  @return un int con la capacidad de carga.
     */
    public int getTara()
    {
       return tara;   
    }
    
    /**
     *  M�todo modificador para la capacidad de carga.
     *  @param tar la nueva capacidad de carga.
     */
    public void setTara( int tar )
    {
       tara = tar;   
    }

    /** 
     *  Redefinici�n del m�todo toString
     *  @return el contenido del objeto en forma String con formato adecuado para ser visualizado
     */
    public String toString()
    { 
       // observar la forma de invocar a un m�todo de la super clase
       return super.toString() + " - Tara: " + tara;
    }
}
