public class Consultorio
{
    private String nombre;     // nombre del consultorio o del médico
    private SimpleList lista;  // la lista con los envios con importe mayor 
    
    public Consultorio()
    {
        this("Dr. Matasanos");
    }
    
    public Consultorio(String nom)
    {
        nombre = nom;
        lista = new SimpleList();
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public void setPaciente(Paciente p)
    {
        if (p == null) return;
        lista.addInOrder( p );
    }
    
    public String getPacientesDemorados( )
    {
        StringBuffer r = new StringBuffer("Pacientes con 10 o más días de demora: ");
        for( Node p = lista.getFrente(); p != null; p = p.getNext() )
        {
            if( p.getInfo().getFecha() >= 10 )
            {
                    r.append( "\n" + p.toString() );
            }
        }
        return r.toString();
    }
    
    public String getProblemas8o9(  )
    {
        int c = 0;
        for( Node p = lista.getFrente(); p != null; p = p.getNext() )
        {
            if( p.getInfo().getCodigo() == 8 || p.getInfo().getCodigo() == 9) c++;   
        }
        Paciente vector [] = new Paciente[c];
        
        int ind = 0;
        for( Node p = lista.getFrente(); p != null; p = p.getNext() )
        {
            Paciente pac = p.getInfo();
            if (pac.getCodigo() == 8 || pac.getCodigo() == 9)
            {
                vector[ind] = pac;
                ind++;
            }
        }
        StringBuffer r = new StringBuffer("Pacientes con enfermedad código 8 o 9: ");
        for( int i = 0; i < vector.length; i++)
        {
            r.append("\n" + vector[i]);
        }
        return r.toString();
    }
    
   
    public Paciente buscarPaciente(int num)
    {
        return lista.search( new Paciente(num) );   
    }
    
    public String toString()
    {
        StringBuffer r = new StringBuffer("Consultorio: " + nombre);
        for( Node p = lista.getFrente(); p != null; p = p.getNext() )
        {
            r.append ("\n" + p.toString());   
        }
        return r.toString();
    }
}
