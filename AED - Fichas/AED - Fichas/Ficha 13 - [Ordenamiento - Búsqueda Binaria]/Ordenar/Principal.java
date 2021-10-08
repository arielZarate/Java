public class Principal
{
   private static Arreglo a;
   
   public static void main (String args[])
    {
        int n;
        do
        {
          System.out.print("�Cu�ntos elementos? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while(n<=0);
        
        a = new Arreglo(n);
        
        cargar();
        
        System.out.println("\n\n*******Ordenamiento del arreglo...");
        a.ordenar();
        System.out.println("As� qued�: " + a.toString());
        
        System.out.println("\n\n*******B�squeda Binaria de un valor x...");
        System.out.print("Valor x a buscar: ");
        int x = Consola.readInt();
        int r = a.busquedaBinaria(x);
        if(r != -1)
        {
            System.out.println("Est� en la casilla " + r + " (recuerde: los �ndices comienzan en cero...)");
        }
        else
        {
            System.out.println("No est� en el arreglo");
        }

    }
    
    public static void cargar()
    {
        int i;
        System.out.println("Cargue los n�meros del arreglo: ");
        for (i = 0; i < a.length(); i++)
        {
            int x;
            System.out.print("a[" + i + "]: ");
            x = Consola.readInt();
            a.setComponent(x, i);
        }
    }
}
