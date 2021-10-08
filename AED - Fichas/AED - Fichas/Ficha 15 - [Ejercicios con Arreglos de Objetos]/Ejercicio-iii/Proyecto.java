public class Proyecto
{
    private String tema;
    private int area;   // un numero entre 0 y 6
    private int duracion;  // un numero entre 0 y 3
    private float monto;
    
    public Proyecto()
    {
    }
    
    public Proyecto(String t, int a, int d, float imp)
    {
        tema = t;
        monto = imp;
        
        // si el area es incorrecta, se deja en cero
        if( a >= 0 && a <= 6 ) area = a;
        
        // si la duración es incorrecta, se deja en cero
        if( d >= 0 && a <= 3 ) duracion = d;
    }

    public Proyecto (String t)
    {
        tema = t;
    }

    public String getTema()
    {
        return tema;   
    }
    
    public void setTema(String t)
    {
        tema = t;   
    }

    public float getMonto()
    {
        return monto;   
    }
    
    public void setMonto(float f)
    {
        if ( f >= 0 ) monto = f;   
    }

    public int getArea()
    {
        return area;   
    }
    
    public void setArea(int a)
    {
        // si el area es incorrecta, se deja como estaba
        if( a >= 0 && a <= 6 ) area = a;
    }
    
    public int getDuracion()
    {
        return duracion;   
    }
    
    public void setDuracion(int d)
    {
        // si la duración es incorrecta, se deja como estaba
        if( d >= 0 && d <= 3 ) duracion = d;
    }
    
    public String toString()
    {
        return "Tema: " + tema + "\tMonto: " + monto + "\tArea: " + area + "\tDuración en años: " + duracion; 
    }
}
