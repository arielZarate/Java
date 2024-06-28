package Collections.Set;

import Collections.entities.LenguajeProgramacion;

import java.util.*;

public class MainSet {

        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);



          //  Set <LenguajeProgramacion> set = new HashSet<>() ; //hasset
            Set <LenguajeProgramacion> set = new TreeSet<>() ; //hasset

            System.out.println("ingrese el tamaño de la colleccion que desea crear");
            int tam=scan.nextInt();
            // Consumir el carácter de nueva línea pendiente
            scan.nextLine();


            for (int i = 0; i < tam; i++) {

                System.out.println("ingrese el nombre del Lenguaje");
                String  str=scan.nextLine();
                LenguajeProgramacion leng=new LenguajeProgramacion(str);
                set.add(leng);
            }

            System.out.println("Lista cargada con exito");




            System.out.println("ingrese el nombre del lenguaje que desea eliminar");
            String str_del= scan.nextLine();
           boolean encontrado=false;
            Iterator<LenguajeProgramacion> iterator = set.iterator();

              while(iterator.hasNext())
              {

                LenguajeProgramacion le=iterator.next();


                if(le.getNombre().equals(str_del))
                {
                    iterator.remove();
                    encontrado=true;
                    System.out.println("lenguaje eliminado");
                    break;
                }
              }

            if(!encontrado)
            {
                System.out.println("lenguaje no eliminado");
            }


            Iterator<LenguajeProgramacion> iterator2 =set.iterator();

            while(iterator2.hasNext())
            {
                LenguajeProgramacion leng=iterator2.next();

                System.out.println(leng.toString());
            }


            System.out.println("el tamaño de la lista es :"  + set.size() );
            scan.close();

        }
    }



