import java.util.LinkedList;
public class Principal
{
    public static void main(String args[])
    {
       // creamos un LinkedList para ser usado a modo de cola...
       LinkedList p = new LinkedList();
       // se agregan cuatro caracteres en la cola: notar el auto-boxing...
       p.add('c');
       p.add('a');
       p.add('s');
       p.add('a');
       
       // se muestra el contenido, que aparece en orden de inserción
       System.out.println("Una pila de caracteres (note que el frente está a la izquierda):");
       System.out.println( p );  
       
       // recuperamos (sin removerlo) el primer caracter 
       // acá hace falta casting...
       char x1 = (Character)p.peek();  // note acá también el auto-boxing...
       System.out.println("\nPrimer caracter: " + x1);
       System.out.println( p );
       
       // recuperamos (removiéndolo) el primer caracter
       char x2 = (Character)p.remove(); // auto-boxing...
       System.out.println("\nCaracter que estaba primero: " + x2);
       System.out.println("Así quedó la cola (note que el frente está a la izquierda):");
       System.out.println( p );
       
       // ahora otra pila, para guardar datos de Estudiantes
       LinkedList q = new LinkedList();
       
       // se agregan tres Estudiantes en la pila.
       q.add(new Estudiante(23, "Ana", 8));
       q.add(new Estudiante(15, "Juan", 2));
       q.add(new Estudiante(34, "Pedro", 5));
       
       // se muestra el contenido, que aparece en orden inverso
       System.out.println("\n\nUna pila de Estudiantes(note que el frente está a la izquierda):");
       System.out.println( q );  
       
       // recuperamos (sin removerlo) el Estudiante de arriba
       // acá hace falta casting...
       Estudiante e1 = (Estudiante)q.peek();  
       System.out.println("\nPrimer Estudiante: " + e1);
       System.out.println( q );
       
       // recuperamos (removiéndolo) el de arriba
       Estudiante e2 = (Estudiante)q.remove(); 
       System.out.println("\nEstudiante que estaba primero: " + e2);
       System.out.println("Así quedó la pila (note que el frente está a la izquierda):");
       System.out.println( q );    
    }    
}
