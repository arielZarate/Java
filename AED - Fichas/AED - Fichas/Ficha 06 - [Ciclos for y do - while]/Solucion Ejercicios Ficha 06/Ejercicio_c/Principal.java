/**
 * Enunciado: Escribir un programa que lea n números enteros y calcule 
 * la suma de los valores ingresados que sean mayores a 10.
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */
public class Principal
{
    private static int i, n, num, suma;
    
    public static void main( String args[] )
    {
        cargar();
        mostrar();
    }
    
    public static void cargar()
    {
        validar();
        
        suma = 0;
        for( i = 1; i <= n; i++ )
        {
            System.out.print( "Valor numero " + i + ": " );
            num = Consola.readInt();
            if( num > 10 ) suma += num;
        }
    }
    
    public static void mostrar()
    {
        System.out.print( "La suma de los numeros ingresados que eran mayores a 10 es: " + suma );
    }
    
    public static void validar()
    {
        do 
        {
            System.out.print( "Cuantos valores? (mayor a cero...): "  );
            n = Consola.readInt();
            if( n <= 0 ) System.out.println( "Se pedia mayor a cero... cargue de nuevo... ");
        }
        while( n <= 0 );
    }
}
