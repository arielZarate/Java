import java.io.*;
public class Consultorio
{
    private String nombre;     // nombre del consultorio o del médico
    private SimpleList lista;  // la lista de pacientes
    
    public Consultorio()
    {
        this("Dr. Matasanos");
    }
    
    public Consultorio(String nom)
    {
        nombre = nom;
        lista = new SimpleList();
    }
    
    public String getNombre()//devuelve el nombre del dr o consultorio
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
    
    public void grabarLista(  )
    {
        try
        {
            File f = new File("pacientes.dat");
            RandomAccessFile arch = new RandomAccessFile(f, "rw");
            //arch.setLenght(0); elimina todo lo que habia en el archivo y coloca el FP en '0' y comienza la lista desde cero.-
            
            for( Node p = lista.getFrente(); p != null; p = p.getNext() )
            {
                Paciente pac = p.getInfo();
                pac.grabar(arch);
            }
            arch.close();
        }
        catch(IOException e)
        {
            System.out.println("Error al grabar pacientes: " + e.getMessage());
            System.exit(1);
        }
    }
    
    public String getContenidoArchivo()
    {
        StringBuffer r = new StringBuffer("Pacientes en el archivo: ");
        try
        {
            File f = new File ("pacientes.dat");
            RandomAccessFile arch = new RandomAccessFile(f, "r"); 
            
            while( arch.getFilePointer() < arch.length() )
            {
                Paciente pac = new Paciente();
                pac.leer(arch);
                r.append("\n" + pac);
            }
            arch.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: no existe el archivo de pacientes: " + e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("Error al recuperar datos del archivo: " + e.getMessage());
            System.exit(1);
        }
        return r.toString();
    }
    
    public String getProblemas8o9(  )
    {
        StringBuffer r = new StringBuffer("Pacientes en el archivo, con enfermedad código 8 o 9: ");
        try
        {
            File f = new File ("pacientes.dat");
            RandomAccessFile arch = new RandomAccessFile(f, "r");
            
            int c = 0;
            while( arch.getFilePointer() < arch.length() )
            {
                Paciente pac = new Paciente();
                pac.leer(arch);
                if( pac.getCodigo() == 8 || pac.getCodigo() == 9) c++;   
            }
            Paciente vector [] = new Paciente[c];
        
            arch.seek(0);
            int ind = 0;
            while( arch.getFilePointer() < arch.length() )
            {
                Paciente pac = new Paciente();
                pac.leer(arch);
                if (pac.getCodigo() == 8 || pac.getCodigo() == 9)
                {
                    vector[ind] = pac;
                    ind++;
                }
            }
            arch.close();
            
            for( int i = 0; i < vector.length; i++)
            {
                r.append("\n" + vector[i]);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: no existe el archivo de pacientes: " + e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("Error al recuperar datos del archivo: " + e.getMessage());
            System.exit(1);
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
