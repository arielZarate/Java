/**
 * Enunciado: Se lee una  serie de n valores. Se desea saber si la 
 * suma de todos ellos, es igual, mayor o menor que cero.
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
        analizar();
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
    
    public static void analizar()
    {
        System.out.print( "La suma de los numeros ingresados (" + suma + ") es " );
        if( suma == 0 ) System.out.println( "igual a cero..." );
        else
        {
            if( suma > 0 ) System.out.println( " mayor a cero..." );
            else System.out.println( " menor a cero..." );
        }
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
