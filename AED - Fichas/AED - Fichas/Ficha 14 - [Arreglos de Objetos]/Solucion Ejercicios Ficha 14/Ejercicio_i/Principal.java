/**
 * Enunciado: Una concesionaria de ventas de autom�viles desea almacenar la informaci�n 
 * referida a los n autos que tiene a la venta en un arreglo unidimensional (cargar n 
 * por teclado). Por cada auto, guardar el c�digo, el nombre, el precio de venta y un 
 * n�mero entre 0 y 9 que identifica al pais de origen del auto. Se pide un programa 
 * completo que permita cargar los datos y que adem�s haga lo siguiente: 
 *    i.   Determinar el c�digo y el nombre del auto con menor precio de venta. 
 *    ii.  Determinar cu�ntos autos vienen de cada uno de los 10 paises posibles 
 *         de origen.
 *    iii. Mostrar por pantalla un listado incluyendo el c�digo, el nombre y el 
 *         precio de todos los autos cuyo precio sea mayor a x pesos (cargar x 
 *         por teclado) y que vengan del pais n�mero 3. Este listado debe mostrarse 
 *         en orden de importes, de menor a mayor.
 *    iv.  Determinar si existe alg�n auto con c�digo igual a c (cargar c por teclado). 
 *         Si existe, mostrar todos sus datos por pantalla. Si no existe, informar con 
 *         un mensaje.
 * 
 * @author Ing. Valerio Frittelli
 * @version Julio de 2010
 */

public class Principal
{
    private static Concesionaria a;
    
    public static void main (String args[])
    {
        int n, op;
        boolean cargados = false;
        
        do
        {
          System.out.print("�Cu�ntos autos? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while( n <= 0 );
        a = new Concesionaria( n );
        
        do
        {
            System.out.println( "\n\nOpciones (Concesionaria: " + a.getNombre() + ")" );
            System.out.println( "1. Cargar el arreglo" );
            System.out.println( "2. Mostrar datos registrados" );
            System.out.println( "3. Auto con menor precio" );
            System.out.println( "4. Cantidad de autos de cada pais" );
            System.out.println( "5. Listado de autos tipo 3..." );
            System.out.println( "6. Buscar auto" );
            System.out.println( "7. Salir" );
            System.out.print( "\n\tIngrese n�mero de opci�n: " );
            op = Consola.readInt();
            switch( op )
            {
                case 1: cargar();
                        cargados = true;
                        break;
                
                case 2: if( cargados == true ) System.out.println( "\nDatos registrados:\n" + a.toString() );
                        else System.out.println( "\nNo hay datos cargados" );
                        break;
                
                case 3: if( cargados == true )
                        {
                            Auto at = a.menorPrecio();
                            System.out.println( "\nAuto de menor precio: " + at.toString() );
                        }
                        else System.out.println( "\nNo hay datos cargados" );
                        break;
                
                case 4: if( cargados == true ) System.out.println( "\n" + a.cantidadPorPais() );
                        else System.out.println( "\nNo hay datos cargados" );
                        break; 
                        
                case 5: if( cargados == true ) 
                        {
                            System.out.print( "\nPrecio por sobre el cual se listar�n los autos tipo 3: " );
                            float x = ( float ) Consola.readDouble();
                            System.out.println( "\n" + a.listado( x ) );
                        }
                        else System.out.println( "\nNo hay datos cargados" );
                        break; 
                        
                case 6: if( cargados == true )
                        {
                            System.out.print("\nC�digo del auto a buscar: ");
                            int cod = Consola.readInt();
                            Auto at = a.buscar( cod );
                            if( at != null ) System.out.println( "Los datos del auto son: " + at );
                            else System.out.println( "No hay un auto con ese c�digo..." );
                        }
                        else System.out.println( "\nNo hay datos cargados" );
                        break;
                        
                case 7: ;
            }
        }
        while( op != 7 );
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los autos: ");
        for (int i = 0; i < a.getCantidadAutos(); i++)
        {            
            System.out.print("C�digo: ");
            int cod = Consola.readInt();
            
            System.out.print("Nombre: ");
            String nom = Consola.readLine();

            System.out.print("Precio: ");
            float pre = ( float ) Consola.readDouble();
            
            int pais;
            do
            {
                System.out.print("Pais de origen (un n�mero entre 0 y 9 please): ");
                pais = Consola.readInt();
                if( pais < 0 || pais > 9 ) System.out.println( "Se ped�a entre 0 y 9... cargue de nuevo..." );
            }
            while( pais < 0 || pais > 9 );
               
            Auto at = new Auto( cod, nom, pre, pais );
            a.setAuto( at, i );
        }
    }
}
