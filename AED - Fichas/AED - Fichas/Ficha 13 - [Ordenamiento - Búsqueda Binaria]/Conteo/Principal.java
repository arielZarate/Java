public class Principal
{
    public static void main (String args[])
    {
        // Creamos un objeto Contador con capacidad para contar
        // número entre 0 y 99...
        Contador cont = new Contador(100);
        cont.contar();
        System.out.println(cont.toString());
    }
}
