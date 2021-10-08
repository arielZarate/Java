/**
 * Enunciado: Desarrolle un programa Java que permita ingresar tres 
 * números (admita que puedan tener decimales). Calcular su promedio. 
 * Si el promedio es mayor a 10, mostrarlo. En ambos casos, calcular 
 * y mostrar las diferencias entre cada número y el promedio.
 * 
 * @author Ing. Valerio Frittelli
 * @version Abril de 2010
 */
public class Principal
{
    private static float n1, n2, n3;
    private static float promedio, d1, d2, d3;
    
    public static void main( String args[] )
    {
        // carga de datos...
        System.out.print( "Primer  valor: " );
        n1 = ( float ) Consola.readDouble();
        System.out.print( "Segundo valor: " );
        n2 = ( float ) Consola.readDouble();
        System.out.print( "Tercer  valor: " );
        n3 = ( float ) Consola.readDouble();
        
        // procesos y visualización de resultados...
        promedio();
        diferencias();
    }
    
    public static void promedio()
    {
        promedio = ( n1 + n2 + n3 ) / 3;
        if( promedio > 10 ) System.out.println( "\nEl promedio (mayor a 10) es: " + promedio );
    }
    
    public static void diferencias()
    {
        d1 = promedio - n1;
        d2 = promedio - n2;
        d3 = promedio - n3;
        System.out.println( "\nDiferencia entre el promedio (" + promedio + ") y " + n1 + ":  " + d1 );
        System.out.println( "Diferencia entre el promedio (" + promedio + ") y " + n2 + ":  " + d2 );
        System.out.println( "Diferencia entre el promedio (" + promedio + ") y " + n3 + ":  " + d3 );
    }
}
