/**
 * Representa un vehículo particular básico.
 * 
 * @author Ing. Valerio Frittelli.
 * @version Agossto de 2008
 */
public class Particular extends Vehiculo
{
    private int puertas;  // la cantidad de puertas del vehículo.
    
    /**
     * Constructor por defecto. 
     */
    public Particular()
    {
    }
    
    /**
     * Constructor con parámetros para cada atributo. 
     * @param mar la marca del vehículo.
     * @param mod el modelo del vehículo.
     * @param pre el precio del vehículo.
     * @param pue la cantidad de puertas del vehículo.
     */
    public Particular(String mar, int mod, float pre, int pue)
    {
        super(mar, mod, pre);   // invoca al constructor de la super clase con tres parámetros
        puertas = pue;  
    }   
    /**
     *  Método de consulta para la cantidad de puertas.
     *  @return un int con la cantidad de puertas.
     */
    public int getPuertas()
    {
       return puertas;   
    }
    
    /**
     *  Método modificador para la cantidad de puertas.
     *  @param pue la nueva cantidad de puertas.
     */
    public void setPuertas( int pue )
    {
       puertas = pue;   
    }

    /**
     * Actualiza el precio del vehiculo. Redefine el método heredado desde Vehiculo.
     */
    public void actualizarPrecio ()
    {
       float p = getPrecio();
       float a = p * 0.03f;
       p += a;
       if (getModelo() > 2005)
       {
            p += 400;    
       }
       setPrecio(p);
    }

    /** 
     *  Redefinición del método toString
     *  @return el contenido del objeto en forma String con formato adecuado para ser visualizado
     */
    public String toString()
    { 
       // observar la forma de invocar a un método de la super clase
       return super.toString() + " - Cantidad de puertas: " + puertas;
    }
}
