public class Principal
{
    private static Facultad a;
    
    public static void main (String args[])
    {
        int n, num, mat, anio, not;
        float prom;
        Alumno alu;
        do
        {
          System.out.print("¿Cuántos Alumnos? (mayor a cero, please): ");
          n = Consola.readInt();
        }
        while(n<=0);
        a = new Facultad("UTN - FRC", n);
        
        int op;
        do
        {
            System.out.println("Menú Principal - Facultad: " + a.getNombre());
            System.out.println("\t1. Cargar datos en el arreglo de alumnos");
            System.out.println("\t2. Generar la lista con todos los alumnos");
            System.out.println("\t3. Buscar un alumno y calcular su promedio de materias aprobadas");
            System.out.println("\t4. Contar cuántos alumnos aprobaron una materia dada");
            System.out.println("\t5. Actualizar nota de un alumno en una materia");
            System.out.println("\t6. Mostrar todos los datos");
            System.out.println("\t7. Salir");
            System.out.print("\t\t Ingrese número de opción: ");
            op = Consola.readInt();
            
            switch(op)
            {
               case 1:  cargar();
                        break;
                        
               case 2:  a.listaOrdenada();
                        System.out.println("La lista fue generada");
                        break;
                        
               case 3:  System.out.print("Numero del alumno a buscar: ");
                        num = Consola.readInt();
                        alu = a.buscarAlumno(num);
                        if ( alu != null )
                        {
                            System.out.println( "Alumno encontrado: " + alu );
                            System.out.println("Su promedio de materias aprobadas es: " + alu.promedioMateriasAprobadas());
                        }
                        else System.out.println("No existe ese alumno");
                        break;
               
               case 4:  System.out.print("Código de la materia (entre 1 y 8 please...): ");
                        mat = Consola.readInt();
                        System.out.print("Ano de cursado (entre 1 y 5 please): ");
                        anio = Consola.readInt();
                        System.out.println("Cantidad de alumnos que la aprobaron: " + a.aprobaron(mat, anio));
                        System.out.println("Hecho...");
                        break;

               case 5:  System.out.print("Legajo del alumno: ");
                        num = Consola.readInt();
                        System.out.print("Código de la materia (entre 1 y 8 please...): ");
                        mat = Consola.readInt();
                        System.out.print("Ano de cursado (entre 1 y 5 please): ");
                        anio = Consola.readInt();
                        System.out.print("Nota: ");
                        not = Consola.readInt();
                        a.actualizarNota(num, mat, anio, not);
                        System.out.println("Hecho...");
                        break;
                        
               case 6:  System.out.println( a.toString() );
                        break;
                        
               case 7:  ;
            }
        }
        while(op != 7);
    }
    
    public static void cargar()
    {
        System.out.println("Cargue los datos de los alumnos: ");
        for (int i = 0; i < a.getCantidadAlumnos(); i++)
        {
            System.out.print("Número de legajo: ");
            int num = Consola.readInt();
            
            System.out.print("Nombre: ");
            String nom = Consola.readLine();

            // crea un alumno cuya matriz de notas vale cero en todos sus casilleros...
            Alumno alu = new Alumno( num, nom );

            // las notas se generan en forma aleatoria, para no trabajar tanto en la carga de datos...
            for(int mat = 1; mat <= 8; mat++)
            {
                for (int anio = 1; anio <= 5; anio++)
                {
                    int not = ((int)( Math.random() * 10 )) + 1;   
                    alu.setNota(mat, anio, not);
                }
            }
            
            a.setAlumno( i, alu );
        }
    }
}
