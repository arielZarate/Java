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
}
