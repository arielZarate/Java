public class Producto
{
    private int codigo;
    private int tipo;  // un valor entre 0 y 3
    private float precio;
    
    public Producto()
    {
    }
    
    public Producto(int c)
    {
       codigo = c;
    }
    
    public Producto(int c, int t, float p)
    {
       codigo = c;
       // si el tipo es incorrecto, lo deja en cero
       if(t >= 0 && t <= 3) tipo = t;
       precio = p;
    }
    
    public int getCodigo()
    {
        return codigo;
    }
    
    public int getTipo()
    {
        return tipo;
    }

    public float getPrecio()
    {
        return precio;
    }
    
    public void setCodigo(int c)
    {
        codigo = c;
    }
    
    public void setTipo(int t)
    {
       // si el tipo es incorrecto, lo deja como estaba
       if(t >= 0 && t <= 3) tipo = t;
    }
    
    public void setPrecio(float p)
    {
        precio = p;
    }
    
    public String toString()
    {
        String r = "Código: " + codigo;
        r += "\tTipo: " + tipo;
        r += "\tPrecio: " + precio;
        return r;
    }
}
