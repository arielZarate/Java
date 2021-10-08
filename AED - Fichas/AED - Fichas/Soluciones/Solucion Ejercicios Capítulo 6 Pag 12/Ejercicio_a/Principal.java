/**
 * Enunciado: Se  ingresa por teclado un conjunto de números, uno a uno. 
 * Contar cuantas veces se presenta el valor 10, el 20, el 30 y el 40; 
 * y cuantos números distintos a esos se presentan. Cortar el proceso 
 * cuando el número ingresado sea igual a -1.
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */
public class Principal
{
    private static int num, c10, c20, c30, c40, cn;
    
    public static void main( String args[] )
    {
        procesar();
        mostrar();
    }
    
    public static void procesar()
    {
        c10 = c20 = c30 = c40 = cn = 0;
        System.out.print( "Ingrese uno de los numeros (con -1 corta la carga): " );
        num = Consola.readInt();
        while( num != -1 )
        {
            switch( num )
            {
                case 10: c10++; break;
                
                case 20: c20++; break;
                
                case 30: c30++; break;
                
                case 40: c40++; break;
                
                default: cn++;  break;
            }
            
            System.out.print( "Ingrese otro (con -1 corta la carga): " );
            num = Consola.readInt();
        }
    }
    
    public static void mostrar()
    {
        System.out.println( "Cantidad de veces que entro el 10: " + c10 );
        System.out.println( "Cantidad de veces que entro el 20: " + c20 );   
        System.out.println( "Cantidad de veces que entro el 30: " + c30 );
        System.out.println( "Cantidad de veces que entro el 40: " + c40 );
        System.out.println( "Cantidad de veces que entro uno distinto: " + cn );
    }
}
