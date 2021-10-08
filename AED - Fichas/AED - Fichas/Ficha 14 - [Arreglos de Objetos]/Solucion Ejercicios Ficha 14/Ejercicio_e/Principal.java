/**
 * Enunciado: Ingresar por teclado dos vectores, de longitudes n y m 
 * respectivamente. Generar un tercer vector que contenga todos los 
 * valores que se encuentren repetidos en los dos vectores. O sea, el 
 * nuevo vector debe contener todos los elementos que estando en uno 
 * de los vectores originales, estén también en el otro.
 * 
 * @author Ing. Valerio Frittelli
 * @version Junio de 2010
 */
public class Principal
{
   private static Arreglo a, b, c;
   
   public static void main (String args[])
    {
        int op;
        boolean cargados = false;
        
        System.out.println( "Primer vector..." );
        a = crear();
        
        System.out.println( "\nSegundo vector..." );
        b = crear();
                
        do
        {
            System.out.println( "\n\nOpciones" );
            System.out.println( "1. Cargar los vectores a y b" );
            System.out.println( "2. Mostrar los vectores a y b" );
            System.out.println( "3. Generar y mostrar el vector c con los repetidos" );
            System.out.println( "4. Salir" );
            System.out.print( "\n\tIngrese número de opción: " );
            op = Consola.readInt();
            switch( op )
            {
                case 1: System.out.println( "Cargue los componentes del vector a [sin repeticiones]: " );
                        cargar( a );
                        
                        System.out.println( "\nCargue los componentes del vector b (sin repeticiones]: " );
                        cargar( b );
                        
                        cargados = true;
                        break;
                
                case 2: if( cargados == true )
                        {
                            System.out.println( "\nEste es el vector a: " + a.toString() );
                            System.out.println( "Este es el vector b: " + b.toString() );
                        }
                        else System.out.println( "\nLos vectores a y b aún no han sido cargados..." );
                        break;
                
                case 3: if( cargados == true )
                        {
                            c = a.repetidos( b );
                            if( c != null ) System.out.println( "\nEl vector con los valores comunes entre a y b es: " + c.toString() );
                            else System.out.println( "\nNo había valores comunes entre los vectores a y b..." );
                        }
                        else System.out.println( "\nLos vectores a y b aún no han sido cargados..." );
                        break;
                                                
                case 4: ;
            }
        }
        while( op != 4 );
    }

    public static Arreglo crear()
    {
        int t;
        do
        {
          System.out.print("¿Cuántos elementos tendrá este vector? (mayor a cero, please): ");
          t = Consola.readInt();
        }
        while( t <= 0 );
        return new Arreglo( t );
    }
    
    public static void cargar( Arreglo ar )
    {
        int i, x, r;
        for( i = 0; i < ar.length(); i++ )
        {
            do
            {
              System.out.print("casilla[" + i + "]: ");
              x = Consola.readInt();
              
              r = ar.buscar( x );
              if( r != -1 ) System.out.println( "El vector ya contiene a ese número... cargue otra vez..." );  
            }
            while( r != -1 );
            ar.setComponent(x, i);
        }
    }
}

