/**
 * Enunciado: Un punto en un plano puede representarse como un objeto con dos 
 * atributos que almacenen sus coordenadas (de hecho, posiblemente eso fue lo 
 * que Usted hizo en el ejercicio anterior...) Desarrolle un programa con menú 
 * de opciones, que permita ingresar dos puntos a  y b, representados como objetos, 
 * y que contenga opciones para:
 *      1.) Cargar los dos puntos por teclado.
 *      2.) Mostrar los puntos en forma de par ordenado.
 *      3.) Calcular la distancia de cada uno al origen de coordenadas (se aplica 
 *          el teorema de Pitágoras...)
 *      4.) Calcular y mostrar la longitud del segmento de recta que los une:
 *              lr = sqrt ( (b.x - a.x)2 + (b.y - a.y)2 )
 *      5.) Calcular y mostrar la pendiente de la recta que los une:
 *              p = (b.y - a.y) / (b.x - a.x)
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */

public class Principal
{   
    private static Punto a, b;

    public static void main( String args[] )
    {
        a = new Punto();
        b = new Punto();
        
        int op;        
        do
        {
            System.out.println( "\nOpciones para manejo de Puntos en el plano" );
            System.out.println( "1. Cargar coordenadas..." );
            System.out.println( "2. Mostrar puntos (pares ordenados..." );
            System.out.println( "3. Distancias al origen..." );
            System.out.println( "4. Distancia entre ellos..." );
            System.out.println( "5. Pendiente de la recta que los une..." );
            System.out.println( "6. Salir..." );
            System.out.print( "\tIngrese opción: " );
            op = Consola.readInt();
            
            switch( op )
            {
                case 1: cargar();
                        break;
                        
                case 2: mostrar();
                        break;       
 
                case 3: alOrigen();
                        break;        
                        
                case 4: entreEllos();
                        break;  
                
                case 5: pendiente();
                        break;
                        
                case 6: ;
            }
        }
        while( op != 6);
    }
    
    
    public static void cargar()
    {
        System.out.print( "Coordenada (x) del punto (a): " );
        float cxa = ( float ) Consola.readDouble();
        a.setX( cxa );
        
        System.out.print( "Coordenada (y) del punto (a): " );
        float cya = ( float ) Consola.readDouble();
        a.setY( cya );
        
        System.out.print( "Coordenada (x) del punto (b): " );
        float cxb = ( float ) Consola.readDouble();
        b.setX( cxb );
        
        System.out.print( "Coordenada (y) del punto (b): " );
        float cyb = ( float ) Consola.readDouble();
        b.setY( cyb );
    }
    
    public static void mostrar()
    {
        System.out.println( "Punto a: " + a.toString() );
        System.out.println( "Punto b: " + b );
    }
    
    public static void alOrigen()
    {
        System.out.println( "La distancia del punto a = " + a + " al origen es: " + a.distancia() );
        System.out.println( "La distancia del punto b = " + b + " al origen es: " + b.distancia() );
    }
    
    public static void entreEllos()
    {
        System.out.println( "La distancia del punto a = " + a + " al punto b = " + b + " es: " + a.distancia( b ) );
    }
    
    public static void pendiente()
    {
        if( a.getX() == b.getX() && a.getY() == b.getY() )
        {
            System.out.println( "No puede calcularse la pendiente: los puntos son iguales..." );
        }
        else
        {
            System.out.println( "La pendiente de la recta que une a a = " + a + " con b = " + b + " es: " + a.pendiente( b ) );
        }
    }
}
