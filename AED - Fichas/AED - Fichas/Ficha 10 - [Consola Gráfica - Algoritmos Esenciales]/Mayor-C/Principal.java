public class Principal
{
    public static void main (String args[])
    {
        Analizador a = new Analizador();
        int m = a.buscarMayor();
        System.out.print("El mayor de los n�meros analizados es: " + m);
    }
}
