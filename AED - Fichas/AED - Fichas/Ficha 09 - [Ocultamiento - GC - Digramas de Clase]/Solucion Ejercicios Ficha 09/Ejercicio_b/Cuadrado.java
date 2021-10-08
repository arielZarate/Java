public class Cuadrado
{
    private float lado;
    
    public Cuadrado()
    {
        lado = 0;   
    }

    public Cuadrado( float lad )
    {
        lado = lad;   
    }
    
    public float getLado()
    {
        return lado;   
    }
    
    public void setLado( float lad )
    {
        lado = lad;   
    }
    
    public float superficie()
    {
        return lado * lado;   
    }
    
    public float perimetro()
    {
        return 4 * lado;
    }
    
    public String toString()
    {
        return "Cuadrado - Lado: " + lado + "\tArea: " + superficie() + "\tPerimetro: " + perimetro();   
    }
}
