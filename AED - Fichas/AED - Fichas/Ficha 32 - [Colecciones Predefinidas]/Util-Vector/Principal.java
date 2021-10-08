import java.util.Vector;
public class Principal
{
    public static void main(String args[])
    {
           // creamos un Vector inicialmente vac�o
           Vector v = new Vector();
           v.add(new Estudiante(10, "Ana", 8));      // se inserta al final...
           v.add(0, new Estudiante(23, "Juan", 3));  // se inserta en la posici�n cero...
           v.add(new Estudiante(80, "Fede", 10));    // se inserta al final...
           v.add(new Estudiante(90, "Conrado", 10)); // se inserta al final...
           v.add(1, new Estudiante(56, "Jos�", 7));  // se inserta en la posici�n 1...
           //v.add(6, new Estudiante(2, "Carlos", 2)); // esto genera una ArrayIndexOutOfBoundsException...
           System.out.println("Un vector de estudiantes: ");
           System.out.println( v );
           
           Estudiante p = ( Estudiante ) v.get(3);  // recuperamos el estudiante de la casilla 3...
           System.out.println("El estudiante en la casilla 3 era: " + p);
           
           // un ciclo para recorrer el Vector y contar cuantos tienen promedio >= 4
           int c = 0;
           for (int i = 0; i < v.size(); i++)
           {
                Estudiante e = (Estudiante) v.get(i);
                if (e.getPromedio() >= 4) c++;
           }
           System.out.println("Cantidad con promedio >= 4: " + c);
    }    
}
