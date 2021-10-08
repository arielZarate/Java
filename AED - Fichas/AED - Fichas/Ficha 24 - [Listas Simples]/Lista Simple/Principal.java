/**
 *  Contiene un main() sencillo para testear la clase SimpleList de números enteros...
 *  @author Ing. Valerio Frittelli
 *  @version Septiembre de 2008
 */
public class Principal
{
    public static void main(String args[])
    {
        // una lista de números enteros...
        SimpleList a = new SimpleList();
        a.addFirst(4);
        a.addFirst(8);
        a.addFirst(1);
        System.out.println("Lista de números: " + a.toString());
        
        // remueve y retorna el primer número
        int x1 = a.removeFirst(); 
        System.out.println("El primer número era: " + x1);
        
        // retorna el primer número (de los que quedaron) sin removerlo...
        int x2 = a.getFirst();  
        System.out.println("El primer número es ahora: " + x2);
        
        System.out.println("Lista de números (luego del borrado): " + a.toString());
    }
}
