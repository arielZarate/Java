/**
 * Enunciado: Desarrollar un programa que cargue un arreglo, en el que 
 * cada componente sea un objeto que represente a un provincia argentina. 
 * Cada objeto debe contener el nombre de una provincia y la temperatura 
 * media anual de esa provincia. El programa deberá mostrar:
 *    i.  Un listado de las provincias y sus temperaturas ordenado 
 *        alfabéticamente.
 *    ii. Un listado de las provincias y sus temperaturas ordenado 
 *        por temperaturas en forma decreciente.
 * 
 * @author Ing. Valerio Frittelli
 * @version Julio de 2010
 */

public class Principal
{
    private static Gestor a;
    
    public static void main (String args[])
    {
        int n, op;
        boolean cargados = false;
        
        do
        {
          System.out.print("¿Cuántas provincias? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while( n <= 0 );
        a = new Gestor( n );
        
        do
        {
            System.out.println( "\n\nOpciones (Organismo: " + a.getNombre() + ")" );
            System.out.println( "1. Cargar el arreglo de provincias" );
            System.out.println( "2. Mostrar datos de las provincias" );
            System.out.println( "3. Ordenar provincias por nombres (alfabéticamente)" );
            System.out.println( "4. Ordenar provincias por temperatura (de mayor a menor)" );
            System.out.println( "5. Salir" );
            System.out.print( "\n\tIngrese número de opción: " );
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
                            a.ordenarPorNombres();
                            System.out.println( "\nEl arreglo de provincias fue ordenado alfabéticamente..." );
                            System.out.println( "Seleccione la opción 2 del menú para ver su contenido" );
                        }
                        else System.out.println( "\nNo hay datos cargados" );
                        break; 
                
                case 4: if( cargados == true )
                        {
                            a.ordenarPorTemperaturas();
                            System.out.println( "\nEl arreglo de provincias fue ordenado por temperaturas (mayor a menor)..." );
                            System.out.println( "Seleccione la opción 2 del menú para ver su contenido" );
                        }
                        else System.out.println( "\nNo hay datos cargados" );
                        break; 
                                                
                case 5: ;
            }
        }
        while( op != 5 );
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los provincias: ");
        for (int i = 0; i < a.getCantidadProvincias(); i++)
        {            
            System.out.print( "Nombre: " );
            String nom = Consola.readLine();

            System.out.print( "Temperatura media: " );
            float cant = ( float ) Consola.readDouble();
               
            Provincia pr = new Provincia( nom, cant );
            a.setProvincia( pr, i );
        }
    }
}
