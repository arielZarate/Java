public class Venta
{
    private int vendedor;    // código del vendedor que hizo la venta
    private int cantidad;    // cantidad de artículos vendida
    private float importe;   // importe de esa venta
    
    public Venta()
    {
        vendedor = 0;
        cantidad = 0;
        importe  = 0;
    }
    
    public Venta(int v)
    {
        vendedor = v;
        cantidad = 0;
        importe  = 0;
    }
    
    public Venta(int v, int c, float i)
    {
        vendedor = v;
        cantidad = c;
        importe  = i;
    }
    
    public int getVendedor()
    {
        return vendedor;   
    }
    
    public void setVendedor(int v)
    {
        vendedor = v;   
    }
    
    public int getCantidad()
    {
        return cantidad;   
    }
    
    public void setCantidad(int c)
    {
        vendedor = c;   
    }
    
    public float getImporte()
    {
        return importe;   
    }
    
    public void setImporte(float i)
    {
        importe = i;   
    }
    
    public String toString()
    {
        String r = "Venta del vendedor " + vendedor;
        r = r + "\tCantidad de artículos: " + cantidad;
        r += "\tImporte: " + importe;
        return r;
    }
}
