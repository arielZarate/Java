/**
 * Enunciado: Ingresar dos números, los cuales definen las 
 * coordenadas de un punto en el plano. Mostrar a qué cuadrante 
 * pertenece el punto, y si perteneciera al primer cuadrante, 
 * hallar la distancia al origen de coordenadas. Considerar que 
 * si una coordenada es cero, el punto está en un eje. En este 
 * caso, indicar en cuál eje se encuentra.
 * 
 * @author Ing. Valerio Frittelli
 * @version Abril de 2010
 */
public class Principal
{
    private static float x, y;
    private static float dist;
    private static String cuadrante;
    
    public static void main( String args[] )
    {
        // carga de datos...
        System.out.print( "Coordenada x: " );
        x = ( float ) Consola.readDouble();
        System.out.print( "Coordenada y: " );
        y = ( float ) Consola.readDouble();
        
        // procesos y visualización de resultados...
        cuadrantes();
        visualizar();
    }
    
    public static void cuadrantes()
    {
        dist = -1;
        if( x == 0 && y == 0 ) cuadrante = "El punto está en el origen";
        else 
        {
            if( x == 0 ) cuadrante = "El punto está en el eje vertical";
            else
            {
                if( y == 0 ) cuadrante = "El punto está en el eje horizontal";
                else
                {
                    if( x > 0 && y > 0 ) 
                    { 
                        cuadrante = "El punto está en el cuadrante 1";
                        distancia();
                    }
                    else
                    {
                        if( x > 0 && y < 0 ) cuadrante = "El punto está en el cuadrante 4";
                        else
                        {
                            if( x < 0 && y > 0 ) cuadrante = "El punto está en el cuadrante 2";
                            else cuadrante = "El punto está en el cuadrante 3";
                        }
                    }
                }
            }    
        }
    }
    
    public static void distancia()
    {
        dist = ( float ) Math.sqrt( x*x + y*y );
    }
    
    public static void visualizar()
    {
        System.out.println( cuadrante );
        if( dist != -1 ) System.out.println( "Distancia al origen: " + dist );
    }
}
