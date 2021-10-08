public class Analizador
{
    private int mayor;     // �ltimo mayor encontrado...
   
    public Analizador ()
    {
        mayor = 0;
    }
   
    // Este es el m�todo que vinimos a buscar...
    public int buscarMayor()
    {
        int s = 1, num;
        System.out.print("N�mero (con cero termina el proceso): ");
        num = Consola.readInt();
        while (num != 0)
        {
            if (s == 1) 
            { 
                mayor = num; 
                s = 0;
            }
            else
            {
                if ( num > mayor) { mayor = num; }   
            }
            System.out.print("N�mero (con cero termina el proceso): ");
            num = Consola.readInt();
        }
        return mayor;
    }
    
    public String toString()
    {
        return "Ultimo mayor encontrado: " + mayor;
    }
}
