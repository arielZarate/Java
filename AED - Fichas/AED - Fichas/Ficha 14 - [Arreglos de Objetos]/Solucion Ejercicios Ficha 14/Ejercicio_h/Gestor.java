public class Gestor
{
    private String nombre;
    private Provincia p[];
    
    public Gestor()
    {
       nombre = "Ministerio del Interior";
       p = new Provincia[5];
    }
    
    public Gestor( int n )
    {
       if( n <= 0 ) n = 5;
       nombre = "Ministerio del Interior";
       p = new Provincia[n];
    }
    
    public Gestor( String tit, int n )
    {
       if( n <= 0 ) n = 5;
       nombre = tit;
       p = new Provincia[n];
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getCantidadProvincias()
    {
        return p.length;   
    }
    
    public Provincia getProvincia( int i )
    {
        if( i >= 0 && i < p.length ) return p[i];   
        return null;
    }
    
    public void setProvincia(Provincia pr, int i )
    {
        if( pr != null && i >= 0 && i < p.length ) p[i] = pr;
    }
        
    public void ordenarPorNombres()
    {
        int n = p.length;
        for (int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                String p1 = p[i].getNombre();
                String p2 = p[j].getNombre();
                int r = p1.compareTo( p2 );
                
                if( r > 0 )
                {
                    Provincia aux = p[i];
                    p[i] = p[j];
                    p[j] = aux;
                }
            }
        }
    }
    
    public void ordenarPorTemperaturas()
    {
        int n = p.length;
        for (int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if( p[i].getMedia() < p[j].getMedia() )
                {
                    Provincia aux = p[i];
                    p[i] = p[j];
                    p[j] = aux;
                }
            }
        }
    }
        
    public String toString()
    {
        String r = "Nombre del Organismo: " + nombre + "\nProvincias: \n{";
        for( int i = 0; i < p.length; i++ )
        {
            r = r + "\n\t" + p[i].toString();    
        }
        r = r + "\n}";
        return r;
    }
}
