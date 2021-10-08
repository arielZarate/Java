public class Circulo
{
    private float radio;
    
    public Circulo()
    {
        radio = 0;   
    }

    public Circulo( float r )
    {
        radio = r;   
    }
    
    public float getRadio()
    {
        return radio;   
    }
    
    public void setRadio( float r )
    {
        radio = r;   
    }
    
    public float superficie()
    {
        return (float) Math.PI * radio * radio;   
    }
    
    public float perimetro()
    {
        return 2 * (float) Math.PI * radio;
    }
    
    public String toString()
    {
        return "Circulo - Radio: " + radio + "\tArea: " + superficie() + "\tPerimetro: " + perimetro();   
    }
    
}
