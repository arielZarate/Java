public class Analizador
{
    private int cantidad;  // cantidad de n�meros sobre los que trabajar�
    private int mayor;     // �ltimo mayor encontrado...
    public Analizador (int n)
    {
        // si viene n incorrecto, asumo 5 n�meros...
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
    
    // Este es el m�todo que vinimos a buscar...
    public int buscarMayor()
    {
        int i, num;
        System.out.print("Primer n�mero: ");
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
        String r = "Ultima cantidad de n�meros cargados: " + cantidad;
        r = r + "\nUltimo mayor encontrado: " + mayor;
        return r;
    }
}
