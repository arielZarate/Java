import java.io.*;
public class Votante
{
    private int numero;    // numero de dni del votante
    private String nombre; // nombre del votante
    private int edad;      // edad del votante
    private char sexo;     // 'v': varon  -  'm': mujer
    
    public Votante()
    {
    }
    
    public Votante(int dni)
    {
       numero = dni;
    }
    
    public Votante(int dni, String nom, int e, char s)
    {
       numero = dni;
       nombre = nom;
       edad = e;
       sexo = s;
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public char getSexo()
    {
        return sexo;
    }
    
    public void setNumero(int dni)
    {
        numero = dni;
    }
    
    public void setNombre(String nom)
    {
       nombre = nom;
    }
    
    public void setEdad(int e)
    {
       edad = e;
    }

    public void setSexo(char s)
    {
       sexo = s;
    }

    public String toString()
    {
        String sex = "Varón";
        if (sexo == 'm') sex = "Mujer";
        
        String r = "DNI: " + numero;
        r += "\tNombre: " + nombre;
        r += "\tEdad: " + edad;
        r += "\tSexo: " + sex;
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
            arch.writeInt(numero);    // graba el numero de dni
            arch.writeUTF(nombre);    // graba el nombre del votante
            arch.writeInt(edad);      // graba la edad del votante
            arch.writeChar(sexo);    // graba el sexo del votante
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
    public void leer(RandomAccessFile arch)
    {
        try
        {  
            numero = arch.readInt();        // lee el numero de dni
            nombre = arch.readUTF();        // lee el nombre del votante
            edad  = arch.readInt();         // lee la edad del votante
            sexo = arch.readChar();         // lee el sexo del votante
        }
        catch(IOException e)
        {
            System.out.println("Error al leer: " + e.getMessage());   
        }
    }
}
