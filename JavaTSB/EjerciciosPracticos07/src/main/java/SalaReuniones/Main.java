package SalaReuniones;

import java.util.*;


public class Main {
    public static void main(String[] args) {

    /*

1. Listado de reuniones, ordenado por horario.
2. Cantidad de reuniones
3. Cantidad total de participantes
4. Todos los datos de la última reunión
5. Cantidad de reuniones a las que asistió Juan Perez

1. Sala de Reuniones (con iterator y generics)
Planteamos la ultima evolución de este ejemplo, implementando los recorridos con iteradores:
Agregar al proyecto Sala de Reuniones la siguiente funcionalidad:
•	Indicar cuántas reuniones requieren catering y cuál es el total de participantes esperado
•	Mostrar horarios de las reuniones a las cuales asistirá una persona cuyo nombre y apellido se ingresan por teclado

     */


        Calendar h1 = Calendar.getInstance();
        Calendar h2 = Calendar.getInstance();
        Calendar h3 = Calendar.getInstance();

        h1.set(2021, 9, 4, 19, 40, 24);
        h2.set(2021, 9, 10, 14, 30, 16);
        h3.set(2021, 9, 24, 10, 9, 29);

        //podria haber utilizado la clase Date hora=new Date(); es lo mismo


        /**
         * creamos los objetos personas
         */
        Persona p1 = new Persona("Nicolas", "Mora", 32864545);
        Persona p2 = new Persona("Javier", "Milei", 25564487);
        Persona p3 = new Persona("Victoria", "villaruel", 545564564);
        Persona p4 = new Persona("JoseLuis", "espert", 54564456);
        Persona p8 = new Persona("Mauricio inutil ", "Macri", 53564);
        Persona p5 = new Persona("alicia ", "Carrio", 53456);
        Persona p6 = new Persona("Cristina (chora) ", "Fernandez", 545455);
        Persona p7 = new Persona("Leandro ", "Santoro", 564564);
        //creo listas de tipo Persona


        /**
         * ArrayList tipo Persona
         */
        ArrayList<Persona> arrayPersona1 = new ArrayList<Persona>();
        ArrayList<Persona> arrayPersona2 = new ArrayList<Persona>();
        ArrayList<Persona> arrayPersona3 = new ArrayList<Persona>();
        // List arrayPersona3 = new ArrayList<Persona>();

        /**
         * ArrayPersonas
         *
         * List arrayPersona2 = new ArrayList<Persona>();
         * List arrayPersona3 = new ArrayList<Persona>();
         4);
         *
         */

        //System.out.println("Agregamos los elementos al ArrayList ");
        arrayPersona1.add(p1);
        arrayPersona1.add(p8);
        arrayPersona1.add(p7);
        arrayPersona1.add(p5);

        arrayPersona2.add(p5);
        arrayPersona2.add(p6);
        arrayPersona2.add(p7);

        arrayPersona3.add(p3);
        arrayPersona3.add(p4);
        arrayPersona3.add(p2);

        // System.out.println("\n Eliminamos algun elementos del ArrayList con remove");
       /* arrayPersona1.remove(3);
        arrayPersona1.remove(2);
        arrayPersona2.remove(1);

        */


        //System.out.println("\n Buscar algun elemento como una persona en el array");
        /*System.out.println(arrayPersona2.contains(p1));
        System.out.println("");
       */


        //******************Reunion************************
        /**
         * creamos  la variables de tipo Reunion
         */
        //primera forma de agregar
        // System.out.println("Agregamos una lista de personas(ArrayList a la reunion)");
        Reunion r1 = new Reunion(h1, arrayPersona1);
        Reunion r2 = new Reunion(h2, arrayPersona2);
        Reunion r3 = new Reunion(h3, arrayPersona3);
        // Reunion r3 = new Reunion(hora, arrayPersona3);

        /**
         * creamos el array de tipo List de reunion
         */
        ArrayList<Reunion> arrayReunion = new ArrayList<Reunion>();


        /**Agregamos las personas a la reunion
         */
        arrayReunion.add(r1);
        // arrayReunion.add(r2);
        arrayReunion.add(r2);
        //arrayReunion.add(r3);
        arrayReunion.add(r3);
        //arrayReunion.add(r1);


        // arrayReunion.sort(arrayReunion);


        //********************Sala*****************************************
        /**
         * instanciamos objetos e tipo Sala
         */
        Sala s1 = new Sala(1, arrayReunion);
        Sala s2 = new Sala(2, arrayReunion);
        Sala s3 = new Sala(3, arrayReunion);
        Sala s4 = new Sala(4, arrayReunion);


        /**
         *creamos un  array de tipo Sala
         */

        ArrayList<Sala> arraySala = new ArrayList<Sala>();


        /**
         * agregamos elemenetos reunion al array sala
         */
        arraySala.add(s1);
        arraySala.add(s2);
        arraySala.add(s3);
        arraySala.add(s4);


        // 1. Listado de reuniones, ordenado por horario.
        Iterator<Sala> sala = arraySala.iterator();
        while(sala.hasNext())
        {
            System.out.println(sala.next().toString());
        }


        // 2. Cantidad de reuniones
       // Iterator<Reunion> reunion = arrayReunion.iterator();


        System.out.println("Cantidad de reuniones: " + arrayReunion.listIterator().next().toString());

        //  3. Cantidad total de participantes
        System.out.println("La cantidad de participantes es : " + arrayReunion.listIterator().next().cantidadParticipantes());

        // 4  . Todos los datos de la última reunión
        System.out.println("Ultima Reunion: " + arraySala.listIterator().next().DatosUltimaReunion());



        // 5. Cantidad de reuniones a las que asistió Juan Perez


    }


}



