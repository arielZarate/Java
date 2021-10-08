public class Principal
{
    private static Administracion a;
    
    public static void main (String args[])
    {
        a = new Administracion();
        
        int op;
        do
        {
            System.out.println("Menú Principal - " + a.getNombre());
            System.out.println("\t1. Cargar datos (manualmente)");
            System.out.println("\t2. Cargar datos (generar aleatoriamente)");
            System.out.println("\t3. Mostrar datos");
            System.out.println("\t4. Total de gastos por propiedad");
            System.out.println("\t5. Total de gastos por mes");
            System.out.println("\t6. Salir");
            System.out.print("\t\t Ingrese número de opción: ");
            op = Consola.readInt();
            
            switch(op)
            {
               case 1:  cargar();
                        break;
                        
               case 2:  a.generarGastosAleatorios();
                        break;
                        
               case 3:  System.out.println( a.toString() );
                        break;
               
               case 4:  System.out.println( a.toStringTotalPorPropiedad() );
                        break;
                        
               case 5:  System.out.println( a.toStringTotalPorMes() );                       
                        break;
                        
               case 6:  ;
            }
        }
        while(op != 6);
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los gastos:");
        for (int i = 0; i < 4; i++)
        {
            System.out.println("Propiedad: " + i);
            for (int j = 0; j < 3; j++)
            {
                System.out.println("Mes " + j);
                System.out.print("\tGastos de electricidad: ");
                float e = (float)Consola.readDouble();
                System.out.print("\tGastos de gas: ");
                float g = (float)Consola.readDouble();
                System.out.print("\tGastos de agua: ");
                float w = (float)Consola.readDouble();
            
                Consumo cons = new Consumo( e, g, w );
                a.setGastos( cons, i, j );
            }
        }
    }
}
