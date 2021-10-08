public class Principal
{
    private static Empresa a;
    
    public static void main (String args[])
    {
        int n;
        do
        {
          System.out.print("¿Cuántos productos? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while(n<=0);
        a = new Empresa(n);
        
        int op;
        do
        {
            System.out.println("Menú Principal - Empresa: " + a.getNombre());
            System.out.println("\t1. Cargar datos");
            System.out.println("\t2. Mostrar datos");
            System.out.println("\t3. Producto tipo 3 con mayor precio");
            System.out.println("\t4. Buscar producto tipo 1");
            System.out.println("\t5. Listado de productos con precios mayores");
            System.out.println("\t6. Cantidad de productos de cada tipo");
            System.out.println("\t7. Salir");
            System.out.print("\t\t Ingrese número de opción: ");
            op = Consola.readInt();
            
            switch(op)
            {
               case 1:  cargar();
                        break;
                        
               case 2:  System.out.println( a.toString() );
                        break;
               
               case 3:  Producto p1 = a.getMayorPrecioTipo3();
                        if( p1 != null ) System.out.println("Producto tipo 3 con precio mayor: " + p1);
                        else System.out.println("No hay datos cargados o no hay productos tipo 3");
                        break;
                        
               case 4:  System.out.print("Código del producto tipo 1 a buscar: ");
                        int x = Consola.readInt();
                        Producto p2 = a.getTipo1CodigoX( x );
                        if( p2 != null ) System.out.println("Producto tipo 1 encontrado: " + p2);
                        else System.out.println("No hay datos cargados o no hay productos tipo 1 con ese código");
                        break;
                        
               case 5:  System.out.print("Precio por sobre el que se muestran los productos: ");
                        float p = (float)Consola.readDouble();
                        System.out.println( a.toStringMayoresPreciosOrdenCodigo( p ) );
                        break;
                        
               case 6:  System.out.println( a.toStringCantidadPorTipo() );
                        break;
                        
               case 7:  ;
            }
        }
        while(op != 7);
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los productos: ");
        for (int i = 0; i < a.getCantidadProductos(); i++)
        {
            System.out.print("Código: ");
            int cod = Consola.readInt();
            
            int t;
            do
            {
                System.out.print("Tipo: (entre 0 y 3): ");
                t = Consola.readInt();
            }
            while( t < 0 || t > 3);
            
            System.out.print("Precio: ");
            float pre = (float)Consola.readDouble();
            
            Producto prod = new Producto( cod, t, pre );
            a.setProducto( prod );
        }
    }
}
