public class Negocio
{
    private Cliente clientes[];
    private int primeroNull;  // índice del primer casillero nulo
    private String nombre;
    
    public Negocio()
    {
        nombre = "Textiles Unidos";
        clientes = new Cliente[5];
        primeroNull = 0;
    }
    
    public Negocio(String nom)
    {
        nombre = nom;
        clientes = new Cliente[5];
        primeroNull = 0;
    }
    
    public Negocio(int n)
    {
        nombre = "Textiles Unidos";
        if (n <= 0) n = 5;
        clientes = new Cliente[n];
        primeroNull = 0;
    }
    
    public Negocio(String nom, int n)
    {
        nombre = nom;
        if (n <= 0) n = 5;
        clientes = new Cliente[n];
        primeroNull = 0;
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public int getCantidadClientes()
    {
        return clientes.length;    
    }
    
    public Cliente getCliente(int i)
    {
        // puede retornar null...
        if (i >= 0 && i < clientes.length) return clientes[i];
        return null;
    }

    public void setCliente(Cliente p)
    {
        if (p == null) return;
        if (primeroNull < clientes.length)
        {
            clientes[primeroNull] = p;
            primeroNull++;
        }
    }
    
    public Cliente getMayorImporte()
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return null;
        
        Cliente mpt3 = null;
        for( int i = 0; i < primeroNull; i++ )
        {
                   if( mpt3 == null || clientes[i].getImporte() > mpt3.getImporte() )
                   {
                        mpt3 = clientes[i];    
                   }
        }
        return mpt3;
    }
    
    public Cliente buscar( int num )
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return null;
        
        for( int i = 0; i < primeroNull; i++ )
        {
            if( clientes[i].getDNI() == num )
            {
                return clientes[i];    
            }
        }
        return null;           
    }
    
    public String toStringImportesMenoresA200(  )
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return "No hay datos...";
        
        // odenamos el arreglo alfabéticamente, por nombres.
        int i, n = primeroNull;
        for( i = 0; i < n - 1; i++)
        {
           for( int j = i + 1; j < n; j++ )
           {
                String nomi = clientes[i].getNombre();
                String nomj = clientes[j].getNombre();
                int r = nomi.compareTo( nomj );
                
                if( r > 0 )    
                {
                    Cliente aux = clientes[i];
                    clientes[i] = clientes[j];
                    clientes[j] = aux;
                }
           }
        }
        
        String r = "Clientes con importe de última compra menor a 200:";
        for( i = 0; i < n; i++ )
        {
            if ( clientes[i].getImporte() < 200 )
            {
                r += "\n" + clientes[i].toString();   
            }
        }
        return r;
    }
    
    public int getCantidadImportesMayorAlPromedio()
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return 0;
        
        int i;
        float ac = 0;
        for( i = 0; i < primeroNull; i++ )
        {
             ac += clientes[i].getImporte();
        }
        float prom = ac / primeroNull;
        
        int c = 0;
        for( i = 0; i < primeroNull; i++ )
        {
            if( clientes[i].getImporte() > prom ) c++;
        }
        return c;
    }
    
    public String toString()
    {
        // controlamos si en el vecto   r hay datos...
        if( primeroNull == 0 ) return "No hay datos...";

        String r = "Negocio: " + nombre + "\t - Clientes disponibles:";
        for( int i = 0; i < primeroNull; i++)
        {
            r += "\n" + clientes[i].toString();   
        }
        return r;
    }
}
