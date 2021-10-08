/**
 * Enunciado: Generar y mostrar los primeros n múltiplos de tres 
 * que no sean múltiplos de cuatro, siendo n un dato que se carga 
 * por teclado. 
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */
public class Principal
{
    private static int c, num, n;
    
    public static void main( String args[] )
    {
        cargar();
        multiplos();
    }
           
    public static void cargar()
    {
        do 
        {
            System.out.print( "Cuantos multiplos quiere ver? (mayor a cero): "  );
            n = Consola.readInt();
            if( n <= 0 ) System.out.println( "Se pedia mayor a cero... cargue de nuevo... ");
        }
        while( n <= 0 );
    }

    public static void multiplos()
    {
        System.out.println( "\nPrimeros " + n + " multiplos de 3 que no son multiplos de 4: " );        
        
        for( c = 1, num = 3; c <= n; num += 3 )
        {
            if( num % 4 != 0 ) 
            {
                System.out.print( num + " " );
                c++;
            }
        }
    }
}
