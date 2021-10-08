/**
 * Enunciado: En una ficha anterior se planteó literalmente el siguiente ejercicio: 
 * Escribir un programa que pida ingresar coordenadas (x, y) de un conjunto de puntos 
 * (para x e y distintos de  0(cero)) e informe la cantidad de puntos que hay en cada 
 * cuadrante. El proceso debe terminar al ingresar el par (0, 0). En esta ocasión, se 
 * pide replantear el ejercicio en forma completa, de forma que ahora se oriente a una 
 * solución basada en objetos. Note que también ahora se puede dar una solución en la 
 * cual los métodos usados retornen valores y tomen parámetros, por lo cual el ejercicio 
 * puede ahora mejorarse mucho respecto a la idea original.
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */

public class Principal
{
    private static int c1, c2, c3, c4;
    
    public static void main( String args[] )
    {
        procesar();
        mostrar();
    }
    
    public static void procesar()
    {
        System.out.println( "Este programa pedirá que cargue coordenadas de puntos..." );
        System.out.println( "... contará cuántos puntos hay en cada cuadrante..." );
        System.out.println( "... (ignorando los puntos que estén en un eje)..." );
        System.out.println( "... y terminará al cargar el punto (0, 0)\n" );
        c1 = c2 = c3 = c4 = 0;
        
        System.out.print( "Ingrese coordenada x: " );
        float cx = ( float ) Consola.readDouble();
        System.out.print( "Ingrese coordenada y: " );
        float cy = ( float ) Consola.readDouble();
        while( ! ( cx == 0 && cy == 0 ) )
        {
            Punto p = new Punto( cx, cy );
            int cuad = p.getCuadrante();
            
            // los puntos en los ejes serán ignorados...
            if( cuad == 1 ) c1++;
            if( cuad == 4 ) c4++;
            if( cuad == 2 ) c2++;
            if( cuad == 3 ) c3++;
            
            System.out.print( "\nIngrese coordenada x de otro punto: " );
            cx = ( float ) Consola.readDouble();
            System.out.print( "Ingrese coordenada y: " );
            cy = ( float ) Consola.readDouble();
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

