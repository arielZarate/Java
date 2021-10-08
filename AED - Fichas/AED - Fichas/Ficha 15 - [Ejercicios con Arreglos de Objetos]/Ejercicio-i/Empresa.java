public class Empresa
{
    private Producto productos[]; // arreglo de objetos: referencia a la clase Productos
    private int primeroNull;  // índice del primer casillero nulo
    private String nombre;
    
    public Empresa()
    {
        nombre = "Informática UTN";
        productos = new Producto[5];
        primeroNull = 0;
    }
     
    public Empresa(String nom)
    {
        nombre = nom;
        productos = new Producto[5];
        primeroNull = 0;
    }
    
    public Empresa(int n)
    {
        nombre = "Informática UTN";
        if (n <= 0) n = 5;
        productos = new Producto[n];
        primeroNull = 0;
    }
    
    public Empresa(String nom, int n)
    {
        nombre = nom;
        if (n <= 0) n = 5;
        productos = new Producto[n];
        primeroNull = 0;
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public int getCantidadProductos()
    {
        return productos.length;    
    }
    
    public Producto getProducto(int i)
    {
        if (i >= 0 && i < productos.length) return productos[i];
        return null;
    }

    public void setProducto(Producto p)
    {
        if (p == null) return;
        if (primeroNull < productos.length)
        {
            productos[primeroNull] = p;
            primeroNull++;
        }
    }
    
    public Producto getMayorPrecioTipo3()
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return null;
        
        Producto mpt3 = null;
        for( int i = 0; i < primeroNull; i++ )
        {
            if( productos[i].getTipo() == 3 )
            {
                   if( mpt3 == null || productos[i].getPrecio() > mpt3.getPrecio() )
                   {
                        mpt3 = productos[i];    
                   }
            }
        }
        return mpt3;
    }
    
    public Producto getTipo1CodigoX( int x )
    {
        // controlamos si en el vector hay datos...

        
        for( int i = 0; i < primeroNull; i++ )
        {
            if( productos[i].getTipo() == 1  && productos[i].getCodigo() == x )
            {
                return productos[i];    
            }
        }
        return null;           
    }
    
    public String toStringMayoresPreciosOrdenCodigo( float p )
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return "No hay datos...";
        
        int i, n = primeroNull;
        for( i = 0; i < n - 1; i++)
        {
           for( int j = i + 1; j < n; j++ )
           {
                if( productos[i].getCodigo() > productos[j].getCodigo() )    
                {
                    Producto aux = productos[i];
                    productos[i] = productos[j];
                    productos[j] = aux;
                }
           }
        }
        
        String r = "Productos con precio mayor a " + p + ":";
        for( i = 0; i < n; i++ )
        {
            if (productos[i].getPrecio() > p)
            {
                r += "\n" + productos[i].toString();   
            }
        }
        return r;
    }
    
    public String toStringCantidadPorTipo()
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return "No hay datos...";
        
        int i, c[] = new int[4]; // un vector de conteos...
        for( i = 0; i < primeroNull; i++ )
        {
             int t = productos[i].getTipo();
             c[ t ]++;
        }
        
        String r = "Cantidad de Productos por tipo:";
        for( i = 0; i < 4; i++)
        {
            r += "\nTipo " + i + "\tCantidad de Productos: " + c[i];   
        }
        return r;
    }
    
    public String toString()
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return "No hay datos...";

        String r = "Empresa: " + nombre + "\t - Productos disponibles:";
        for( int i = 0; i < primeroNull; i++)
        {
            r += "\n" + productos[i].toString();   
        }
        return r;
    }
}