public class Envio
{
    private int numero;    // numero de cliente 
    private int categoria; // categoria del cliente: un valor entre 0 y 3
    private int tipo;      // tipo de envio: un valor entre 0 y 14
    private int destino;   // destino del envío: un valor entre 0 y 2
    private float precio;  // importe pagado por el envío.
    
    public Envio()
    {
    }
    
    public Envio(int nc)
    {
       numero = nc;
    }
    
    public Envio(int nc, int ct, int t, int d, float p)
    {
       numero = nc;
       categoria = ct;
       tipo = t;
       destino = d;
       precio = p;
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    public int getCategoria()
    {
        return categoria;
    }

    public int getTipo()
    {
        return tipo;
    }

    public int getDestino()
    {
        return destino;
    }
    
    public float getPrecio()
    {
        return precio;
    }
    
    public void setNumero(int nc)
    {
        numero = nc;
    }
    
    public void setTipo(int t)
    {
       tipo = t;
    }
    
    public void setCategoria (int ct)
    {
       categoria = ct;
    }

    public void setdestino(int d)
    {
       destino = d;
    }

    public void setPrecio(float p)
    {
        precio = p;
    }
    
    public String toString()
    {
        String r = "Cliente: " + numero;
        r += "\tCategoria: " + categoria;
        r += "\tTipo de envío: " + tipo;
        r += "\tDestino: " + destino;
        r += "\tPrecio: " + precio;
        return r;
    }
}
