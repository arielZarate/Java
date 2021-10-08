package Iteradores;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainIterador {
    public static void main(String[] args) {

        Cliente cl1=new Cliente(4367846,"Ramon Valdez",5000000);
        Cliente cl2=new Cliente(87436784,"Maria Antonieta de las Nieves",4000000);
        Cliente cl3=new Cliente(86758677,"Roberto Bolañoz",9999000);
        Cliente cl4=new Cliente(783674,"Carlos Alberto Villagran",3800000);

        /**
         * Set es un collecion como List
         */
       Set<Cliente> colCliente=new HashSet<>();
       colCliente.add(cl1);
       colCliente.add(cl2);
       colCliente.add(cl3);
       colCliente.add(cl4);


        for (Cliente c:colCliente ) {
            System.out.println("Lista de nombres:" + c.getNombre());
        }

       Iterator<Cliente> it=colCliente.iterator();
      /*
       while(it.hasNext())
       {
           String nombreCliente=it.next().getNombre();
           System.out.println("nombre Cliente: " + nombreCliente);
       }
        */

        /**Eliminar un elemento
         *
         */



        while(it.hasNext())
        {
            if(it.next().getNombre().equals("Roberto Bolañoz"))
            {
                //System.out.println("Eliminamos un elemento : " + it.next().getNombre().toUpperCase());
                System.out.println("Estamos eliminando  un elemento ...");
                it.remove();
               // System.out.println("nombres Todos :" + it.next().getNombre());
            }
        }

        System.out.println("");

        for (Cliente c:colCliente ) {
            System.out.println("Lista de nombres:" + c.getNombre());
        }


    }
}
