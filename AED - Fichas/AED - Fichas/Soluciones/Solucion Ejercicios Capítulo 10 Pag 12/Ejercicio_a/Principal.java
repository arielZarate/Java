/**
 * Enunciado: Una fábrica de piezas metálicas circulares para automóviles necesita un 
 * programa para procesar ciertos datos acerca de su producción en un período dado. 
 * Se requiere cargar por teclado los datos del radio de cada tipo de pieza  producida 
 * (cortar cuando el radio sea cero o negativo), y realizar lo siguiente:
 *          1.)  Determinar cuántas piezas tienen una longitud de circunsferencia 
 *               (perímetro... o sea: 2*pi*radio) mayor a cierto valor x cargado 
 *               por teclado.
 *          2.)  Determinar la superficie promedio de todas las piezas cargadas.
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */

public class Principal
{
    private static int ct, cp;
    private static float x, ac;
    
    public static void main( String args[] )
    {
        System.out.print( "Ingrese el valor x para comparar los perímetros: " );
        x = ( float ) Consola.readDouble();
        
        procesar();
        mostrar();
        System.out.println( "\nPrograma terminado..." );
    }
    
    public static void procesar()
    {
        ac = 0;
        ct = cp = 0;
        
        System.out.print( "\nIngrese uno de los radios (con cero o negativo corta la carga): " );
        float rad = ( float ) Consola.readDouble();
        while( rad > 0 )
        {
            Circulo c = new Circulo( rad );
            
            if( c.perimetro() > x ) cp++;
            
            ac += c.superficie();
            ct++;
            
            System.out.print( "Ingrese otro radio (con cero o negativo corta la carga): " );
            rad = ( float ) Consola.readDouble();
        }
    }
    
    public static void mostrar()
    {
        System.out.println( "\nCantidad de piezas con perimetro mayor a " + x + ": " + cp );
        System.out.println( "Superficie promedio de todas las piezas: " + promedio() );   
    }
    
    public static float promedio()
    {
        float p = 0;
        if( ct != 0 ) p = ac / ct;
        return p;
    }
}
