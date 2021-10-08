public class Principal
{
    public static void main (String args[])
    {
        Persona a, b, c;

        System.out.println("Primer ejemplo: invoca al método getInstanceCounter() con el nombre de la clase");
        a = new Persona("Ana", 28);
        b = new Persona("Juan", 20);
        c = new Persona("Luis", 40);
        int x = Persona.getInstanceCounter();
        System.out.println("Cantidad de instancias creadas: " + x);
        
        System.out.println("\nSegundo ejemplo: invoca al método getInstanceCounter() con una instancia");
        x = a.getInstanceCounter();
        System.out.println("Cantidad de instancias creadas: " + x);
        
        // lo siguiente no compila: la clase no puede invocar a un método no - static...
        // int y = Persona.getEdad();
        
        System.out.println("\nTercer ejemplo: acceso a un atributo público, estático y constante");
        System.out.println( "Ente regulador de aerolíneas: " + Aerolinea.REGULADOR );
        System.out.println( "Valor de pi: " + Math.PI );
        System.out.println( "Valor de e:  " + Math.E );
    }
}
