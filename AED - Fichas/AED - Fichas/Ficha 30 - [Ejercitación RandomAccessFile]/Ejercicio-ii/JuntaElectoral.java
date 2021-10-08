import java.io.*;
public class JuntaElectoral
{
    private String nombre;              // nombre la localidad para la que se confecciona el padrón
 
    private File nombre1;               // descriptor para el archivo del padrón general
    private RandomAccessFile padron;    // el archivo con el padrón general
    
    private File nombre2;                // descriptor para el archivo de los mayores a 70 años
    private RandomAccessFile mayores70;  // el archivo con los votantes mayores a 70 años
    
    public JuntaElectoral()
    {
        this("Unquillo");
    }
    
    public JuntaElectoral(String nom)
    {
        nombre = nom;
        nombre1 = new File("padron.dat");
        nombre2 = new File("mayores70.dat");
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public void registrar (Votante v)
    {
        if (v == null) return;
        
        try
        {
            padron = new RandomAccessFile(nombre1, "rw");
            padron.seek( padron.length() ); // posicionar el file pointer al final...
            v.grabar(padron);
            padron.close();
        }
        catch(IOException e)
        {
            System.out.println("Error al grabar: " + e.getMessage());   
            System.exit(1);
        }
    }
    
    public String toString ( )
    {
        StringBuffer r = new StringBuffer("Padrón electoral - Localidad: " + nombre);
        try 
        {
            padron = new RandomAccessFile (nombre1, "r");
            while( padron.getFilePointer() < padron.length() )
            {
                Votante v = new Votante();
                v.leer(padron);
                r.append( "\n" + v.toString() );
            }
            padron.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: no existe el archivo del padrón general: " + e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("Error al recuperar datos del archivo: " + e.getMessage());
            System.exit(1);
        }
        return r.toString();
    }
    
    public Votante buscar( int dni )
    {
        Votante v = null;
        
        try
        {
            padron = new RandomAccessFile(nombre1, "r");
            
            boolean encontrado = false;
            while( padron.getFilePointer() < padron.length() )
            {
                v = new Votante();
                v.leer(padron);
                if( v.getNumero() == dni )
                {
                    encontrado = true;
                    break; 
                }
            } 
            padron.close();
            if(encontrado) return v; else return null;
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: no existe el archivo del padrón general: " + e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("Error al recuperar datos del archivo: " + e.getMessage());
            System.exit(1);
        }
        
        return v;
    }
    
    public String cantidadPorSexo()
    {
        int cv = 0;
        int cm = 0;
        String r = "Padrón electoral - Localidad: " + nombre;
        
        try 
        {
            padron = new RandomAccessFile (nombre1, "r");
            while( padron.getFilePointer() < padron.length() )
            {
                Votante v = new Votante();
                v.leer(padron);
                if ( v.getSexo() == 'v' ) cv++;  else  cm++;
            }
            padron.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: no existe el archivo del padrón general: " + e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("Error al recuperar datos del archivo: " + e.getMessage());
            System.exit(1);
        }
        
        r += "\n\tCantidad de votantes varones: " + cv;
        r += "\n\tCantidad de votantes mujeres: " + cm;
        return r.toString();
    }
    
    public void generarSegundoArchivo(  )
    {
        try
        {
            mayores70 = new RandomAccessFile (nombre2, "rw");
            padron = new RandomAccessFile(nombre1, "r");
            
            while( padron.getFilePointer() < padron.length() )
            {
                Votante v = new Votante();
                v.leer(padron);
                if ( v.getEdad() > 70 ) v.grabar( mayores70 );
            }
            padron.close();
            mayores70.close();
        }
        catch(IOException e)
        {
            System.out.println("Error al grabar votantes mayores a 70 años: " + e.getMessage());
            System.exit(1);
        }
    }
    
    public String mostrarSegundoArchivo( )
    {
        StringBuffer r = new StringBuffer("Padrón electoral - Localidad: " + nombre + "\n\tMayores a 70 años");
        try 
        {
            mayores70 = new RandomAccessFile (nombre2, "r");
            while( mayores70.getFilePointer() < mayores70.length() )
            {
                Votante v = new Votante();
                v.leer(mayores70);
                r.append( "\n" + v.toString() );
            }
            mayores70.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: no existe el archivo del votantes mayores a 70 años: " + e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("Error al recuperar datos del archivo: " + e.getMessage());
            System.exit(1);
        }
        return r.toString();
    }    
}
