public class Instituto
{
    private Proyecto proyectos[];
    private int primeroNull;  // índice del primer casillero nulo
    private String nombre;
    
    public Instituto()
    {
        nombre = "Centro Médico Sur";
        proyectos = new Proyecto[5];
        primeroNull = 0;
    }
    
    public Instituto(String nom)
    {
        nombre = nom;
        proyectos = new Proyecto[5];
        primeroNull = 0;
    }
    
    public Instituto(int n)
    {
        nombre = "Centro Médico Sur";
        if (n <= 0) n = 5;
        proyectos = new Proyecto[n];
        primeroNull = 0;
    }
    
    public Instituto(String nom, int n)
    {
        nombre = nom;
        if (n <= 0) n = 5;
        proyectos = new Proyecto[n];
        primeroNull = 0;
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public int getCantidadProyectos()
    {
        return proyectos.length;    
    }
    
    public Proyecto getProyecto(int i)
    {
        // puede retornar null...
        if (i >= 0 && i < proyectos.length) return proyectos[i];
        return null;
    }

    public void setProyecto(Proyecto p)
    {
        if (p == null) return;
        if (primeroNull < proyectos.length)
        {
            proyectos[primeroNull] = p;
            primeroNull++;
        }
    }
    
    public Proyecto getTipo4MayorPresupuesto()
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return null;
        
        Proyecto mpt4 = null;
        for( int i = 0; i < primeroNull; i++ )
        {
            if(proyectos[i].getArea() == 4)
            {
                   if( mpt4 == null || proyectos[i].getMonto() > mpt4.getMonto() )
                   {
                        mpt4 = proyectos[i];    
                   }
            }
        }
        return mpt4;
    }
    
    public String toStringDuracionMayorA1(  )
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return "No hay datos...";
        
        // odenamos el arreglo alfabéticamente, por temas.
        int i, n = primeroNull;
        for( i = 0; i < n - 1; i++)
        {
           for( int j = i + 1; j < n; j++ )
           {
                String nomi = proyectos[i].getTema();
                String nomj = proyectos[j].getTema();
                int r = nomi.compareTo( nomj );
                
                if( r > 0 )    
                {
                    Proyecto aux = proyectos[i];
                    proyectos[i] = proyectos[j];
                    proyectos[j] = aux;
                }
           }
        }
        
        String r = "Proyectos con duración mayor a un año:";
        for( i = 0; i < n; i++ )
        {
            if ( proyectos[i].getDuracion() > 1 )
            {
                r += "\n" + proyectos[i].toString();   
            }
        }
        return r;
    }
    
    public String toStringConteoPorArea()
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return "No hay datos";
        
        // creamos un vector de conteos, con todos sus casilleros inicialmente en cero
        int conteo[] = new int[7];  // una casilla por cada área posible
        for(int i = 0; i < proyectos.length; i++)
        {
            // obtener el area del proyecto (que será el índice en el vector de conteos...)
            int area = proyectos[i].getArea();   
            
            // entrar en el casillero [area] del vector, y contar...
            conteo[area]++;  
        }
        
        // convertir el vector a String y retornar
        String r = "Conteo de proyectos por área:";
        for (int i = 0; i < conteo.length; i++)
        {
            r = r + "\n\tArea: " + i;
            r = r + "\t - Cantidad de proyectos: " + conteo[i];
        }
        return r;
    }
    
    public String toStringProyectosLargos()
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return "No hay datos";

        // ¿cuántos proyectos hay con duración mayor a dos años?
        int i, c = 0;
        for( i = 0; i < proyectos.length; i++)
        {
            if( proyectos[i].getDuracion() > 2 ) c++;   
        }
        
        // crear un arreglo de referencias a Proyecto, de tamaño c
        if( c == 0) return "No hay proyectos de duración mayor a 2";
        Proyecto p[] = new Proyecto[c];  // cada casilla vale null...
        
        // copiar al nuevo arreglo los proyectos con duración mayor a 2...
        int ind = 0;   // índice para ir llenando el nuevo vector, sin dejar "huecos" nulos...
        for( i = 0; i < proyectos.length; i++)
        {
            if( proyectos[i].getDuracion() > 2 ) 
            {
                p[ ind ] = proyectos[ i ];
                ind++;
            }
        }
        
        // convertir a String el nuevo arreglo, y retornar...
        String r = "Instituto: " + nombre + "\t - Proyectos con duración mayor a 2 años:";
        for( i = 0; i < p.length; i++)
        {
            r += "\n" + p[i].toString();   
        }
        return r;
    }
    
    public String toString()
    {
        // controlamos si en el vector hay datos...
        if( primeroNull == 0 ) return "No hay datos...";

        String r = "Instituto: " + nombre + "\t - Proyectos disponibles:";
        for( int i = 0; i < primeroNull; i++)
        {
            r += "\n" + proyectos[i].toString();   
        }
        return r;
    }
}
