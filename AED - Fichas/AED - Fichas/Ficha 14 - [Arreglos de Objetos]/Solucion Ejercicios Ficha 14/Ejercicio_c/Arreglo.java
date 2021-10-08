public class Arreglo
{
    private int v[];
    
    public Arreglo()
    {
       v = new int[5];   
    }
    
    public Arreglo(int n)
    {
       if (n <= 0) n = 5;
       v = new int[n];   
    }
    
    public int length()
    {
        return v.length;    
    }
    
    public int getComponent(int i)
    {
        return v[i];   
    }
    
    public void setComponent(int x, int i)
    {
        v[i] = x;   
    }
    
    public void multiplicar(int k)
    {
        int i;
        for (i = 0; i < v.length; i++)
        {
            v[i] = v[i] * k;
        }
    }
    
    public int buscar (int x)
    {
        for (int i = 0; i < v.length; i++)
        {
            if(v[i] == x) { return i; }   
        }
        return -1;
    }

    public int busquedaBinaria(int x)
    {
        int iz = 0;
        int de = v.length - 1;
        while (iz <= de)
        { 
            int c = (de + iz) / 2;
            if ( v[c] == x ) return c; 
            else 
            {
                if (x > v[c]) iz = c + 1;
                else  de = c - 1;
            }
        }
        return -1;
    }

    public void ordenar()
    {
        int i , j;
        int n = v.length;
        for (i = 0; i < n - 1; i++)
        {
             for (j = i + 1; j < n; j++)
             {
                 if (v[i] > v[j])
                 {
                     int aux = v[i];
                     v[i] = v[j];
                     v[j] = aux;
                 }
             }
        }
    }
    
    public int menor()
    {
        // retorna el índice del menor valor contenido
        // en el vector...
        
        int m = 0;
        for( int i = 1; i < v.length; i++ )
        {
            if( v[i] < v[m] ) m = i;
        }
        return m;
    }
    
    public float promedio()
    {
        int ac = 0;
        for( int i = 0; i < v.length; i++ )
        {
            ac += v[i];
        }
        return ( float ) ac / v.length;
    }
    
    public int negativos()
    {
        int cn = 0;
        for( int i = 0; i < v.length; i++ )
        {
            if( v[i] < 0 ) cn++;
        }
        return cn;
    }
    
    public Arreglo invertir()
    {
        // crea OTRO objeto de la clase Arreglo, tal
        // que sus elementos están invertidos respecto
        // del que invocó al método...
        
        int n = v.length;
        Arreglo nuevo = new Arreglo( n );
        for( int i = 0; i < n; i++ )
        {
            nuevo.v[i] = v[(n - 1) - i];
        }
        return nuevo;
    }
    
    public Arreglo repetidos( Arreglo b )
    {
        // crea un tercer objeto de la clase Arreglo, 
        // tal que contiene los elementos que estaban
        // en los dos arreglos originales (el que llamó
        // al método y el que entró como parámetro...)
        
        int n = v.length;
        int m = b.length();
        
        int c = 0;
        for( int i = 0; i < n; i++ )
        {
            int x = v[i];
            for( int j = 0; j < m; j++ )
            { 
                int y = b.v[j];
                if( x == y ) c++;
            }
        }
        if( c == 0 ) return null;
        Arreglo nuevo = new Arreglo( c );
        
        c = 0;
        for( int i = 0; i < n; i++ )
        {
            int x = v[i];
            for( int j = 0; j < m; j++ )
            { 
                int y = b.v[j];
                if( x == y ) 
                {
                    nuevo.v[c] = x;
                    c++;
                }
            }
        }
        return nuevo;    
    }
    
    public float modulo()
    {
        float ac = 0;
        for( int i = 0; i < v.length; i++ )
        {
            float cuad = ( float ) Math.pow( v[i], 2 );
            ac += cuad;
        }
        return ( float ) Math.sqrt( ac );
    }

    public String toString()
    {
        String r = "{ ";
        for (int i = 0; i < v.length; i++)
        {
            r = r + v[i];
            if (i != v.length - 1) { r = r + ", "; }
        }
        r = r + " }";
        return r;
    }
}
