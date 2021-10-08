/**
 *  Contiene un main() sencillo para testear la clase SimpleList de n�meros enteros...
 *  @author Ing. Valerio Frittelli
 *  @version Septiembre de 2008
 */
public class Principal
{
    public static void main(String args[])
    {
        // una lista de n�meros enteros... inserci�n al frente
        SimpleList a = new SimpleList();
        a.addFirst(4);
        a.addFirst(8);
        a.addFirst(1);
        System.out.println("*************Primera lista de n�meros (con inserci�n al frente): " + a.toString());
        
        // otra lista de n�meros enteros... inserci�n al fondo
        SimpleList b = new SimpleList();
        b.addLast(4);
        b.addLast(8);
        b.addLast(1);
        System.out.println("\n*************Segunda lista de n�meros (con inserci�n al fondo): " + b.toString());
        int x = b.removeLast();
        System.out.println("\t\tEl �ltimo valor de la lista era: " + x);
        System.out.println("\t\tY as� qued� la lista luego de eliminar el �ltimo: " + b.toString());
        
        // otra m�s... inserci�n ordenada
        SimpleList c = new SimpleList();
        c.addInOrder(4);
        c.addInOrder(8);
        c.addInOrder(1);
        System.out.println("\n*************Tercera lista de n�meros (con inserci�n ordenada): " + c.toString());
        
        System.out.print("\t\tCargue un n�mero para buscarlo en la lista: ");
        int n1 = Consola.readInt();
        if ( c.contains(n1) ) System.out.println( "\t\tEst� en la lista..." );
        else System.out.println( "\t\tNo est� en la lista" );

        System.out.print("\t\tCargue otro n�mero para buscarlo en la lista: ");
        int n2 = Consola.readInt();
        Node p = c.search(n2);
        if ( p != null ) System.out.println( "\t\tEst� en la lista: este es el nodo convertido a String: " + p );
        else System.out.println( "\t\tNo est� en la lista" );
    }
}
