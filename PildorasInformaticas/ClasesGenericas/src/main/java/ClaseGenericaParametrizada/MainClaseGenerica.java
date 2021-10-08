package ClaseGenericaParametrizada;

import java.util.ArrayList;

public class MainClaseGenerica {
    public static void main(String[] args) {

        /**
         * creamos la instancia
         */

        ClaseGenerica<String>una = new ClaseGenerica<>();

        /**
        una. => nos muestra que recibe String
         */
        una.setPrimero("Juan");
        System.out.println(una.getPrimero());


        Empleado e1=new Empleado("Maria",34,2555);
        /**
        Ahora creamos una clase generica de tipo Empleado
         */
        ClaseGenerica<Empleado> otra=new ClaseGenerica<>();
        otra.setPrimero(e1);
        System.out.println(otra.getPrimero());
        System.out.println(otra.getPrimero().dameDatos());

        /**
         * Ahora creo un arrayList de nombres
         */

        System.out.println("\n menor de un Array");
        ArrayList <String> nombres=new ArrayList<>();
        nombres.add("Anacleta");
        nombres.add("zahira");
        nombres.add("Ariel");
        nombres.add("Tupac");

        System.out.println(otra.MenorElemento(nombres));
    }
}
