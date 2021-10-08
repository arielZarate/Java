/**
 * Enunciado: Ingrese por teclado los valores de 4 temperaturas 
 * registradas en distintos momentos del día. Determine el promedio 
 * de ellas. Muestre aquellas temperaturas cuya diferencia con el 
 * promedio sea mayor 10.5 grados.
 * 
 * @author Ing. Valerio Frittelli
 * @version Abril de 2010
 */
public class Principal
{
    private static float t1, t2, t3, t4;
    private static float promedio, d1, d2, d3, d4;
    
    public static void main( String args[] )
    {
        // carga de datos...
        System.out.print( "Temperatura 1: " );
        t1 = ( float ) Consola.readDouble();
        System.out.print( "Temperatura 2: " );
        t2 = ( float ) Consola.readDouble();
        System.out.print( "Temperatura 3: " );
        t3 = ( float ) Consola.readDouble();
        System.out.print( "Temperatura 4: " );
        t4 = ( float ) Consola.readDouble();
        
        // procesos y visualización de resultados...
        promedio();
        visualizar();
    }
    
    public static void promedio()
    {
        promedio = ( t1 + t2 + t3 + t4 ) / 4;
        System.out.println( "\nPromedio: " + promedio + "\n");
    }
    
    public static void visualizar()
    {
        // calculamos el valor absoluto de las diferencias...
        d1 = Math.abs( promedio - t1 );
        d2 = Math.abs( promedio - t2 );
        d3 = Math.abs( promedio - t3 );
        d4 = Math.abs( promedio - t4 );
        if( d1 > 10.5 ) System.out.println( "La temperatura " + t1 + " difiere del promedio en mas de 10.5 grados" );
        if( d2 > 10.5 ) System.out.println( "La temperatura " + t2 + " difiere del promedio en mas de 10.5 grados" );
        if( d3 > 10.5 ) System.out.println( "La temperatura " + t3 + " difiere del promedio en mas de 10.5 grados" );
        if( d4 > 10.5 ) System.out.println( "La temperatura " + t4 + " difiere del promedio en mas de 10.5 grados" );
    }
}
