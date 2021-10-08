/**
 * Representa un veh�culo a la venta en una concesionaria.
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
     * Inicializa los atributos de acuerdo a los par�metros.
     * @param mar marca del veh�culo a crear.
     * @param mod modelo del veh�culo.
     * @param sal precio del veh�culo.
     */
    public Vehiculo(String mar, int mod, float pre)
    {
      marca = mar;
      modelo = mod;
      precio = pre;
    }
    
    /**
     *  M�todo de consulta la marca del veh�culo.
     *  @return un String con la marca del veh�culo.
     */
    public String getMarca()
    {
       return marca;   
    }

    /**
     *  M�todo de consulta el modelo o a�o del veh�culo.
     *  @return un int con el modelo del veh�culo.
     */
    public int getModelo()
    {
       return modelo;   
    }
    
    /**
     *  M�todo de consulta el precio del veh�culo.
     *  @return un float con el precio del veh�culo.
     */
    public float getPrecio()
    {
       return precio;   
    }

    /**
     *  M�todo modificador para la marca del veh�culo.
     *  @param mar la nueva marca.
     */
    public void setMarca( String mar)
    {
       marca = mar;   
    }

    /**
     *  M�todo modificador para el modelo del veh�culo.
     *  @param mod el nuevo modelo del veh�culo.
     */
    public void setModelo( int mod )
    {
       modelo = mod;   
    }

    /**
     *  M�todo modificador para el precio del veh�culo.
     *  @param pre el nuevo precio del veh�culo.
     */
    public void setPrecio( float pre )
    {
       precio = pre;   
    }

    /**
     *  Actualiza el precio del veh�culo, aplicando simplemente un aumento del 5% sobre su
     *  precio anterior.
     */
    public void actualizarPrecio( )
    {
        float a = precio * 0.05f;
        precio += a;
    }
    
    /** 
     *  Redefinici�n del m�todo toString
     *  @return el contenido del objeto en forma String con formato adecuado para ser visualizado
     */
    public String toString()
    {
       return "Marca: " + marca +  " - Modelo: " + modelo + " - Precio: " + precio;
    }
}