public class Facultad
{
    private String nombre;     // nombre de la Facultad
    private Alumno alumnos[];  // el vector que se carga por teclado
    private SimpleList lista;  // la lista con los alumnos, ordenada por legajo
    
    public Facultad()
    {
        this("UTN - FRC", 5);
    }
    
    public Facultad(String nom)
    {
        this(nom, 5);
    }
    
    public Facultad(String nom, int n)
    {
        nombre = nom;
        if (n <= 0) n = 5;
        alumnos = new Alumno[n];
        lista = new SimpleList();
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public int getCantidadAlumnos()
    {
        return alumnos.length;    
    }
    
    public Alumno getAlumno(int i)
    {
        Alumno x;
        try
        {
            x = alumnos[i];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            x = null;
        }
        return x;
    }

    public void setAlumno(int i, Alumno p)
    {
        if (p == null) return;
        try
        {
            alumnos[i] = p;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {   
        }
    }
    
    public void listaOrdenada( )
    {
        lista.clear();
        for( int i = 0; i < alumnos.length; i++ )
        {
            if( alumnos[i] != null )
            {
                    lista.addInOrder( alumnos[i] );
            }
        }
    }
    
    public Alumno buscarAlumno(int num)
    {
        return lista.search( new Alumno(num) );   
    }

    public int aprobaron( int mz, int aa  )
    {
        int c = 0;
        mz--; 
        aa--;
        for( Node p = lista.getFrente(); p != null; p = p.getNext() )
        {
            Alumno alu = p.getInfo();
            int not = alu.getNota(mz, aa);
            if (not >= 4) c++;
        }
        return c;
    }
    
    public void actualizarNota(int leg, int mat, int anio, int not)
    {
        Alumno alu = lista.search(new Alumno(leg));
        if (alu == null) return;
        alu.setNota(mat, anio, not);
    }
        
    public String toString()
    {
        StringBuffer r = new StringBuffer("Facultad: " + nombre + "\nVector de Alumnos");
        for( int i = 0; i < alumnos.length; i++)
        {
            if (alumnos[i] != null) r.append ("\n" + alumnos[i].toString() );   
        }
        r.append("\nLista de alumnos");
        for( Node p = lista.getFrente(); p != null; p = p.getNext() )
        {
            r.append( "\n" + p.toString() );   
        }
        return r.toString();
    }
}
