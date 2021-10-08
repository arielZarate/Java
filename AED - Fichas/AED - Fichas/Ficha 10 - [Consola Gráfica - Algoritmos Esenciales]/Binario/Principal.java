public class Principal
{
     public static void main (String args[])
    {
        System.out.println("******Primera secuencia de prueba...");
        System.out.print("Ingrese una secuencia de bits: ");
        String bin = Consola.readLine();
        Conversor c = new Conversor(bin);
        int v = c.convertir();
        if (v != -1)
        {
           System.out.println("El valor en base 10 es: " + v);
        }
        else 
        {
           System.out.println("La secuencia no era binaria");
        }
        
        System.out.println("\n\n******Segunda secuencia de prueba...");
        System.out.print("Ingrese otra secuencia binaria: ");
        bin = Consola.readLine();
        c.setBinario(bin);
        System.out.println(c);
    }
}
