public class Principal
{
    public static void main(String args[])
    {
       // crea una cola vacía
       Queue p = new Queue();
       
       // se agregan cinco números en la cola
       p.add(1);
       p.add(4);
       p.add(8);
       p.add(10);
       p.add(5);
       
       // se muestra el contenido, que aparece en orden de inserción
       System.out.println( p );
       
       // recuperamos (sin removerlo) el valor ubicado al principio
       int x1 = p.peek();
       System.out.println("\nValor ubicado adelante: " + x1);
       System.out.println( p );
       
       // recuperamos (removiéndolo) el valor ubicado al principio
       int x2 = p.remove();
       System.out.println("\nValor que estaba ubicado adelante: " + x2);
       System.out.println( p );
       
       // removemos dos mas... y mostramos como queda
       int x3 = p.remove();
       int x4 = p.remove();
       
       System.out.println("\nValores que estaban adelante: " + x3 + " y " + x4);
       System.out.println( p );
       
       // agregamos nuevos valores ahora, y mostramos todo...
       p.add(7);
       p.add(3);
       System.out.println( "\nAgregados el 7 y el 3..." );
       System.out.println( p );
    }    
}
