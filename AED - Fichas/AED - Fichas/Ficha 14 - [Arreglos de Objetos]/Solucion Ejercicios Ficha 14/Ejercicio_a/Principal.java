/**
 * Enunciado: Desarrollar un programa en Java que a trav�s de un men� de opciones 
 * permita cargar un arreglo con n componentes de tipo entero, y muestre los siguientes 
 * resultados (siempre incluya una opci�n que permita mostrar todo el arreglo):
 *    i.   El menor valor contenido en el arreglo, y el �ndice de la casilla que 
 *         lo contiene (si el menor est� repetido varias veces, no importa: muestre 
 *         el �ndice de alguna casilla que lo contenga).
 *    ii.  El promedio de los valores contenidos en el arreglo.
 *    iii. La cantidad de valores negativos que tiene el arreglo (no muestre los 
 *         n�meros negativos: s�lo indique cu�ntos son).
 * 
 * @author Ing. Valerio Frittelli
 * @version Junio de 2010
 */
public class Principal
{
   private static Arreglo a;
   
   public static void main (String args[])
    {
        int n, op;
        do
        {
          System.out.print("�Cu�ntos elementos? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while( n <= 0 );
        a = new Arreglo(n);
        
        do
        {
            System.out.println( "\n\nOpciones para gestionar un vector" );
            System.out.println( "1. Cargar el vector" );
            System.out.println( "2. Mostrar el vector" );
            System.out.println( "3. Buscar el menor" );
            System.out.println( "4. Valor promedio" );
            System.out.println( "5. Cantidad de negativos" );
            System.out.println( "6. Salir" );
            System.out.print( "\n\tIngrese n�mero de opci�n: " );
            op = Consola.readInt();
            switch( op )
            {
                case 1: cargar();
                        break;
                
                case 2: System.out.println("As� qued�: " + a.toString());
                        break;

                case 3: System.out.println( "\n\n*******B�squeda del menor valor contenido en el vector..." );
                        int r = a.menor();
                        System.out.println( "El menor est� en la casilla " + r + " y es el valor: " + a.getComponent( r ) );
                        break;
                
                case 4: float p = a.promedio();
                        System.out.println( "El promedio de los elementos del vector es: " + p );
                        break;
                
                case 5: int c = a.negativos();
                        System.out.println( "La cantidad de valores negativos en el vector es: " + c );
                        break;
                        
                case 6: ;
            }
        }
        while( op != 6 );
    }
    
    public static void cargar()
    {
        int i;
        System.out.println( "Cargue los n�meros del vector: " );
        for (i = 0; i < a.length(); i++)
        {
            int x;
            System.out.print("a[" + i + "]: ");
            x = Consola.readInt();
            a.setComponent(x, i);
        }
    }
}

