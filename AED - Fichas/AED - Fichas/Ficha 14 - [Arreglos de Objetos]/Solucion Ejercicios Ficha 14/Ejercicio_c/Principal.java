/**
 * Enunciado: Cargar un arreglo con las alturas de los n alumnos de un curso 
 * (el valor de n también se carga por teclado). Determinar la altura media 
 * y luego informar cuántos alumnos son más altos que la media y cuántos son 
 * más bajos.
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
          System.out.print("¿Cuántos alumnos tiene? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while( n <= 0 );
        a = new Arreglo(n);
        
        do
        {
            System.out.println( "\n\nOpciones para gestionar alturas de los alumnos" );
            System.out.println( "1. Cargar el vector de alturas" );
            System.out.println( "2. Mostrar el vector de alturas" );
            System.out.println( "3. Calcular la altura media" );
            System.out.println( "4. Cantidad de alumnos con altura mayor y menor a la media" );
            System.out.println( "5. Salir" );
            System.out.print( "\n\tIngrese número de opción: " );
            op = Consola.readInt();
            switch( op )
            {
                case 1: cargar();
                        break;
                
                case 2: System.out.println("Estas son las alturas cargadas: " + a.toString());
                        break;
                
                case 3: float p = a.promedio();
                        System.out.println( "La altura promedio es: " + p );
                        break;
                        
                case 4: contar();
                        break;
                        
                case 5: ;
            }
        }
        while( op != 5 );
    }
    
    public static void cargar()
    {
        int i;
        System.out.println( "Cargue las alturas de los alumnos: " );
        for (i = 0; i < a.length(); i++)
        {
            int x;
            System.out.print("a[" + i + "]: ");
            x = Consola.readInt();
            a.setComponent(x, i);
        }
    }
    
    public static void contar()
    {
        float p = a.promedio();
        int c1 = 0, c2 = 0;
        for( int i = 0; i < a.length(); i++ )
        {
            if( a.getComponent( i ) >= p ) c1++; else c2++;
        }
        
        System.out.println( "La altura media es: " + p );
        System.out.println( "Cantidad de alumnos con altura mayor o igual a la media: " + c1 );
        System.out.println( "Cantidad de alumnos con altura menor a la media: " + c2 );
    }
}

