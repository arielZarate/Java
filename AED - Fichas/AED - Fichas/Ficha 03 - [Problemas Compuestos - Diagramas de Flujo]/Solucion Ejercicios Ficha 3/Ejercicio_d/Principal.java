/**
 * Enunciado: Desarrolle un programa Java que permita cargar los 
 * coeficientes a, b y c de una ecuación de segundo grado, y calcule 
 * y  muestre las raices de esa ecuación (el programa debe mostrar 
 * las raíces incluso si son complejas…)
 * 
 * @author Ing. Valerio Frittelli
 * @version Abril de 2010
 */
public class Principal
{
    private static float a, b, c; 
    private static float disc;
    private static float x1, x2, pr, pi;
    
    public static void main( String args[] )
    {
        // carga de datos...
        System.out.print( "Coeficiente a: " );
        a = ( float ) Consola.readDouble();
        System.out.print( "Coeficiente b: " );
        b = ( float ) Consola.readDouble();
        System.out.print( "Coeficiente c: " );
        c = ( float ) Consola.readDouble();
        
        // procesos y visualización de resultados...
        calcular();
    }
    
    public static void calcular()
    {
        if( a == 0 ) System.out.println( "El coeficiente \"a\" no puede ser cero..." );
        else raices();
    }
    
    public static void raices()
    {
        disc = b*b - 4*a*c;
        if( disc >= 0 )
        {
            // raíces reales...
            x1 = ( -b + ( float )Math.sqrt( disc ) ) / ( 2*a );
            x2 = ( -b - ( float )Math.sqrt( disc ) ) / ( 2*a );
            System.out.println( "x1 = " + x1 );
            System.out.println( "x2 = " + x2 );
        }
        else
        {
            // raíces complejas...
            pr = -b / ( 2*a );
            pi = ( float ) Math.sqrt( - disc ) / ( 2*a );
            System.out.println( "x1 = " + pr + " + " + pi + "i" );
            System.out.println( "x2 = " + pr + " - " + pi + "i" );
        }
    }
}
