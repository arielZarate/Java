/**
 * Enunciado: Desarrolle un programa Java que permita cargar por 
 * teclado tres números. Calcule la diferencia entre el mayor y 
 * el menor,  y el producto entre ese mayor y el número restante. 
 * Muestre los tres números, ordenados de menor a mayor, y muestre 
 * la diferencia y el producto pedidos.
 * 
 * @author Ing. Valerio Frittelli
 * @version Abril de 2010
 */
public class Principal
{
    private static int n1, n2, n3; 
    private static int may, med, men, dif, pro;
    
    public static void main( String args[] )
    {
        // carga de datos...
        System.out.print( "Valor 1: " );
        n1 = Consola.readInt();
        System.out.print( "Valor 2: " );
        n2 = Consola.readInt();
        System.out.print( "Valor 3: " );
        n3 = Consola.readInt();
        
        // procesos...
        ordenar();
        calcular();        
        
        System.out.println( "\nMenor: " + men );
        System.out.println( "Medio: " + med );
        System.out.println( "Mayor: " + may );
        System.out.println( "\nDiferencia entre el mayor y el menor: " + dif );
        System.out.println( "Producto entre el mayor y el medio: " + pro );
    }
    
    public static void ordenar()
    {
        ordenar2();
        ordenar3();
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
            med = may;
            may = n3;
        }
        else
        {
            if( n3 > men ) med = n3;
            else
            {
                med = men;
                men = n3;
            }
        }
    }
    
    public static void calcular()
    {
        dif = may - men;
        pro = may * med;
    }
}
