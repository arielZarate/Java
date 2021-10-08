/**
 * Enunciado: Desarrollar un programa que cargue un vector a de n elementos 
 * numéricos, y que luego cree un vector  b  que sea igual que el vector  a  
 * pero con sus elementos invertidos.
 * 
 * @author Ing. Valerio Frittelli
 * @version Junio de 2010
 */
public class Principal
{
   private static Arreglo a, b;
   
   public static void main (String args[])
    {
        int n, op;
        do
        {
          System.out.print("¿Cuántos elementos tendrá el vector original? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while( n <= 0 );
        a = new Arreglo(n);
        
        do
        {
            System.out.println( "\n\nOpciones para el vector de números" );
            System.out.println( "1. Cargar el vector original" );
            System.out.println( "2. Mostrar el vector original" );
            System.out.println( "3. Elementos invertidos (nuevo vector)" );
            System.out.println( "4. Salir" );
            System.out.print( "\n\tIngrese número de opción: " );
            op = Consola.readInt();
            switch( op )
            {
                case 1: cargar();
                        break;
                
                case 2: System.out.println("Este es el vector original: " + a.toString());
                        break;
                
                case 3: b = a.invertir();
                        System.out.println( "Este es el nuevo arreglo con los elementos invertidos: " + b.toString() );
                        break;
                                                
                case 4: ;
            }
        }
        while( op != 4 );
    }
    
    public static void cargar()
    {
        int i;
        System.out.println( "Cargue componentes del vector: " );
        for (i = 0; i < a.length(); i++)
        {
            int x;
            System.out.print("a[" + i + "]: ");
            x = Consola.readInt();
            a.setComponent(x, i);
        }
    }
}

