/**
 * Clase para contener al método main.
 * @author Ing. Valerio Frittelli
 * @version Agosto de 2008.
 */
public class Principal
{
    private static Concesionaria con;
    
    public static void main(String args[])
    {
        con = new Concesionaria();
        int op;
        do
        {
            System.out.println("1. Cargar vehículos de carga");
            System.out.println("2. Cargar vehículos particulares");
            System.out.println("3. Mostrar todo");
            System.out.println("4. Actualizar precios");
            System.out.println("5. Salir");
            System.out.print("\t\tIngrese: ");
            op = Consola.readInt();
            switch(op)
            {
                case 1:
                        cargarVehiculosDeCarga();
                        break;
                        
                case 2:
                        cargarVehiculosParticulares();
                        break;
                        
                case 3:
                        System.out.println(con);
                        break;
                
                case 4:
                        con.actualizarPreciosCarga();
                        con.actualizarPreciosParticular();
                        break;
                
                case 5: ;
            }
        }
        while( op != 5);
    }
    
    /**
     * Carga por teclado los datos de los vehículos de carga.
     */
    public static void cargarVehiculosDeCarga()
    {
        int n = con.getCantidadCarga();
        for(int i = 0; i < n; i++)
        {
            System.out.print("Marca del vehículo de carga: ");
            String mar = Consola.readLine();
            
            System.out.print("Modelo o año: ");
            int mod = Consola.readInt();
         
            System.out.print("Precio: ");
            float pre = (float)Consola.readDouble();
            
            System.out.print("Capacidad de carga: ");
            int t = Consola.readInt();
            
            Carga cg = new Carga(mar, mod, pre, t);
            con.setCarga(cg, i);
        }
    }
    
    /**
     * Carga por teclado los datos de los vehículos de carga.
     */
    public static void cargarVehiculosParticulares()
    {
        int m = con.getCantidadParticular();
        for(int i = 0; i < m; i++)
        {
            System.out.print("Marca del vehículo de carga: ");
            String mar = Consola.readLine();
            
            System.out.print("Modelo o año: ");
            int mod = Consola.readInt();
         
            System.out.print("Precio: ");
            float pre = (float)Consola.readDouble();
            
            System.out.print("Cantidad de puertas: ");
            int pue = Consola.readInt();
            
            Particular pr = new Particular(mar, mod, pre, pue);
            con.setParticular(pr, i);
        }
    }
    
}
