public class Principal
{
     public static void main (String args[])
    {
        Loteo loteo = new Loteo("El Cuadrado");
        System.out.println("Loteo: " + loteo.getNombre());
     
        loteo.procesar();
    }
}
