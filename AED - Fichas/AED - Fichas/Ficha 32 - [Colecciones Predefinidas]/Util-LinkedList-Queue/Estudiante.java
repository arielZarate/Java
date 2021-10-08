public class Estudiante
{
    private int legajo;
    private String nombre;
    private float promedio;
    
    public Estudiante()
    {
    }
    
    public Estudiante(int leg, String nom, float pro)
    {
        legajo = leg;
        nombre = nom;
        promedio = pro;
    }

    public Estudiante (int leg)
    {
        legajo = leg;
    }

    public int getLegajo()
    {
        return legajo;   
    }
    
    public void setLegajo(int leg)
    {
        legajo = leg;   
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;   
    }

    public float getPromedio()
    {
        return promedio;   
    }
    
    public void setPromedio(float pro)
    {
        promedio = pro;   
    }

    public String toString()
    {
        return "Legajo: " + legajo + "\tNombre: " + nombre + "\tPromedio: " + promedio; 
    }
    
    public boolean equals( Object x )
    {
        if ( x == null ) return false;
        Estudiante e = (Estudiante) x;
        return (this.legajo == e.legajo);
    }
}
