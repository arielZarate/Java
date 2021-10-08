public class Analizador
{
    private int cantidad;  // cantidad de números sobre los que trabajará
    private int mayor;     // último mayor encontrado...
    public Analizador (int n)
    {
        // si viene n incorrecto, asumo 5 números...
        if (n <= 0) { n = 5; }
        cantidad = n;
        mayor = 0;
    }
    
    public Analizador ()
    {
        cantidad = 5;
        mayor = 0;
    }
    
    public int getCantidad()
    {
        return cantidad;   
    }
    
    public void setCantidad(int n)
    {
        if (n <= 0) { n = 5; }
        cantidad = n;
    }
    
    // Este es el método que vinimos a buscar...
    public int buscarMayor()
    {
        int i, num;
        System.out.print("Primer número: ");
        num = Consola.readInt();
        mayor = num;
        for (i = 2; i <= cantidad; i++)
        {
            System.out.print("Otro: ");
            num = Consola.readInt();
            if ( num > mayor) { mayor = num; }   
        }
        return mayor;
    }
    
    public String toString()
    {
        String r = "Ultima cantidad de números cargados: " + cantidad;
        r = r + "\nUltimo mayor encontrado: " + mayor;
        return r;
    }
}
