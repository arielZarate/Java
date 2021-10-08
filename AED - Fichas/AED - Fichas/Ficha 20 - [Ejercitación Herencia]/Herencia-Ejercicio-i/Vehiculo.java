/**
 * Representa un vehículo a la venta en una concesionaria.
 * 
 * @author Ing. Valerio Frittelli
 * @version Agosto de 2008
 */
public class Vehiculo
{
    protected String marca;
    protected int modelo;
    protected float precio;
    
    /**
     * Constructor por defecto. Deja los atributos en valor default.
     */
    public Vehiculo()
    {
    }
    
    /**
     * Inicializa los atributos de acuerdo a los parámetros.
     * @param mar marca del vehículo a crear.
     * @param mod modelo del vehículo.
     * @param sal precio del vehículo.
     */
    public Vehiculo(String mar, int mod, float pre)
    {
      marca = mar;
      modelo = mod;
      precio = pre;
    }
    
    /**
     *  Método de consulta la marca del vehículo.
     *  @return un String con la marca del vehículo.
     */
    public String getMarca()
    {
       return marca;   
    }

    /**
     *  Método de consulta el modelo o año del vehículo.
     *  @return un int con el modelo del vehículo.
     */
    public int getModelo()
    {
       return modelo;   
    }
    
    /**
     *  Método de consulta el precio del vehículo.
     *  @return un float con el precio del vehículo.
     */
    public float getPrecio()
    {
       return precio;   
    }

    /**
     *  Método modificador para la marca del vehículo.
     *  @param mar la nueva marca.
     */
    public void setMarca( String mar)
    {
       marca = mar;   
    }

    /**
     *  Método modificador para el modelo del vehículo.
     *  @param mod el nuevo modelo del vehículo.
     */
    public void setModelo( int mod )
    {
       modelo = mod;   
    }

    /**
     *  Método modificador para el precio del vehículo.
     *  @param pre el nuevo precio del vehículo.
     */
    public void setPrecio( float pre )
    {
       precio = pre;   
    }

    /**
     *  Actualiza el precio del vehículo, aplicando simplemente un aumento del 5% sobre su
     *  precio anterior.
     */
    public void actualizarPrecio( )
    {
        float a = precio * 0.05f;
        precio += a;
    }
    
    /** 
     *  Redefinición del método toString
     *  @return el contenido del objeto en forma String con formato adecuado para ser visualizado
     */
    public String toString()
    {
       return "Marca: " + marca +  " - Modelo: " + modelo + " - Precio: " + precio;
    }
}