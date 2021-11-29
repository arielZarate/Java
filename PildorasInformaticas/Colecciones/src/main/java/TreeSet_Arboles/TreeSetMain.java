package TreeSet_Arboles;



import java.util.Iterator;
import java.util.TreeSet;
import TreeSet_Arboles.Articulos;

public class TreeSetMain {
    public static void main(String[] args) {


        /**
         * Caracteristicas
       # impide los numeros duplicados
         TreeSet permiteOrdenar ya sea por la interface Comparable o Comparator

         si son de tipoStaring los ordena por orden Alfabetico con el CompareTo de Comparable
         por que la clase String usa la interfazComparable
         */

        TreeSet<String> ordenaPersonas=new TreeSet<>();

        ordenaPersonas.add("Sandra");
        ordenaPersonas.add("Diana");
        ordenaPersonas.add("Leandro");
        ordenaPersonas.add("Leandro");

        System.out.println("***ORDENA POR STRING***");
        System.out.println(ordenaPersonas);
        System.out.println();


        /**
         * ahora treeSet con numeros
         */

        TreeSet<Integer> ordenaNumeros=new TreeSet<>();

        ordenaNumeros.add(12);
        ordenaNumeros.add(9);
        ordenaNumeros.add(15);
        ordenaNumeros.add(6545);

        System.out.println("***ORDENA POR NUMEROS***");
        System.out.println(ordenaNumeros);
        System.out.println();


        /**
         * DEbo implementar Comparable en la clase Articulos y redefinir el metodo
         */
        TreeSet<Articulos> ordenaArticulos=new TreeSet<Articulos>();






        ordenaArticulos.add(new Articulos(1,"Leche"));
        ordenaArticulos.add(new Articulos(2,"Harina"));
        ordenaArticulos.add(new Articulos(3,"Azucar"));
        ordenaArticulos.add(new Articulos(4,"Yerba"));
        ordenaArticulos.add(new Articulos(4,"Yerba"));
        ordenaArticulos.add(new Articulos(5,"Coca"));


        System.out.println("***ORDENA POR LA CLASE ARTICULOS , REDEFINIENDO EL EQUALS Y HASHCODE***");

        Iterator<Articulos> it=ordenaArticulos.iterator();

        while(it.hasNext())
        {
            Articulos a=it.next();
            System.out.println(a.toString());
        }

        //recorriendo con foreach
        for (Articulos a: ordenaArticulos) {
            System.out.println("hashcode: " +a.hashCode());
        }













    }
}
