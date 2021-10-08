/**
 * Enunciado: Hacer un programa que permita obtener el m�dulo de un vector de n 
 * componentes num�ricos (el m�dulo de un vector es la ra�z cuadrada de la suma 
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
          System.out.print("�Cu�ntos elementos? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while( n <= 0 );
        a = new Arreglo(n);
        
        do
        {
            System.out.println( "\n\nOpciones para el vector de n�meros" );
            System.out.println( "1. Cargar el vector" );
            System.out.println( "2. Mostrar el vector" );
            System.out.println( "3. Calcular el m�dulo del vector" );
            System.out.println( "4. Salir" );
            System.out.print( "\n\tIngrese n�mero de opci�n: " );
            op = Consola.readInt();
            switch( op )
            {
                case 1: cargar();
                        break;
                
                case 2: System.out.println("Estos son los n�meros cargados: " + a.toString());
                        break;
                
                case 3: float p = a.modulo();
                        System.out.println( "El m�dulo del vector es: " + p );
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

