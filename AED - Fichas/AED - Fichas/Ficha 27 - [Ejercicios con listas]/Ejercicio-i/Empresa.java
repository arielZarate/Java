public class Empresa
{
    private String nombre;     // nombre de la empresa
    private Envio envios[];    // el vector que se carga por teclado
    private SimpleList lista;  // la lista con los envios con importe mayor 
    
    public Empresa()
    {
        this("Andreani", 5);
    }
    
    public Empresa(String nom)
    {
        this(nom, 5);
    }
    
    public Empresa(String nom, int n)
    {
        nombre = nom;
        if (n <= 0) n = 5;
        envios = new Envio[n];
        lista = new SimpleList();
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public int getCantidadEnvios()
    {
        return envios.length;    
    }
    
    public Envio getEnvio(int i)
    {
        Envio x;
        try
        {
            x = envios[i];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            x = null;
        }
        return x;
    }

    public void setEnvio(int i, Envio p)
    {
        if (p == null) return;
        try
        {
            envios[i] = p;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {   
        }
    }
    
    public void importesMayores(float x)
    {
        lista.clear();
        for( int i = 0; i < envios.length; i++ )
        {
            if( envios[i] != null  && envios[i].getPrecio() > x )
            {
                    lista.addFirst( envios[i] );
            }
        }
    }
    
    public String getImportePorTipo(  )
    {
        float c [] = new float [15];
        
        for( Node p = lista.getFrente(); p != null; p = p.getNext() )
        {
            int ind = p.getInfo().getTipo();
            try
            {
                c[ind]+= p.getInfo().getPrecio();
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
            }
        }
        StringBuffer r = new StringBuffer("Importe acumulado por tipo de envio: ");
        for( int i = 0; i < c.length; i++)
        {
            r.append("\nTipo: " + i + "\tImporte acumulado: " + c[i]);
        }
        return r.toString();
    }
    
    public Envio getEnvio2MayorImporte(  )
    {
        Envio mi = null;
        for( Node p = lista.getFrente(); p != null; p = p.getNext() )
        {
            if( p.getInfo().getCategoria() == 2 )
            {
                if ( mi == null ) mi = p.getInfo();
                else
                {
                    if( p.getInfo().getPrecio() > mi.getPrecio() )   mi = p.getInfo();
                }
            }
        }
        return mi;
    }
        
    public String toStringCantidadPorCategoriaYDestino()
    {
        int m[][] = new int[3][4];  // filas: destinos - columnas: categorias
        for( Node p = lista.getFrente(); p != null; p = p.getNext() )
        {
            Envio en = p.getInfo();
            int f = en.getDestino();
            int c = en.getCategoria();
            try
            {
                m[f][c]++;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
            }
        }
        StringBuffer r = new StringBuffer("Cantidad de envíos por destino y categoría: ");
        for( int i = 0; i < m.length; i++)
        {
            for ( int j = 0; j < m[i].length; j++)
            {
                if (m[i][j] != 0)
                {
                    r.append("\nDestino: " + i + "\tCategoria: " + j + "\tCantidad: " + m[i][j]);
                }
            }
        }
        return r.toString();
    }
    
    public Envio buscarEnvio(int num)
    {
        Envio en = new Envio(num);
        return lista.search( en );   
    }
    
    public String toString()
    {
        StringBuffer r = new StringBuffer("Empresa de correos: " + nombre + "\nVector de Envios");
        for( int i = 0; i < envios.length; i++)
        {
            if (envios[i] != null) r.append ("\n" + envios[i].toString() );   
        }
        r.append("\nLista de envíos");
        for( Node p = lista.getFrente(); p != null; p = p.getNext() )
        {
            r.append( "\n" + p.toString() );   
        }
        return r.toString();
    }
}
