public class Loteo
{
    private String nombre;
    private Cuadrado terreno;
    
    public Loteo()
    {
        nombre = "Remate Judicial";
    }
    
    public Loteo(String nom)
    {
        nombre = nom;   
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;   
    }
    
    public String toString()
    {
        return "Nombre: " + nombre;   
    }
    
    public void procesar()
    {
        float lado;
        System.out.print("Cargue lado (menor o igual a cero termina): ");
        lado = (float)Consola.readDouble();
        while(lado > 0)
        {
            Cuadrado terreno = new Cuadrado(lado);
            if(terreno.getLado() > 20)
            {
                float sup = terreno.superficie();
                System.out.println("Superficie del lote: " + sup);   
            }
            System.out.print("Cargue lado (menor o igual a cero termina): ");
            lado = (float)Consola.readDouble();
        }
    }
}
