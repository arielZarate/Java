public class Principal
{
    private static JuntaElectoral a;
    
    public static void main (String args[])
    {
        int num;
        Votante vot;
        a = new JuntaElectoral("Saldán");
        
        int op;
        do
        {
            System.out.println("Menú Principal - Junta Electoral Regional de: " + a.getNombre());
            System.out.println("\t1. Cargar datos en el padrón de votantes");
            System.out.println("\t2. Mostrar padrón general");
            System.out.println("\t3. Buscar votante");
            System.out.println("\t4. Cantidad de varones y mujeres");
            System.out.println("\t5. Crear archivo con mayores a 70 años");
            System.out.println("\t6. Mostrar el archivo de mayores a 70 años");
    
            System.out.println("\t7. Salir");
            System.out.print("\t\t Ingrese número de opción: ");
            op = Consola.readInt();
            
            switch(op)
            {
               case 1:  cargar();
                        break;
                        
               case 2:  System.out.println(a.toString());
                        break;
                        
               case 3:  System.out.print("Número de dni del votante a buscar: ");
                        num = Consola.readInt();
                        vot = a.buscar(num);
                        if( vot != null ) System.out.println( "Encontrado: " + vot );
                        else System.out.println("No existe ese votante en el padrón");
                        break;
                        
               case 4:  System.out.println( a.cantidadPorSexo() );
                        break;
                        
               case 5:  System.out.println( "Se procede a crear el archivo con votantes mayores a 70 años..." );
                        a.generarSegundoArchivo();
                        System.out.println( "Hecho..." );
                        break;

               case 6:  System.out.println( a.mostrarSegundoArchivo() );
                        break;
                        
               case 7:  ;
            }
        }
        while(op != 7);
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los votantes");
        System.out.print("Número de dni (con cero termina...): ");
        int num = Consola.readInt();
        while(num != 0)
        {
            System.out.print("Nombre del Votante: ");
            String nom = Consola.readLine();

            System.out.print("Edad: ");
            int d = Consola.readInt();
           
            int sex;
            do
            {
                System.out.print("Sexo (0: varón  -  1: mujer): ");
                sex = Consola.readInt();
            }
            while( sex < 0 || sex > 1);
            char s = 'v';
            if (sex == 1) s = 'm';
            
            Votante v = new Votante( num, nom, d, s);
            a.registrar( v );
            
            System.out.print("Número de dni (con cero termina...): ");
            num = Consola.readInt();
        }
    }
}
