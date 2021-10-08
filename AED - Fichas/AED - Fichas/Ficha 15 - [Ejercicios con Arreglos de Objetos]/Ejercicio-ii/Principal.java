public class Principal
{
    private static Negocio a;
    
    public static void main (String args[])
    {
        int n;
        do
        {
          System.out.print("¿Cuántos clientes? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while(n<=0);
        a = new Negocio(n);
        
        int op;
        do
        {
            System.out.println("Menú Principal - Negocio: " + a.getNombre());
            System.out.println("\t1. Cargar datos");
            System.out.println("\t2. Mostrar datos");
            System.out.println("\t3. Cliente con mayor importe de última compra");
            System.out.println("\t4. Buscar cliente");
            System.out.println("\t5. Listado de clientes con importes menores a 200");
            System.out.println("\t6. Cantidad de clientes con importe mayor al promedio");
            System.out.println("\t7. Salir");
            System.out.print("\t\t Ingrese número de opción: ");
            op = Consola.readInt();
            
            switch(op)
            {
               case 1:  cargar();
                        break;
                        
               case 2:  System.out.println( a.toString() );
                        break;
               
               case 3:  Cliente p1 = a.getMayorImporte();
                        if( p1 != null ) System.out.println("Cliente con mayor importe de última compra: " + p1);
                        else System.out.println("No hay datos cargados");
                        break;
                        
               case 4:  System.out.print("DNI del cliente a buscar: ");
                        int num = Consola.readInt();
                        Cliente p2 = a.buscar( num );
                        if( p2 != null ) System.out.println("Cliente encontrado: " + p2);
                        else System.out.println("No hay datos cargados o no hay un cliente con ese DNI");
                        break;
                        
               case 5:  System.out.println( a.toStringImportesMenoresA200(  ) );
                        break;
                        
               case 6:  int cant = a.getCantidadImportesMayorAlPromedio( );
                        System.out.println("Cantidad de clientes con importe mayor al promedio: " + cant);
                        break;
                        
               case 7:  ;
            }
        }
        while( op != 7 );
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los Clientes: ");
        for (int i = 0; i < a.getCantidadClientes(); i++)
        {
            System.out.print("DNI: ");
            int dni = Consola.readInt();
            
            System.out.print("Nombre: ");
            String nom = Consola.readLine();
            
            System.out.print("Importe de su última compra: ");
            float imp = (float)Consola.readDouble();
            
            Cliente cli = new Cliente( dni, nom, imp );
            a.setCliente( cli );
        }
    }
}
