public class Alumno
{
    private int numero;    // numero de legajo 
    private String nombre; // nombre del alumno
    private int notas[][]; // notas del alumno
    
    public Alumno()
    {
        this(0, "Nombre desconocido");
    }
    
    public Alumno(int leg)
    {
       this(leg, "Nombre desconocido");
    }
    
    public Alumno(int leg, String nom)
    {
       numero = leg;
       nombre = nom;
       notas = new int[8][5];  // todas las notas empiezan en cero...
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    public int getNota(int m, int a)
    {
        int not;
        m--; a--;
        try
        {
            not = notas[m][a];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            not = 0;
        }
        return not;
    }

    public void setNumero(int hc)
    {
        numero = hc;
    }
    
    public void setNombre(String nom)
    {
       nombre = nom;
    }
    
    public void setNota(int m, int a, int not)
    {
       m--; a--;
       try 
       {
           notas[m][a] = not;
       }
       catch(ArrayIndexOutOfBoundsException e)
       {   
       }
    }

    public float promedioMateriasAprobadas()
    {
        int c = 0, ac = 0;
        for(int i = 0; i < notas.length; i++)
        {
           for(int j = 0; j < notas[i].length; j++)
           {
                if (notas[i][j] >= 4)
                {
                    c++;
                    ac += notas[i][j];
                }
           }
        }
        if(c!=0) return (float) ac/c;
        return 0;
    }
    
    public String toString()
    {
        StringBuffer r = new StringBuffer("Legajo: " + numero);
        r.append("\tNombre: " + nombre);
        for(int i = 0; i < notas.length; i++)
        {
            for(int j = 0; j < notas[i].length; j++)
            {
                r.append("\n\tMateria: " + (i+1) + "\tAño: " + (j+1) + "\tNota: " + notas[i][j]);   
            }
        }
        return r.toString();
    }
}
