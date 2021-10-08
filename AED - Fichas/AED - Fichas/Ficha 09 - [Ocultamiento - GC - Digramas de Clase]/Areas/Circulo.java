public class Circulo
{
    private float radio;
    public Circulo()
    {
        radio = 0;   
    }
    public Circulo(float r)
    {
        radio = r;   
    }
    public float getRadio()
    {
        return radio;   
    }
    public void setRadio(float r)
    {
        radio = r;   
    }
    public float superficie()
    {
        return 3.14f * radio * radio;   
    }
    public String toString()
    {
        return "Circulo - Radio: " + radio + "\tArea: " + superficie();   
    }
    public void finalize()  // Un objeto antes de ser eliminados por el Garbage Collector llama al metodo finalize() si el GC no decide eliminar nada no se llama a finalize()
    {
        System.out.println("Adios Mundo Cruel........... No Me Extrañen");
    }
    
}
