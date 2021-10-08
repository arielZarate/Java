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
        con = new Concesionaria( "MotCor" , 4 );
        Vehiculo vh = null;
        Carga cg = null;
        int op, tipo, cant;
        float t;
        do
        {
            System.out.println("1. Cargar vehículos");
            System.out.println("2. Mostrar todo");
            System.out.println("3. Actualizar precios");
            System.out.println("4. Buscar vehículo de carga con capacidad mayor a un valor");
            System.out.println("5. Contar cuántos hay de un tipo dado");
            
            System.out.println("6. Salir");
            System.out.print("\t\tIngrese: ");
            op = Consola.readInt();
            switch(op)
            {
                case 1:
                        cargarVehiculos();
                        break;
                       
                case 2:
                        System.out.println(con);
                        break;
                
                case 3:
                        con.actualizarPrecios();
                        break;
                        
                case 4:
                        System.out.print("Capacidad a buscar: ");
                        t = (float)Consola.readDouble();
                        cg = (Carga) con.buscarVehiculoDeCarga(t);
                        if ( cg != null ) 
                        {
                            System.out.println("Encontrado un vehiculo con capacidad mayor: " + cg);
                        }
                        else 
                        {
                            System.out.println("No hay vehículos con capacidad mayor...");   
                        }
                        break;
                
                case 5: 
                        System.out.print("Ingrese 1 para contar vehículos de carga o 2 para particulares: ");
                        tipo = Consola.readInt();
                        if ( tipo == 1 ) vh = new Carga();
                        else vh = new Particular();
                        cant = con.conteo( vh );
                        System.out.println("Cantidad de vehículos de ese tipo: " + cant);
                        break;
                        
                case 6: ;
            }
        }
        while( op != 6 );
    }
    
    /**
     * Carga por teclado los datos de los vehículos de carga.
     */
    public static void cargarVehiculos()
    {
        int n = con.getCantidad();
        Vehiculo vh;
        for(int i = 0; i < n; i++)
        {
            System.out.print("Marca del vehículo: ");
            String mar = Consola.readLine();
            
            System.out.print("Modelo o año: ");
            int mod = Consola.readInt();
         
            System.out.print("Precio: ");
            float pre = (float)Consola.readDouble();
            
            System.out.print("Ingrese 1 si es de Carga o 2 si es Particular: ");
            int tipo = Consola.readInt();
            
            if ( tipo == 1 )
            {
                System.out.print("Capacidad de carga: ");
                int t = Consola.readInt();
                vh = new Carga(mar, mod, pre, t);
            }
            else 
            {
                System.out.print("Cantidad de puertas: ");
                int p = Consola.readInt();
                vh = new Particular(mar, mod, pre, p);
            }
            
            con.setVehiculo(vh, i);
        }
    }
   
}
