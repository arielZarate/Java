/**
 * Representa un vehículo a la venta en una concesionaria.
 * 
 * @author Ing. Valerio Frittelli
 * @version Agosto de 2008
 */
public class Vehiculo
{
    private String marca;
    private int modelo;
    private float precio;
    
   
    public Vehiculo()
    {
    }
    
    public Vehiculo(String mar, int mod, float pre)
    {
      marca = mar;
      modelo = mod;
      precio = pre;
    }
    
    public String getMarca()
    {
       return marca;   
    }
    
    public int getModelo()
    {
       return modelo;   
    }
  
    public float getPrecio()
    {
       return precio;   
    }

    public void setMarca( String mar)
    {
       marca = mar;   
    }

    public void setModelo( int mod )
    {
       modelo = mod;   
    }

    public void setPrecio( float pre )
    {
       precio = pre;   
    }

    public void actualizarPrecio( )
    {
        float a = precio * 0.05f;
        precio += a;
    }
    
    public String toString()
    {
       return "Marca: " + marca +  " Modelo: " + modelo + " Precio: " + precio;
    }
}