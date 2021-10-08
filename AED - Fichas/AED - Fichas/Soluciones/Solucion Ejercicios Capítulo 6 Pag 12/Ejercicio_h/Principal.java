/**
 * Enunciado: Desarrolle un programa que permita cargar por teclado un 
 * número a y otro número b. El programa debe validar que a sea menor 
 * que b, y luego mostrar todos los múltiplos de 3 que estén en el 
 * intervalo [a, b].
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */
public class Principal
{
    private static int i, a, b;
    
    public static void main( String args[] )
    {
        cargar();
        multiplos();
    }
           
    public static void cargar()
    {
        do 
        {
            System.out.print( "Valor de a (mayor a cero): "  );
            a = Consola.readInt();
            if( a <= 0 ) System.out.println( "Se pedia mayor a cero... cargue de nuevo... ");
        }
        while( a <= 0 );
        
        do 
        {
            System.out.print( "Valor de b (mayor que " + a + "): "  );
            b = Consola.readInt();
            if( b <= a ) System.out.println( "Se pedia mayor que " + a + "... cargue de nuevo... ");
        }
        while( b <= a );
    }

    public static void multiplos()
    {
        System.out.println( "\nMultiplos de 3 en el intervalo [" + a + ", " + b + "]: " );
        for( i = a; i <= b; i++ )
        {
            if( i % 3 == 0 ) System.out.print( i + " " );
        }
    }
}
