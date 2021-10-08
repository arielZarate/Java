/**
 * Enunciado: Cargue por teclado un número entero n, validando que n 
 * no sea negativo ni cero. El programa debe determinar si el número 
 * es primo o no. 
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */
public class Principal
{
    private static int n, d;
    private static boolean es;
    
    public static void main( String args[] )
    {
        cargar();
        esPrimo();
        if( es == true ) System.out.println( "Es primo..." );
        else System.out.println( "No es primo..." );
    }
           
    public static void cargar()
    {
        do 
        {
            System.out.print( "Ingrese n (mayor a uno): "  );
            n = Consola.readInt();
            if( n <= 1 ) System.out.println( "Se pedia mayor a uno... cargue de nuevo... ");
        }
        while( n <= 1 );
    }

    public static void esPrimo()
    {
        // si es el 2, es primo (el único primo par mayor a 0)...
        if( n == 2 ) es = true;
        else
        {
            // si no es el 2, pero es par, no es primo...
            if( n % 2 == 0 ) es = false;
            else
            {
                // es impar... suponemos que es primo...
                es = true;
                
                // ... y probamos a dividir sólo por impares...
                // ... pero sólo hasta llegar a la raiz de n...
                int t = ( int ) Math.sqrt( n );
                for( d = 3; d <= t; d += 2 )
                {
                    // si encuentro un divisor, no es primo...
                    if( n % d == 0 ) 
                    {
                        es = false;
                        break;
                    }
                }
            }
        }
    }
}
