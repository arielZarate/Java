/**
 * Enunciado: Se tiene un conjunto de rectángulos y por cada uno se carga por 
 * teclado su base  y  su altura. Se pide mostrar el valor del área, la base 
 * y la altura, sólo de aquellos rectángulos cuyo perímetro sea menor que un 
 * número p dado (o sea, ingresado como dato). Continuar hasta que la base 
 * ingresada sea igual a cero.
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */
public class Principal
{
    private static float base, altura, area, perimetro, p;
    
    public static void main( String args[] )
    {
        System.out.print( "Ingrese el valor a usar para comparar los perimetros: " );
        p = ( float ) Consola.readDouble();
        procesar();
    }
    
    public static void procesar()
    {
        System.out.print( "Ingrese la base de uno de los rectangulos (con cero o negativo corta la carga): " );
        base = ( float ) Consola.readDouble();
        while( base > 0 )
        {
            System.out.print( "Ingrese ahora su altura: " );
            altura = ( float ) Consola.readDouble();
            
            calcular();
            if( perimetro < p ) System.out.println( "El perimetro " + perimetro + " es menor a " + p + "... y su area es de: " + area );
            
            System.out.print( "Ingrese otra base (con cero o negativo corta la carga): " );
            base = ( float ) Consola.readDouble();
        }
    }
    
    public static void calcular()
    {
        perimetro = 2*base + 2*altura;
        area = base * altura;   
    }
}
