/**
 * Enunciado: Determinar y mostrar los números impares comprendidos 
 * entre a y b, siendo a y b datos ingresados por teclado. 
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */
public class Principal
{
    private static int i, a, b;
    
    public static void main( String args[] )
    {
        cargar();
        impares();
    }
           
    public static void cargar()
    {
        do 
        {
            System.out.print( "Valor de a (mayor a cero): "  );
            a = Consola.readInt();
            if( a <= 0 ) System.out.println( "Se pedia mayor a cero... cargue de nuevo... ");
        }
        while( a <= 0 );
        
        do 
        {
            System.out.print( "Valor de b (mayor que " + a + "): "  );
            b = Consola.readInt();
            if( b <= a ) System.out.println( "Se pedia mayor que " + a + "... cargue de nuevo... ");
        }
        while( b <= a );
    }

    public static void impares()
    {
        System.out.println( "\nNumeros impares en el intervalo [" + a + ", " + b + "]: " );
        
        // si a es par... tomar el siguiente (que es impar!!!)...
        if( a % 2 == 0 ) a++;
        
        // ... y sólo recorrer los impares comenzando en a...
        for( i = a; i <= b; i += 2 )
        {
            System.out.print( i + " " );
        }
    }
}
