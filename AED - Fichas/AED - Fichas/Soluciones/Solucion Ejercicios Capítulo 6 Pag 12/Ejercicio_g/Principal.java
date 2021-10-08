/**
 * Enunciado: Escribir un programa que pida ingresar coordenadas (x, y) de un 
 * conjunto de puntos (para x e y distintos de  0(cero)) e informe la cantidad 
 * de puntos que hay en cada cuadrante. El proceso debe terminar al ingresar 
 * el par (0, 0).
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */
public class Principal
{
    private static float x, y;
    private static int c1, c2, c3, c4;
    
    public static void main( String args[] )
    {
        procesar();
        mostrar();
    }
    
    public static void procesar()
    {
        System.out.println( "Este programa pedirá que cargue coordenadas de puntos..." );
        System.out.println( "... contará cunántos puntos hay en cada cuadrante..." );
        System.out.println( "... (ignorando los puntos que estén en un eje)..." );
        System.out.println( "... y terminará al cargar el punto (0, 0)\n" );
        c1 = c2 = c3 = c4 = 0;
        
        System.out.print( "Ingrese coordenada x: " );
        x = ( float ) Consola.readDouble();
        System.out.print( "Ingrese coordenada y: " );
        y = ( float ) Consola.readDouble();
        while( ! ( x == 0 && y == 0 ) )
        {
            // los puntos en los ejes serán ignorados...
            if( x > 0 && y > 0 ) c1++;
            if( x > 0 && y < 0 ) c4++;
            if( x < 0 && y > 0 ) c2++;
            if( x < 0 && y < 0 ) c3++;
            
            System.out.print( "\nIngrese coordenada x: " );
            x = ( float ) Consola.readDouble();
            System.out.print( "Ingrese coordenada y: " );
            y = ( float ) Consola.readDouble();
        }
    }
    
    public static void mostrar()
    {
        System.out.println( "\nCantidad de puntos en el cuadrante 1: " + c1 );
        System.out.println( "Cantidad de puntos en el cuadrante 2: " + c2 );
        System.out.println( "Cantidad de puntos en el cuadrante 3: " + c3 );
        System.out.println( "Cantidad de puntos en el cuadrante 4: " + c4 );
    }
}
