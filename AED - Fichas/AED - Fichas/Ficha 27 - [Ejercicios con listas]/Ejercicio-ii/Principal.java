public class Principal
{
    private static Consultorio a;
    
    public static void main (String args[])
    {
        int num;
        Paciente pac;
        a = new Consultorio("Dr. Matasanos");
        
        int op;
        do
        {
            System.out.println("Menú Principal - Consultorio: " + a.getNombre());
            System.out.println("\t1. Cargar datos la lista de envíos");
            System.out.println("\t2. Mostrar pacientes con 10 o más días de demora");
            System.out.println("\t3. Vector con pacientes que tengan problema tipo 8 o 9");
            System.out.println("\t4. Buscar paciente");
            System.out.println("\t5. Mostrar datos del consultorio");
            System.out.println("\t6. Salir");
            System.out.print("\t\t Ingrese número de opción: ");
            op = Consola.readInt();
            
            switch(op)
            {
               case 1:  cargar();
                        break;
                        
               case 2:  System.out.println(a.getPacientesDemorados());
                        break;
                        
               case 3:  System.out.println( a.getProblemas8o9());
                        break;
               
               case 4:  System.out.print("Número de Historia Clínica del paciente a buscar: ");
                        num = Consola.readInt();
                        pac = a.buscarPaciente(num);
                        if( pac != null ) System.out.println( "Encontrado: " + pac );
                        else System.out.println("No existe ese paciente en la lista");
                        break;
                        
               case 5:  System.out.println( a );
                        break;
                        
               case 6:  ;
            }
        }
        while(op != 6);
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los pcientes");
        System.out.print("Número de historia clínica (con cero termina...): ");
        int num = Consola.readInt();
        while(num != 0)
        {
            System.out.print("Nombre del Paciente: ");
            String nom = Consola.readLine();

            System.out.print("Días transcurridos desde su última visita: ");
            int d = Consola.readInt();
           
            int t;
            do
            {
                System.out.print("Tipo de problema: (entre 0 y 9): ");
                t = Consola.readInt();
            }
            while( t < 0 || t > 9);
            
            Paciente pac = new Paciente( num, nom, d, t);
            a.setPaciente( pac );
            
            System.out.print("Número de historia clínica del siguiente paciente (con cero termina...): ");
            num = Consola.readInt();

        }
    }
}
