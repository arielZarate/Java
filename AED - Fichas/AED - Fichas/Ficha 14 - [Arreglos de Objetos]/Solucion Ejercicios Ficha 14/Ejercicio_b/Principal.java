/**
 * Enunciado: Modifique el  programa presentado en el proyecto Registracion,
 * para que al final del proceso se agreguen las siguientes tareas:
 *    i.  Cargar por teclado un número de legajo, y determine si está 
 *        registrado un alumno con ese legajo. Si lo está, muestre sus 
 *        datos. Si no lo está, informe con un mensaje.
 *    ii. Determine cuál es el estudiante con el promedio más bajo entre 
 *        todos los inscriptos. Muestre sus datos.
 * 
 * @author Ing. Valerio Frittelli
 * @version Junio de 2010
 */

public class Principal
{
    private static Curso a;
    
    public static void main (String args[])
    {
        int n;
        do
        {
          System.out.print("¿Cuántos alumnos? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while(n<=0);
        a = new Curso(n);
        cargar();

        System.out.print("¿Por encima de qué promedio se aceptan inscriptos?: ");
        float x = (float)Consola.readDouble();
        mostrarAceptados(x);
        
        System.out.println("\n\nListado completo (con todos los que se habían inscripto):");
        System.out.print(a.toString());
        
        System.out.print("\n\nLegajo del alumno a buscar: ");
        int leg = Consola.readInt();
        Estudiante est1 = a.buscar( leg );
        if( est1 != null ) System.out.println( "Los datos del alumno son: " + est1 );
        else System.out.println( "No hay un estudiante con ese legajo..." );
        
        Estudiante est2 = a.menorPromedio( );
        System.out.println( "\n\nLos datos del alumno con menor promedio son: " + est2 );
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los alumnos: ");
        for (int i = 0; i < a.getCantidadInscriptos(); i++)
        {
            System.out.print("Legajo: ");
            int leg = Consola.readInt();
            
            System.out.print("Nombre: ");
            String nom = Consola.readLine();
            
            System.out.print("Promedio: ");
            float prom = (float)Consola.readDouble();
            
            Estudiante est = new Estudiante(leg, nom, prom);
            a.setEstudiante(est, i);
        }
    }
    
    public static void mostrarAceptados( float x )
    {
        System.out.println( "Alumnos aceptados (tienen promedio mayor a " + x + ")\n" );
        a.ordenar();
        for( int i = 0; i < a.getCantidadInscriptos(); i++ )
        {
            Estudiante est = a.getEstudiante( i );
            if( est.getPromedio() > x )
            {
                System.out.println( est );
            }
        }
    }
}
