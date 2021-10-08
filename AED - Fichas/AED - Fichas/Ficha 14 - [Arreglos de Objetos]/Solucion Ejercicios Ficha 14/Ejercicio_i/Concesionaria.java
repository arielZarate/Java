public class Concesionaria
{
    private String nombre;
    private Auto cars[];
    
    public Concesionaria()
    {
       nombre = "Concesionaria UTN";
       cars = new Auto[5];
    }
    
    public Concesionaria( int n )
    {
       if( n <= 0 ) n = 5;
       nombre = "Concesionaria UTN";
       cars = new Auto[n];
    }
    
    public Concesionaria( String tit, int n )
    {
       if( n <= 0 ) n = 5;
       nombre = tit;
       cars = new Auto[n];
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getCantidadAutos()
    {
        return cars.length;   
    }
    
    public Auto getAuto( int i )
    {
        if( i >= 0 && i < cars.length ) return cars[i];   
        return null;
    }
    
    public void setAuto( Auto car, int i )
    {
        if( car != null && i >= 0 && i < cars.length ) cars[i] = car;
    }
    
    public Auto menorPrecio()
    {
        int m = 0;
        for( int i = 1; i < cars.length; i++ )
        {
            if( cars[i].getPrecio() < cars[m].getPrecio() ) m = i;
        }
        return cars[m];
    }
    
    public String cantidadPorPais()
    {
        int c[] = new int[10];
        for( int i = 0; i < cars.length; i++ )
        {
            int idx = cars[i].getPais();
            c[idx]++;
        }
        
        String r = "Cantidad de autos por pais de origen:\n\t";
        for( int j = 0; j < 10; j++ )
        {
            if( c[j] != 0 ) 
            {
                r += "Numero de pais: " + j + "\tCantidad de autos: " + c[j] + "\n\t";
            }
        }
        
        return r;
    }
    
    public void ordenar()
    {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if( cars[i].getPrecio() > cars[j].getPrecio() )
                {
                    Auto aux = cars[i];
                    cars[i] = cars[j];
                    cars[j] = aux;
                }
            }
        }
    }
    
    public String listado( float x )
    {
        ordenar();
        String r = "Autos del pais 3, con precio mayor a " + x + ":\n\t" ;
        for( int i = 0; i < cars.length; i++ )
        {
            if( cars[i].getPais() == 3 && cars[i].getPrecio() > x )
            {
                r = r + ( cars[i].toString() + "\n\t" );
            }
        }
        return r;
    }
    
    public Auto buscar( int cod )
    {
        for( int i = 0; i < cars.length; i++ )
        {
            if( cod == cars[i].getCodigo() ) return cars[i];
        }
        return null;
    }
        
    public String toString()
    {
        String r = "Nombre de la Concesionaria: " + nombre + "\nAutos disponibles: \n{";
        for( int i = 0; i < cars.length; i++ )
        {
            r = r + "\n\t" + cars[i].toString();    
        }
        r = r + "\n}";
        return r;
    }
}
