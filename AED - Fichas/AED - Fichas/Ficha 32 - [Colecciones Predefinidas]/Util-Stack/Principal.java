import java.util.Stack;
public class Principal
{
    public static void main(String args[])
    {
       // Una pila para guardar caracteres
       Stack p = new Stack();
       
       // se agregan cuatro caracteres en la pila: notar el auto-boxing...
       p.push('c');
       p.push('a');
       p.push('s');
       p.push('a');
       
       // se muestra el contenido, que aparece en orden inverso
       System.out.println("Una pila de caracteres (note que el fondo está a la izquierda):");
       System.out.println( p );  
       
       // recuperamos (sin removerlo) el caracter de arriba
       // acá hace falta casting...
       char x1 = (Character)p.peek();  // note acá también el auto-boxing...
       System.out.println("\nCaracter de arriba: " + x1);
       System.out.println( p );
       
       // recuperamos (removiéndolo) el caracter de arriba
       char x2 = (Character)p.pop(); // auto-boxing...
       System.out.println("\nCaracter que estaba arriba: " + x2);
       System.out.println("Así quedó la pila (note que el fondo está a la izquierda):");
       System.out.println( p );
       
       // ahora otra pila, para guardar datos de Estudiantes
       Stack q = new Stack();
       
       // se agregan tres Estudiantes en la pila.
       q.push(new Estudiante(23, "Ana", 8));
       q.push(new Estudiante(15, "Juan", 2));
       q.push(new Estudiante(34, "Pedro", 5));
       
       // se muestra el contenido, que aparece en orden inverso
       System.out.println("\n\nUna pila de Estudiantes(note que el fondo está a la izquierda):");
       System.out.println( q );  
       
       // recuperamos (sin removerlo) el Estudiante de arriba
       // acá hace falta casting...
       Estudiante e1 = (Estudiante)q.peek();  
       System.out.println("\nEstudiante de arriba: " + e1);
       System.out.println( q );
       
       // recuperamos (removiéndolo) el de arriba
       Estudiante e2 = (Estudiante)q.pop(); 
       System.out.println("\nEstudiante que estaba arriba: " + e2);
       System.out.println("Así quedó la pila (note que el fondo está a la izquierda):");
       System.out.println( q );
       
       
       System.out.print("\n\nIngrese una cadena: ");
       String s = Consola.readLine();
       if ( capicua(s) ) System.out.println("Es capicúa...");
       else System.out.println("No es capicúa...");
    }
    
    public static boolean capicua ( String s )
    {
         // creamos una pila...
         Stack a = new Stack(  );

         // ... y comenzamos a trabajar...
         int n = s.length();
         int mitad = n / 2, i, d;
         char x;
         
         // ¿¿dónde empieza la mitad derecha??
         if ( n % 2 == 1 ) d = mitad + 1; else d = mitad;
         
         // fase 1: almacenar en pila la mitad izquierda...
         for ( i = 0; i < mitad; i++) a.push( s.charAt(i) );  // auto-boxing...
         
         // fase 2: recorrer la mitad derecha y analizar par a par...
         for (i = d; i < n; i++)
         {
             x = (Character)a.pop();
             if ( x != s.charAt(i) ) return false;
         }
         return true;
    }
}
