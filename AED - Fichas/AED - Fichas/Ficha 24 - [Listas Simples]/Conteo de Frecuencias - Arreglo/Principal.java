/**
 * Clase para contener al método main.
 * @author Ing. Valerio Frittelli 
 * @version 2.0 - 20/03/2005
 */
public class Principal
{
    public static void main (String args[])
    {
       Lector vc;
       Tarjeta x;
       int op, clave;
       String nombre;

       // asumo que no vendrán más de 10 claves distintas...
       vc = new Lector();
       do
       {
          System.out.println("Opciones:");
          System.out.println("1. Cargar y contar Tarjeta");
          System.out.println("2. Mostrar tabla de frecuencias");
          System.out.println("3. Salir");
          System.out.print("Ingrese opción: ");
          op = Consola.readInt();
          switch(op)
          {
            case 1: System.out.print("Ingrese el dni: ");
                    clave = Consola.readInt();
                    System.out.print("Nombre: ");
                    nombre = Consola.readLine();
                    x = new Tarjeta(clave, nombre);
                    vc.agregar(x);
                    break;

            case 2: System.out.println("Estas son las frecuencias: ");
                    System.out.println(vc.toString());
                    break;

            case 3:;
          }  
       }
       while(op!=3);
    }
}
