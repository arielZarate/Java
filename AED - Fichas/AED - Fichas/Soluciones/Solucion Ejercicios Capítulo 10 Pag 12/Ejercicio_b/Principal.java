/**
 * Enunciado: El siguiente enunciado está basado en ejercicio que se planteó en una 
 * ficha anterior, y ahora se muestra levemente modificado: Se tiene un conjunto de 
 * cuadrados y por cada uno se carga por teclado el valor de su lado. Se pide mostrar 
 * el valor del área, pero sólo de aquellos cuadrados cuyo perímetro sea menor que un 
 * número p dado (o sea, ingresado como dato). Continuar hasta que el lado ingresado 
 * sea igual a cero. Si pide ahora replantear el ejercicio de forma que la solución se 
 * oriente a objetos.
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */

public class Principal
{
    private static float p;
    
    public static void main( String args[] )
    {
        System.out.print( "Ingrese el valor p a usar para comparar los perimetros: " );
        p = ( float ) Consola.readDouble();
        procesar();
        System.out.println( "\nPrograma terminado..." );
    }
    
    public static void procesar()
    {
        System.out.print( "\nIngrese el lado de uno de los cuadrados (con cero o negativo corta la carga): " );
        float lado = ( float ) Consola.readDouble();
        while( lado > 0 )
        {            
            Cuadrado cuad = new Cuadrado( lado );
            float per = cuad.perimetro();
            
            if( per < p ) System.out.println( "El perimetro " + per + " es menor a " + p + "... y su area es de: " + cuad.superficie() );
            
            System.out.print( "Ingrese otro lado, de otro cuadrado (con cero o negativo corta la carga): " );
            lado = ( float ) Consola.readDouble();
        }
    }
}
