/**
 * Enunciado: Escribir un programa que lea n números enteros y calcule 
 * y muestre su suma y su promedio. Indique también si ese promedio es 
 * mayor o menor que 100.
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */
public class Principal
{
    private static int i, n, num, suma;
    private static float prom;
    
    public static void main( String args[] )
    {
        cargar();
        promediar();
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
            suma += num;
        }
    }
    
    public static void promediar()
    {
        // note que n no puede ser cero: se cargó con validación!!!
        prom = ( float ) suma / n;        
    }
    
    public static void mostrar()
    {
        System.out.println( "La suma de los numeros ingresados es: " + suma );
        System.out.println( "El promedio de los numeros ingresados es: " + prom);
        if( prom > 100 ) System.out.println( "El promedio es mayor a 100..." );
        else System.out.println( "El promedio no es mayor a 100..." );
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
