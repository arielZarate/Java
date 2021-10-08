package empleado;

import java.util.ArrayList;
import java.util.Iterator;

public class PrincipalArrayList {
    public static void main(String[] args) {

        /**
         * 1 estamos creando un vector de tipo Empleados
         * El problema es que el array es de tipò limitado
         */
        /*
        Empleado listadoEmpleado[]=new Empleado[3];
        listadoEmpleado[0]=new Empleado("Ana",55,34.000);
        listadoEmpleado[1]=new Empleado("Ariel",35,120.000);
        listadoEmpleado[2]=new Empleado("Nahuel",22,10.000);
        */

        /**
         * Solucion crear una lista o arrayList solcuiona ese problema
         */
        ArrayList<Empleado> listadoEmpleado=new ArrayList<>();
        /**
         * ArrayList almecena por defecto un espacio de memoria de 10
         * metodos de un array list
         * add()
         * remove()
         * find()
         * set()
         * get()  //devuelve un elemento en la posicion i
         */




        listadoEmpleado.add(new Empleado("Juan",34,45.000));
        listadoEmpleado.add(new Empleado("Pedro",15,18.000));
        listadoEmpleado.add(new Empleado("Serene",18,31.000));
        listadoEmpleado.add(new Empleado("joaquin",29,34.000));
        listadoEmpleado.add(new Empleado("Ana",55,60.000));
        listadoEmpleado.add(new Empleado("Juan",34,45.000));
        listadoEmpleado.add(new Empleado("Pedro",15,18.000));
        listadoEmpleado.add(new Empleado("Serene",18,31.000));
        listadoEmpleado.add(new Empleado("joaquin",29,34.000));
        listadoEmpleado.add(new Empleado("Ana",55,60.000));
        listadoEmpleado.add(new Empleado("Juan",34,45.000));
        listadoEmpleado.add(new Empleado("Pedro",15,18.000));
        listadoEmpleado.add(new Empleado("Serene",18,31.000));
        listadoEmpleado.add(new Empleado("joaquin",29,34.000));

        /**
         * este metodo corta el arrayList para que no queden espacios de memoria vacios
         */
        //listadoEmpleado.trimToSize();





        /**
         * como agrego un elemento en la posicion cualquiera
         * set()
         */
        listadoEmpleado.set(2,new Empleado("ModificadoAhora",205,60.000));



        System.out.println("El arrayList tienen " + listadoEmpleado.size() + " empleados");

        /**
         * Listado de empleado con foreach
         */
        /*
             for (Empleado a: listadoEmpleado) {

            System.out.println(a.dameDatos());
        }
         */

        /** para obtener un elemento de un indice especifico uso get()
         */
        System.out.println("quiero el empleado con el metodo get " +listadoEmpleado.get(4).dameDatos());


        /**
         * Recorrer con for i
         */

        /*
        for (int i = 0; i < listadoEmpleado.size(); i++) {


            System.out.println(listadoEmpleado.get(i).dameDatos());
        }
        */

        /**
         * copiando los datos del arraylist a un nuevo array
         * para mostrar con un for comun
         */

        /*
          Empleado arrayEmpleado[]=new Empleado[listadoEmpleado.size()];

        //convertimos el arrar

        listadoEmpleado.toArray(arrayEmpleado);

        for (int i = 0; i < arrayEmpleado.length; i++) {
            System.out.println(arrayEmpleado[i].dameDatos());
        }

         */


        /**
         * iteradores en java
         * pertenece al paquete java.util
         * metodos
         * hasnext() recorre hasta que sea false
         *
         */
        Iterator <Empleado> miIterator= listadoEmpleado.iterator();


        //hasnest() devulve true si hay mas objeto en la collecion y sigue el bucle
        while(miIterator.hasNext())
        {
            System.out.println(miIterator.next().dameDatos());

       }
    }
}

