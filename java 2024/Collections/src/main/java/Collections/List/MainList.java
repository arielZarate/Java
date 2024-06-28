package Collections.List;

import Collections.entities.LenguajeProgramacion;

import java.util.*;

public class MainList {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

      //  List<LenguajeProgramacion> coleccion= new ArrayList<>();  //arrayList
       List<LenguajeProgramacion> coleccion= new LinkedList<>(); //linkedList




        System.out.println("ingrese el tamaño de la colleccion que desea crear");
        int tam=scan.nextInt();
        // Consumir el carácter de nueva línea pendiente
        scan.nextLine();


        for (int i = 0; i < tam; i++) {

            System.out.println("ingrese el nombre del lenguaje");
            String  str=scan.nextLine();

           LenguajeProgramacion nuevo=new LenguajeProgramacion(str);

           coleccion.add(nuevo);
        }

        System.out.println("Lista cargada con exito");


     /*
        for(LenguajeProgramacion e :coleccion)
        {
            System.out.println(e.toString());
        }

     * */


        Iterator<LenguajeProgramacion> iterator =coleccion.iterator();

        while(iterator.hasNext())
        {
        LenguajeProgramacion leng=iterator.next();

            System.out.println(leng.toString());
        }

    }
}
