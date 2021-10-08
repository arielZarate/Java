/**
 *  Contiene un main() sencillo para testear la clase Banco.
 *  @author Ing. Valerio Frittelli
 *  @version Septiembre de 2008
 */
public class Principal
{
    private static Banco b;
    
    public static void main(String args[])
    {
        System.out.print("¿Cuántos clientes?: ");
        int n = Consola.readInt();
        b = new Banco(n);
        
        cargarClientes();
        b.crearLista(1000);
        float p = b.saldoPromedio();
        System.out.println(b);
        System.out.println("Saldo promedio de los clientes de la lista: " + p);
    }
    
    public static void cargarClientes()
    {
        System.out.println("Ingrese los datos de los clientes: ");
        for (int i = 0; i <= b.getCantidadClientes(); i++)
        {
            System.out.print("Número de cuenta: ");
            int nc = Consola.readInt();
            
            System.out.print("Nombre del cliente: ");
            String nom = Consola.readLine();
            
            System.out.print("Saldo en la cuenta: ");
            float sal = (float)Consola.readDouble();
            
            Cliente c = new Cliente(nc, nom, sal);
            b.setCliente(i, c);
        }
    }
}
