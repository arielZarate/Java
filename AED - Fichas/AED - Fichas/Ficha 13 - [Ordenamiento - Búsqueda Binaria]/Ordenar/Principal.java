public class Principal
{
   private static Arreglo a;
   
   public static void main (String args[])
    {
        int n;
        do
        {
          System.out.print("¿Cuántos elementos? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while(n<=0);
        
        a = new Arreglo(n);
        
        cargar();
        
        System.out.println("\n\n*******Ordenamiento del arreglo...");
        a.ordenar();
        System.out.println("Así quedó: " + a.toString());
        
        System.out.println("\n\n*******Búsqueda Binaria de un valor x...");
        System.out.print("Valor x a buscar: ");
        int x = Consola.readInt();
        int r = a.busquedaBinaria(x);
        if(r != -1)
        {
            System.out.println("Está en la casilla " + r + " (recuerde: los índices comienzan en cero...)");
        }
        else
        {
            System.out.println("No está en el arreglo");
        }

    }
    
    public static void cargar()
    {
        int i;
        System.out.println("Cargue los números del arreglo: ");
        for (i = 0; i < a.length(); i++)
        {
            int x;
            System.out.print("a[" + i + "]: ");
            x = Consola.readInt();
            a.setComponent(x, i);
        }
    }
}
