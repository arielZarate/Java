public class Principal
{
    public static void main (String args[])
    {
        System.out.print("Cu�ntos n�meros va a procesar? ");
        int n = Consola.readInt();
        Analizador a = new Analizador(n);
        int m = a.buscarMayor();
        System.out.print(a.toString());
    }
}
