/**
 * Enunciado: Una empresa de turismo que vende viajes para egresados 
 * de colegios secundarios, ofrece a tres cursos distintos, la siguiente 
 * promoción: El costo del viaje por persona es de $ 360, pero si el 
 * grupo excede de las 40 personas, la empresa realiza un descuento 
 * del 5% sobre el costo total del viaje para el curso. Realizar un 
 * programa, que cargando la cantidad de alumnos de cada uno de los tres 
 * cursos, permita determinar:   
 *  - El curso más numeroso.
 *  - El monto del viaje para cada curso.
 *  - El porcentaje que representa el monto del viaje del curso más 
 *    numeroso sobre el total de la ganancia de la empresa.
 * 
 * @author Ing. Valerio Frittelli
 * @version Abril de 2010
 */
public class Principal
{
    private static int c1, c2, c3;
    private static float may, m1, m2, m3, mtot, porc;
    private static String maycur;
    
    public static void main( String args[] )
    {
	// carga de datos...
	System.out.print( "Cantidad de alumnos del curso 1: " );
	c1 = Consola.readInt();
	System.out.print( "Cantidad de alumnos del curso 2: " );
	c2 = Consola.readInt();
	System.out.print( "Cantidad de alumnos del curso 3: " );
	c3 = Consola.readInt();
	
	// procesos
	montos ();
	mayor ();
	porcentaje ();

	// visualización de resultados
	System.out.println( "\nEl curso mas numeroso es el " + maycur );
	System.out.println( "\n\nEl monto del viaje del primer curso es: " + m1 );
	System.out.println( "\nEl monto del viaje del segundo curso es: " + m2 );
	System.out.println( "\nEl monto del viaje del tercer curso es: " + m3 );
	System.out.println( "\nEl % del curso mas numeroso en el total es: " + porc + "\n" );
    }
    
    public static void mayor ()
    {
	if( c1 > c2 && c1 > c3 )
	{
	    may = m1;
	    maycur = "Primero";
	}
	else 
	    if ( c2 > c3 )
	    {
		may = m2;
		maycur = "Segundo";
	    }
	    else
	    {
		may = m3;
		maycur = "Tercero";
	    }
    }
    
    public static void montos ()
    {
	m1= c1 * 360;
	m2= c2 * 360;
	m3= c3 * 360;
	if( c1 > 40 ) m1 = m1 - ( ( float ) m1 / 100 * 5 );
	if( c2 > 40 ) m2 = m2 - ( ( float ) m2 / 100 * 5 );
	if( c3 > 40 ) m3 = m3 - ( ( float ) m3 / 100 * 5 );
    }
    
    public static void porcentaje ()
    {
	mtot = m1 + m2 + m3;
	porc = may / mtot * 100;
    }
}
