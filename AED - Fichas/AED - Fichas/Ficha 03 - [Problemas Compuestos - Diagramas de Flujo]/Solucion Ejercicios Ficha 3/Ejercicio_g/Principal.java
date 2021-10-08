/**
 * Enunciado: Desarrolle un programa Java que cargue ahora cuatro 
 * números, y sólo los muestre ordenados de menor a mayor.  
 * 
 * @author Ing. Valerio Frittelli
 * @version Abril de 2010
 */
public class Principal
{
    private static int n1, n2, n3, n4; 
    private static int may, med1, med2, men;
    
    public static void main( String args[] )
    {
        // carga de datos...
        System.out.print( "Valor 1: " );
        n1 = Consola.readInt();
        System.out.print( "Valor 2: " );
        n2 = Consola.readInt();
        System.out.print( "Valor 3: " );
        n3 = Consola.readInt();
        System.out.print( "Valor 4: " );
        n4 = Consola.readInt();
        
        // procesos...
        ordenar();
        
        System.out.println( "\nMenor:   " + men );
        System.out.println( "Medio 1: " + med1 );
        System.out.println( "Medio 2: " + med2 );
        System.out.println( "Mayor:   " + may );
    }
    
    public static void ordenar()
    {
        ordenar2();
        ordenar3();
        ordenar4();
    }
    
    public static void ordenar2()
    {
        if( n1 > n2 ) { may = n1; men = n2; }
        else { may = n2; men = n1; }
    }

    public static void ordenar3()
    {
        if( n3 > may )
        {
            med1 = may;
            may = n3;
        }
        else
        {
            if( n3 > men ) med1 = n3;
            else
            {
                med1 = men;
                men = n3;
            }
        }
    }
    
    public static void ordenar4()
    {
        if( n4 > may )
        {
            med2 = may;
            may = n4;
        }
        else
        {
            if( n4 > med1 ) med2 = n4;
            else
            {
                med2 = med1;

                if( n4 > men ) med1 = n4;
                else
                {
                    med1 = men;
                    men = n4;
                }
            }
        }        
    }
}
