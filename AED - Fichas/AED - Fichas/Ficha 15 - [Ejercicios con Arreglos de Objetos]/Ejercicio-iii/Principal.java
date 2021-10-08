public class Principal
{
    private static Instituto a;
    
    public static void main (String args[])
    {
        int n;
        do
        {
          System.out.print("¿Cuántos proyectos? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while(n<=0);
        a = new Instituto(n);
        
        int op;
        do
        {
            System.out.println("Menú Principal - Instituto: " + a.getNombre());
            System.out.println("\t1. Cargar datos");
            System.out.println("\t2. Mostrar datos");
            System.out.println("\t3. Proyectos con duración mayor a un año - ordenados por tema");
            System.out.println("\t4. Conteo por área");
            System.out.println("\t5. Proyecto área 4 con mayor presupuesto");
            System.out.println("\t6. Proyectos con duración mayor a dos años - un arreglo con esos proyectos");
            System.out.println("\t7. Salir");
            System.out.print("\t\t Ingrese número de opción: ");
            op = Consola.readInt();
            
            switch(op)
            {
               case 1:  cargar();
                        break;
                        
               case 2:  System.out.println( a.toString() );
                        break;
               
               case 3:  System.out.println( a.toStringDuracionMayorA1() );
                        break;

               case 4:  System.out.println( a.toStringConteoPorArea() );
                        break;
                        
               case 5:  Proyecto p2 = a.getTipo4MayorPresupuesto();
                        if( p2 != null ) System.out.println("Proyecto area 4 con mayor presupuesto: " + p2);
                        else System.out.println("No hay datos cargados o no hay proyectos area 4");
                        break;
                        
               case 6:  System.out.println( a.toStringProyectosLargos() );
                        break;
                        
               case 7:  ;
            }
        }
        while( op != 7 );
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los Proyectos: ");
        for (int i = 0; i < a.getCantidadProyectos(); i++)
        {
            System.out.print("Tema: ");
            String nom = Consola.readLine();
            
            System.out.print("Presupuesto: ");
            float imp = (float)Consola.readDouble();
            
            int ar;
            do
            {
                System.out.print("Area (entre 0 y 6 please): ");
                ar = Consola.readInt();
            }
            while( ar < 0 || ar > 6 );
            
            int d;
            do
            {
                System.out.print("Duración (entre 0 y 3 please): ");
                d = Consola.readInt();
            }
            while( d < 0 || d > 3 );
            
            Proyecto pro = new Proyecto( nom, ar, d, imp );
            a.setProyecto( pro );
        }
    }
}
