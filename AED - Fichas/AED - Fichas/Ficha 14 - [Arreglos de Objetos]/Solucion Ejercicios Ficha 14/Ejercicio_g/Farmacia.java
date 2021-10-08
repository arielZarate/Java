public class Farmacia
{
    private String nombre;
    private Laboratorio labs[];
    
    public Farmacia()
    {
       nombre = "Farmacia UTN";
       labs = new Laboratorio[5];
    }
    
    public Farmacia( int n )
    {
       if( n <= 0 ) n = 5;
       nombre = "Farmacia UTN";
       labs = new Laboratorio[n];
    }
    
    public Farmacia( String tit, int n )
    {
       if( n <= 0 ) n = 5;
       nombre = tit;
       labs = new Laboratorio[n];
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getCantidadLaboratorios()
    {
        return labs.length;   
    }
    
    public Laboratorio getLaboratorio( int i )
    {
        if( i >= 0 && i < labs.length ) return labs[i];   
        return null;
    }
    
    public void setLaboratorio(Laboratorio lab, int i )
    {
        if( lab != null && i >= 0 && i < labs.length ) labs[i] = lab;
    }
    
    public int getCantidadRemedios()
    {
        int ac = 0;
        for( int i = 0; i < labs.length; i++ ) ac += labs[i].getCantidad();
        return ac;
    }
    
    public void ordenar()
    {
        int n = labs.length;
        for (int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(labs[i].getCantidad() > labs[j].getCantidad())
                {
                    Laboratorio aux = labs[i];
                    labs[i] = labs[j];
                    labs[j] = aux;
                }
            }
        }
    }
    
    public Laboratorio buscar( String nom )
    {
        for( int i = 0; i < labs.length; i++ )
        {
            if( nom.equals( labs[i].getNombre() ) ) return labs[i];
        }
        return null;
    }
        
    public String toString()
    {
        String r = "Nombre de la Farmacia: " + nombre + "\nLaboratorios proveedores: \n{";
        for( int i = 0; i < labs.length; i++ )
        {
            r = r + "\n\t" + labs[i].toString();    
        }
        r = r + "\n}";
        return r;
    }
}
