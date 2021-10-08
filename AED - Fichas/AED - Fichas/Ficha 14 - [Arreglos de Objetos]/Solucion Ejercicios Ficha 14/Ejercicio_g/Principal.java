/**
 * Enunciado: Una farmacia desea procesar datos sobre sus medicamentos. Se sabe 
 * que la misma trabaja con n laboratorios distintos. Se pide confeccionar un 
 * programa que cargue un arreglo con los datos de cada laboratorio (se requieren 
 * los nombres de cada uno y la cantidad de remedios que cada laboratorio provee 
 * a la farmacia) y realice lo siguiente:
 * i.   Cantidad de remedios que posee en total la farmacia.
 * ii.  Mostrar el arreglo, ordenado en forma decreciente por cantidad 
 *      de medicamentos provistos.
 * iii. Ingresar el nombre de un laboratorio y mostrar un mensaje indicando 
 *      si la farmacia trabaja o no con ese laboratorio. En caso afirmativo 
 *      informar la cantidad de remedios que tiene.
 * 
 * @author Ing. Valerio Frittelli
 * @version Julio de 2010
 */

public class Principal
{
    private static Farmacia a;
    
    public static void main (String args[])
    {
        int n, op;
        boolean cargados = false;
        
        do
        {
          System.out.print("¿Cuántos laboratorios? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while( n <= 0 );
        a = new Farmacia( n );
        
        do
        {
            System.out.println( "\n\nOpciones (Farmacia: " + a.getNombre() + ")" );
            System.out.println( "1. Cargar el arreglo de laboratorios" );
            System.out.println( "2. Mostrar datos registrados de la farmacia" );
            System.out.println( "3. Cantidad total de remedios en stock" );
            System.out.println( "4. Ordenar laboratorios por cantidad de remedios provista" );
            System.out.println( "5. Buscar un laboratorio" );
            System.out.println( "6. Salir" );
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
                            int c = a.getCantidadRemedios();
                            System.out.println( "\nCantidad total de remedios en stock: " + c );
                        }
                        else System.out.println( "\nNo hay datos cargados" );
                        break;
                
                case 4: if( cargados == true )
                        {
                            a.ordenar();
                            System.out.println( "\nEl arreglo de laboratorios fue ordenado por cantidad provista..." );
                            System.out.println( "Seleccione la opción 2 del menú para ver su contenido" );
                        }
                        else System.out.println( "\nNo hay datos cargados" );
                        break; 
                        
                case 5: if( cargados == true )
                        {
                            System.out.print("\nNombre del laboratorio a buscar: ");
                            String nom = Consola.readLine();
                            Laboratorio l1 = a.buscar( nom );
                            if( l1 != null ) System.out.println( "Los datos del laboratorio son: " + l1 );
                            else System.out.println( "No hay un laboratorio con ese nombre..." );
                        }
                        else System.out.println( "\nNo hay datos cargados" );
                        break;
                        
                case 6: ;
            }
        }
        while( op != 6 );
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los laboratorios: ");
        for (int i = 0; i < a.getCantidadLaboratorios(); i++)
        {            
            System.out.print("Nombre: ");
            String nom = Consola.readLine();

            System.out.print("Cantidad de remedios provista: ");
            int cant = Consola.readInt();
               
            Laboratorio lab = new Laboratorio(nom, cant);
            a.setLaboratorio(lab, i);
        }
    }
}
