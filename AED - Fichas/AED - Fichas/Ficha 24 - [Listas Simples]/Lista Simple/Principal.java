/**
 *  Contiene un main() sencillo para testear la clase SimpleList de n�meros enteros...
 *  @author Ing. Valerio Frittelli
 *  @version Septiembre de 2008
 */
public class Principal
{
    public static void main(String args[])
    {
        // una lista de n�meros enteros...
        SimpleList a = new SimpleList();
        a.addFirst(4);
        a.addFirst(8);
        a.addFirst(1);
        System.out.println("Lista de n�meros: " + a.toString());
        
        // remueve y retorna el primer n�mero
        int x1 = a.removeFirst(); 
        System.out.println("El primer n�mero era: " + x1);
        
        // retorna el primer n�mero (de los que quedaron) sin removerlo...
        int x2 = a.getFirst();  
        System.out.println("El primer n�mero es ahora: " + x2);
        
        System.out.println("Lista de n�meros (luego del borrado): " + a.toString());
    }
}
