package EqualsYHashCode;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MainLibro {


    public static void main(String[] args) {

        Libro cl1 = new Libro(25, "Programacion en Java", "ArielZarate");
        Libro cl2 = new Libro(26, "Programacion en Java", "ArielZarate");
        Libro cl3 = new Libro(26, "Programacion en Java", "ArielZarate");




        /**
         Vamos a comparar dos metodos de forma que se entienda la diferencia entre uno y el otro
         Sino redefinimos el metodo equals , nos dara que son objetos distintos
         */

        /**
         * si igualo unh objeto con otro este tendra la misma direccion de momoria que el otro y seran iguales
         */
        //cl1=cl2;

        equalsSinRedifinir(cl1,cl2);

        /**
         * metodo equals redefinido por mi
        */




        System.out.println("\n METODO REDEFINIDO POR MI COMPARANDO LOS ISBN");
        if(equalsRedefinido(cl1,cl2))
        {
            System.out.println("son iguales " );
            System.out.println("libro 1 hashcode " + cl1.hashCode());;
            System.out.println("libro 2 hashcode " + cl2.hashCode());;
        }
        else {
            System.out.println("son distintos ");
            System.out.println("libro 1 hashcode " + cl1.hashCode());;
            System.out.println("libro 2 hashcode " + cl2.hashCode());;
        }



        /**
         * Ahra compararemos con equals redefinido y el metodo hashCode
         * HEREDEDADOS
         */


         System.out.println("\nMETODO EQUALS Y HASHCODE DE OBJECT REDEFINIDOS ");
        if(cl1.equalsOriginalRedefinido(cl2))
        {
            System.out.println("son iguales " );
            System.out.println("libro 1 hashcode " + cl1.hashCodeOriginal());;
            System.out.println("libro 2 hashcode " + cl2.hashCodeOriginal());;
        }
        else {
            System.out.println("son distintos ");
        }




    }


    public static void equalsSinRedifinir(Object o1, Object o2) {

        if ((o1) != null && o2 != null) {

            /**
             * estamos usando el equal sin redefinir
             */

            if (o1.equals(o2)) {
                System.out.println("Son objectos iguales");
            } else System.out.println("No son objectos iguales");
        } else {
            System.out.println("algun objeto es null");
        }
    }

    public static boolean equalsRedefinido(Object o1 , Object o2) {
        if (o1 instanceof Libro && o2 instanceof Libro) {
            Libro l1 = (Libro) o1;
            Libro l2 = (Libro) o2;

                /**
                equals redefinido
                 */
            if(l1.getISBN()== l2.getISBN())
            {
                return true;
            }else{
                return false;
            }
        }else return false;
    }




}
