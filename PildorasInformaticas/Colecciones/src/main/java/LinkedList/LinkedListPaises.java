package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;

public class LinkedListPaises {

    public static void main(String[] args) {

        LinkedList<String> paises=new LinkedList<>();


        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");

        LinkedList<String> capitales=new LinkedList<>();
        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("DF");
        capitales.add("Lima");


        //System.out.println(paises);
      //  System.out.println(capitales);


       // System.out.println("\nCantidad de paises: " + paises.size());





        /**
         * 1 Tarea
         * agregar cada cada capital a su pais
         */
        System.out.println();
        System.out.println("listIterator");
        System.out.println();

        ListIterator<String> itPaises= paises.listIterator();
        ListIterator<String> itCapitales= paises.listIterator();



        while(itCapitales.hasNext())
        {

            if(itPaises.hasNext())
            {
               itCapitales.next();
            }

            itPaises.add(itCapitales.next());
            //System.out.println(oP + " Longitud de palabra : "+ oP.length());

        }

        System.out.println(paises);


    }




}
