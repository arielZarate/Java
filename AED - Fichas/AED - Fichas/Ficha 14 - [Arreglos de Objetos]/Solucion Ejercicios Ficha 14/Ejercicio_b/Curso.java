public class Curso
{
    private String titulo;
    private Estudiante inscriptos[];
    
    public Curso()
    {
       titulo = "Programación Java";
       inscriptos = new Estudiante[5];
    }
    
    public Curso(int n)
    {
       titulo = "Programación Java";
       inscriptos = new Estudiante[n];
    }
    
    public Curso(String tit, int n)
    {
       titulo = tit;
       inscriptos = new Estudiante[n];
    }
    
    public int getCantidadInscriptos()
    {
        return inscriptos.length;   
    }
    
    public Estudiante getEstudiante(int i)
    {
        return inscriptos[i];   
    }
    
    public void setEstudiante(Estudiante est, int i)
    {
        if (est != null){ inscriptos[i] = est; }
    }
    
    public void ordenar()
    {
        int n = inscriptos.length;
        for (int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(inscriptos[i].getLegajo() > inscriptos[j].getLegajo())
                {
                    Estudiante aux = inscriptos[i];
                    inscriptos[i] = inscriptos[j];
                    inscriptos[j] = aux;
                }
            }
        }
    }
    
    public Estudiante buscar( int leg )
    {
        for( int i = 0; i < inscriptos.length; i++ )
        {
            if( inscriptos[i].getLegajo() == leg ) return inscriptos[i];
        }
        return null;
    }
    
    public Estudiante menorPromedio()
    {
        int m = 0;
        for( int i = 1; i < inscriptos.length; i++ )
        {
            if( inscriptos[i].getPromedio() < inscriptos[m].getPromedio() ) m = i;
        }
        return inscriptos[m];
    }
    
    public String toString()
    {
        String r = "Nombre del curso: " + titulo + "\n{";
        for(int i = 0; i < inscriptos.length; i++)
        {
            r = r + "\n\t" + inscriptos[i].toString();    
        }
        r = r + "\n}";
        return r;
    }
}
