
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
            System.out.println("3. Cargar Motocicletas: ");
            System.out.println("4. Mostrar todo");
            System.out.println("5. Actualizar precios");
            System.out.println("6. Salir");
            System.out.print("\t\tIngrese la opcion deseada: ");
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
                        cargarMotocicleta();
                        break;
       
                case 4:
                        System.out.println(con);
                        break;
                
                case 5:
                        con.actualizarPreciosCarga();
                        con.actualizarPreciosParticular();
                        con.actualizarPreciosMotocicleta();
                        break;
                
                case 6: ;
            }
        }
        while( op != 6);
    }
    
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
    public static void cargarMotocicleta()
    {
        int o = con.getCantidadMotocicletas();
        for(int i = 0; i < o; i++)
        {
            System.out.print("Marca de la Motocicleta: ");
            String mar = Consola.readLine();
         
            System.out.print("Modelo o año: ");
            int mod = Consola.readInt();
         
            System.out.print("Precio: ");
            float pre = (float)Consola.readDouble();
            
            System.out.print("Cilindra: ");
            int cil = Consola.readInt();
            
            Motocicleta mo=new Motocicleta(mar,mod,pre,cil);
            con.setMotocicleta(mo,i);
        }

    }
    
}
