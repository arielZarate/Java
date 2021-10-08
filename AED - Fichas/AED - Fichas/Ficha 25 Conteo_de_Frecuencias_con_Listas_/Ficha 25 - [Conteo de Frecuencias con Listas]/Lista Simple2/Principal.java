/**
 *  Contiene un main() sencillo para testear la clase SimpleList de números enteros...
 *  @author Ing. Valerio Frittelli
 *  @version Septiembre de 2008
 */
public class Principal
{
    public static void main(String args[])
    {
        // una lista de números enteros... inserción al frente
        SimpleList a = new SimpleList();
        a.addFirst(4);
        a.addFirst(8);
        a.addFirst(1);
        System.out.println("*************Primera lista de números (con inserción al frente): " + a.toString());
        
        // otra lista de números enteros... inserción al fondo
        SimpleList b = new SimpleList();
        b.addLast(4);
        b.addLast(8);
        b.addLast(1);
        System.out.println("\n*************Segunda lista de números (con inserción al fondo): " + b.toString());
        int x = b.removeLast();
        System.out.println("\t\tEl último valor de la lista era: " + x);
        System.out.println("\t\tY así quedó la lista luego de eliminar el último: " + b.toString());
        
        // otra más... inserción ordenada
        SimpleList c = new SimpleList();
        c.addInOrder(4);
        c.addInOrder(8);
        c.addInOrder(1);
        System.out.println("\n*************Tercera lista de números (con inserción ordenada): " + c.toString());
        
        System.out.print("\t\tCargue un número para buscarlo en la lista: ");
        int n1 = Consola.readInt();
        if ( c.contains(n1) ) System.out.println( "\t\tEstá en la lista..." );
        else System.out.println( "\t\tNo está en la lista" );

        System.out.print("\t\tCargue otro número para buscarlo en la lista: ");
        int n2 = Consola.readInt();
        Node p = c.search(n2);
        if ( p != null ) System.out.println( "\t\tEstá en la lista: este es el nodo convertido a String: " + p );
        else System.out.println( "\t\tNo está en la lista" );
    }
}
