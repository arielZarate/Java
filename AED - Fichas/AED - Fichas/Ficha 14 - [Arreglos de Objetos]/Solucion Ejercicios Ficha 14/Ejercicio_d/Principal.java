/**
 * Enunciado: Hacer un programa que permita obtener el módulo de un vector de n 
 * componentes numéricos (el módulo de un vector es la raíz cuadrada de la suma 
 * de los cuadrados de sus componentes).
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
          System.out.print("¿Cuántos elementos? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while( n <= 0 );
        a = new Arreglo(n);
        
        do
        {
            System.out.println( "\n\nOpciones para el vector de números" );
            System.out.println( "1. Cargar el vector" );
            System.out.println( "2. Mostrar el vector" );
            System.out.println( "3. Calcular el módulo del vector" );
            System.out.println( "4. Salir" );
            System.out.print( "\n\tIngrese número de opción: " );
            op = Consola.readInt();
            switch( op )
            {
                case 1: cargar();
                        break;
                
                case 2: System.out.println("Estos son los números cargados: " + a.toString());
                        break;
                
                case 3: float p = a.modulo();
                        System.out.println( "El módulo del vector es: " + p );
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

