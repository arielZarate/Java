public class Principal
{
    public static void main(String args[])
    {
       Stack p = new Stack();
       
       // se agregan cuatro caracteres en la pila
       p.push('c');
       p.push('a');
       p.push('s');
       p.push('a');
       
       // se muestra el contenido, que aparece en orden inverso
       System.out.println( p );
       
       // recuperamos (sin removerlo) el caracter de arriba
       char x1 = p.peek();
       System.out.println("\nCaracter de arriba: " + x1);
       System.out.println( p );
       
       // recuperamos (removiéndolo) el caracter de arriba
       char x2 = p.pop();
       System.out.println("\nCaracter de arriba: " + x2);
       System.out.println( p );
       
       System.out.print("\n\nIngrese una cadena: ");
       String s = Consola.readLine();
       if ( capicua(s) ) System.out.println("Es capicúa...");
       else System.out.println("No es capicúa...");
    }
    
    public static boolean capicua ( String s )
    {
         // creamos una pila con capacidad igual al largo del String
         // (con eso tenemos de sobra...)
         int n = s.length();
         Stack a = new Stack( n );

         int mitad = n / 2, i, d;
         char x;
         
         // ¿¿dónde empieza la mitad derecha??
         if ( n % 2 == 1 ) d = mitad + 1; else d = mitad;
         
         // fase 1: almacenar en pila la mitad izquierda...
         for ( i = 0; i < mitad; i++) a.push( s.charAt(i) );
         
         // fase 2: recorrer la mitad derecha y analizar par a par...
         for (i = d; i < n; i++)
         {
        	 x = a.pop();
        	 if ( x != s.charAt(i) ) return false;
         }
         return true;
    }
}
