package Collections.Hash;

import Collections.entities.LenguajeProgramacion;

import java.util.*;

public class MainMap {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);



        Map<String,Integer > has= new HashMap<>(); //hasmap

        System.out.println("ingrese el tamaño de la colleccion que desea crear");
        int tam=scan.nextInt();
        // Consumir el carácter de nueva línea pendiente
        scan.nextLine();


        for (int i = 0; i < tam; i++) {

            System.out.println("ingrese el nombre del Fruto");
            String  str=scan.nextLine();


            System.out.println("ingrese la cantidad de elemntos del fruto ");
            int cant=scan.nextInt();
            scan.nextLine(); // Consumir el carácter de nueva línea pendiente después de nextInt()
            has.put(str,cant);
        }

        System.out.println("Lista cargada con exito");









        //==============================================


        for (Map.Entry<String,Integer> fruta : has.entrySet() ) {

            String fru=fruta.getKey();
            int cant=fruta.getValue();


            System.out.println(fru + ":"  + cant);
        }


        System.out.println("ingrese una fruta para eliminar");
        String str2=scan.nextLine();


        boolean exist= has.containsKey(str2);
        if(exist)
        {
            has.remove(str2);

            System.out.println("Fruta eliminada ");
        }else
        {
            System.out.println("no existe la fruta");
        }


        System.out.println("Cantidad de elementos DEL HASMAP: " +has.size() );

        float cont=0;
        for (Map.Entry<String,Integer> fruta : has.entrySet() ) {

          //  String fru=fruta.getKey();
            int cant= fruta.getValue();
             cont+=cant;

        }

        System.out.println("la cantdad de fruta que hay es " + cont);



        scan.close();


    }
}
