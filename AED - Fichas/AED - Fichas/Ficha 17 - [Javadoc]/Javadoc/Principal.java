/**
 *  Esta clase se crea al solo efecto de proveer un método main de prueba.
 *  @author Ing. Valerio Frittelli.
 *  @version Agosto de 2008.
 */
public class Principal
{
    /**
     * Método de entrada del programa.
     */
    public static void main (String args[])
    {
        Persona a = new Persona("Juan", 25);
        System.out.println("Datos de la Persona: ");
        System.out.println(a);
    }
}
