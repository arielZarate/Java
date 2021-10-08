public class Principal
{
    private static Empresa a;
    
    public static void main (String args[])
    {
        int n;
        do
        {
          System.out.print("¿Cuántos clientes? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while(n<=0);
        a = new Empresa(n);
        cargar();
      
        System.out.println("\n\nListado completo de clientes:");
        System.out.println(a.toString());
    
        a.contar();
        System.out.println("\n" + a.toStringConteo());
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los clientes: ");
        for (int i = 0; i < a.getCantidadClientes(); i++)
        {
            System.out.print("Dni: ");
            int dni = Consola.readInt();
            
            System.out.print("Nombre: ");
            String nom = Consola.readLine();
            
            int dest;
            do
            {
                System.out.print("Destino (entre 0 y 4, please): ");
                dest = Consola.readInt();
            }
            while(dest < 0 || dest > 4);
            
            int form;
            do
            {
                System.out.print("Forma de pago (entre 0 y 2, please): ");
                form = Consola.readInt();
            }
            while(form < 0 || form > 2);
            
            Cliente cli = new Cliente(dni, nom, dest, form);
            a.setCliente(cli, i);
        }
    }
}
