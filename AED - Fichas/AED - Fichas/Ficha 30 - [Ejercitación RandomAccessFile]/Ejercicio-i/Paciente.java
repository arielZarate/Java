import java.io.*;
public class Paciente
{
    private int numero;    // numero de historia clinica 
    private String nombre; // nombre del paciente
    private int fecha;     // dias que pasaron desde su ultima visita
    private int codigo;    // código de su enfermedad: un valor entre 0 y 9
    
    public Paciente()
    {
    }
    
    public Paciente(int hc)
    {
       numero = hc;
    }
    
    public Paciente(int hc, String nom, int f, int c)
    {
       numero = hc;
       nombre = nom;
       fecha = f;
       codigo = c;
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    public int getFecha()
    {
        return fecha;
    }

    public int getCodigo()
    {
        return codigo;
    }
    
    public void setNumero(int hc)
    {
        numero = hc;
    }
    
    public void setNombre(String nom)
    {
       nombre = nom;
    }
    
    public void setFecha(int f)
    {
       fecha = f;
    }

    public void setCodigo(int c)
    {
       codigo = c;
    }

    public String toString()
    {
        String r = "Paciente: " + numero;
        r += "\tNombre: " + nombre;
        r += "\tDias de su ultima visita: " + fecha;
        r += "\tCódigo de su enfermedad: " + codigo;
        return r;
    }

    /**
     *  Graba los datos del objeto en un archivo.
     *  @param arch el archivo donde se grabará el objeto, que debe estar abierto 
     *  en un modo que permita grabaciones.
     */
    public void grabar(RandomAccessFile arch)
    {
        try
        {  
            arch.writeInt(numero);    // graba el numero de historia clinica 
            arch.writeUTF(nombre);    // graba el nombre del paciente
            arch.writeInt(fecha);     // graba los dias que pasaron desde su ultima visita
            arch.writeInt(codigo);    // graba el código de enfermedad
        }
        catch(IOException e)
        {
            System.out.println("Error al grabar: " + e.getMessage());   
        }
    }
    
    /**
     *  Lee los datos del objeto desde un archivo.
     *  @param arch el archivo desde donde se leerá el objeto, que debe estar abierto.
     */
    public void leer(RandomAccessFile arch)//Arch de solo lectura
    {
        try
        {  
            numero = arch.readInt();         // lee el numero de historia clinica 
            nombre = arch.readUTF();         // lee el nombre del paciente
            fecha = arch.readInt();          // lee los dias que pasaron desde su ultima visita
            codigo = arch.readInt();         // lee el código de enfermedad
        }
        catch(IOException e)
        {
            System.out.println("Error al leer: " + e.getMessage());   
        }
    }
}
