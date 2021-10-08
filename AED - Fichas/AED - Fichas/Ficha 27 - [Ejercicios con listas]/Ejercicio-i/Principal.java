public class Principal
{
    private static Empresa a;
    
    public static void main (String args[])
    {
        int n, num;
        float imp;
        Envio en;
        do
        {
          System.out.print("¿Cuántos envíos? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while(n<=0);
        a = new Empresa("Correo Argentino", n);
        
        int op;
        do
        {
            System.out.println("Menú Principal - Empresa: " + a.getNombre());
            System.out.println("\t1. Cargar datos en el arreglo de envíos");
            System.out.println("\t2. Generar la lista con envíos de mayor importe");
            System.out.println("\t3. Mostrar todos los datos");
            System.out.println("\t4. Importe acumulado en c/u de los 15 tipos");
            System.out.println("\t5. Buscar envío con mayor importe, clientes categoria 2");
            System.out.println("\t6. Matriz de conteo: destino / categoria");
            System.out.println("\t7. Buscar un envío");
            System.out.println("\t8. Salir");
            System.out.print("\t\t Ingrese número de opción: ");
            op = Consola.readInt();
            
            switch(op)
            {
               case 1:  cargar();
                        break;
                        
               case 2:  System.out.print("Importe de referencia (los mayores a este iran a la lista): ");
                        imp = (float)Consola.readDouble();
                        a.importesMayores(imp);
                        System.out.println("La lista fue generada");
                        break;
                        
               case 3:  System.out.println( a.toString() );
                        break;
               
               case 4:  String p1 = a.getImportePorTipo();
                        if( p1 != null ) System.out.println( p1 );
                        else System.out.println("No hay datos cargados");
                        break;
                        
               case 5:  en = a.getEnvio2MayorImporte();
                        if( en != null )System.out.print("Envío con mayor importe, clientes categoria 2: " + en);
                        else System.out.println("No hay datos cargados o no hay clientes categoria 2");
                        break;
                        
               case 6:  System.out.println( a.toStringCantidadPorCategoriaYDestino() );
                        break;
                        
               case 7:  System.out.print("Numero del cliente a buscar: ");
                        num = Consola.readInt();
                        en = a.buscarEnvio(num);
                        if (en!=null) System.out.println( "Cliente encontrado: " + en );
                        else System.out.println("No existe ese cliente");
                        break;
                        
               case 8:  ;
            }
        }
        while(op != 8);
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los envios: ");
        for (int i = 0; i < a.getCantidadEnvios(); i++)
        {
            System.out.print("Número de cliente: ");
            int num = Consola.readInt();

            int cat;
            do
            {
                System.out.print("Categoría: (entre 0 y 3): ");
                cat = Consola.readInt();
            }
            while( cat < 0 || cat > 3);

            
            int t;
            do
            {
                System.out.print("Tipo de envío: (entre 0 y 14): ");
                t = Consola.readInt();
            }
            while( t < 0 || t > 14);
            
            int d;
            do
            {
                System.out.print("Destino: (entre 0 y 2): ");
                d = Consola.readInt();
            }
            while( d < 0 || d > 2);

            
            System.out.print("Precio: ");
            float pre = (float)Consola.readDouble();
            
            Envio prod = new Envio( num, cat, t, d, pre );
            a.setEnvio( i, prod );
        }
    }
}
