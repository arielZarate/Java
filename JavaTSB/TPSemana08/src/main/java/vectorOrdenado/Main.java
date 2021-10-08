package vectorOrdenado;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("Lectura de numeros en un archivo de texto...");
        File f = new File("lote01.txt");


        //try {
        Scanner sc = new Scanner(System.in);
        Vector vector = null;

        int op = -1;

        do {
            System.out.println("");
            System.out.println("****Menu de Arreglo de Numeros ****");

            System.out.println("ingrese - 1 para Inicializar el Arreglo (sino lo inicializa no devolvera nada!) ");
            System.out.println("ingrese - 2 para Obtener Listado de Arreglo ");
            System.out.println("ingrese - 3 para obtener el conteo de inversiones ");
            System.out.println("ingrese - 4 para obtener booble sort ");

            System.out.println("ingrese - 0 para cortar!!!");
            System.out.print("ingrese su opcion:");
            op = sc.nextInt();
            switch (op) {


                case 1:
                    System.out.print("ingrese el tamaño del array (recuerde lote01.txt tiene 30.000 y lote92.txt tiene 300.000): ");
                    int tam = sc.nextInt();
                    vector = new Vector(tam);
                    System.out.println("Lectura de numeros en un archivo de texto , aguarde un momento por favor ....");
                    vector.InicializarVector(f);
                    System.out.println("Se ha leido el lote de numeros de forma exitosa!");

                    break;

                case 2:
                    System.out.println("****Listado***** \n");
                    System.out.println(vector.toString() + "\n\t***Fin de Listado de numeros ***");
                    break;
                case 3:
                    System.out.println("*****conteo de inversiones*****");
                    vector.seleccionDirectaTP();
                    System.out.println(vector.toString());
                    System.out.println("fin del listado \n");
                    System.out.println("cantidad de numeros: " + vector.seleccionDirectaTP());

                    break;

                case 4:
                    System.out.println("\n*****Booble sort*****");
                    vector.bubbleSort();
                    System.out.println(vector.toString());

                    break;
                case 0:
                    System.out.println("Ups 🙄😥😯😯😯😯 Corto el programa.");
                    break;
                default:
                    System.out.println("Ha seleccionado incorrectamente");
                    break;
            }


        } while (op != 0);

        System.out.println("🏍🏍🏍🏍🏍🏍🏍🏍🏍🏍🏍🏍🏍 Ha finalizado el menu 🚀🚀🚀🚀🚀");


        //} catch (FileNotFoundException ex) {
        //	System.out.println("No existe el archivo...");
        //}
    }
}


/**
 * codigo viejo
 * long t1, t2, tf;
 * int op;
 * <p>
 * Scanner sc = new Scanner(System.in);
 * Vector v = null;
 * do
 * {
 * System.out.println ("\nOpciones de Ordenamiento");
 * System.out.println ("0. Generar el Arreglo");
 * System.out.println ("1. Intercambio Directo (Burbuja)");
 * System.out.println ("2. Seleccion Directa");
 * System.out.println ("3. Insercion Directa");
 * System.out.println ("4. Quick Sort");
 * System.out.println ("5. Heap Sort");
 * System.out.println ("6. Shell Sort");
 * System.out.println ("7. Merge Sort");
 * System.out.println ("8. Verificar si esta ordenado");
 * System.out.println ("9. Salir");
 * System.out.print ("Ingrese opcion: ");
 * op = sc.nextInt();
 * switch (op)
 * {
 * case 0:
 * System.out.print ("Ingrese cantidad del elementos del vector: ");
 * int n = sc.nextInt();
 * v = new Vector(n);
 * System.out.print("Se vuelve a generar el vector...");
 * v.generate();
 * System.out.print("\nVector generado...");
 * break;
 * <p>
 * case 1:
 * if(v == null) {
 * System.out.println("El arreglo no ha sido generado aún...");
 * continue;
 * }
 * System.out.print("Se ordena el vector por Intercambio...");
 * t1 = System.currentTimeMillis();
 * v.bubbleSort();
 * t2 = System.currentTimeMillis();
 * tf = t2 - t1;
 * System.out.print("\nVector ordenado en: " + tf + " milisegundos...");
 * break;
 * <p>
 * case 2:
 * if(v == null) {
 * System.out.println("El arreglo no ha sido generado aún...");
 * continue;
 * }
 * System.out.print("Se ordena el vector por Seleccion...");
 * t1 = System.currentTimeMillis();
 * v.selectionSort();
 * t2 = System.currentTimeMillis();
 * tf = t2 - t1;
 * System.out.print("\nVector ordenado en: " + tf + " milisegundos...");
 * break;
 * <p>
 * case 3:
 * if(v == null) {
 * System.out.println("El arreglo no ha sido generado aún...");
 * continue;
 * }
 * System.out.print("Se ordena el vector por Insercion... ");
 * t1 = System.currentTimeMillis();
 * v.insertionSort();
 * t2 = System.currentTimeMillis();
 * tf = t2 - t1;
 * System.out.print("\nVector ordenado en: " + tf + " milisegundos...");
 * break;
 * <p>
 * case 4:
 * if(v == null) {
 * System.out.println("El arreglo no ha sido generado aún...");
 * continue;
 * }
 * System.out.print("Se ordena el vector por Quick Sort...");
 * t1 = System.currentTimeMillis();
 * v.quickSort();
 * t2 = System.currentTimeMillis();
 * tf = t2 - t1;
 * System.out.print("\nVector ordenado en: " + tf + " milisegundos...");
 * break;
 * <p>
 * case 5:
 * if(v == null) {
 * System.out.println("El arreglo no ha sido generado aún...");
 * continue;
 * }
 * System.out.print("Se ordena el vector por Heap Sort...");
 * t1 = System.currentTimeMillis();
 * v.heapSort();
 * t2 = System.currentTimeMillis();
 * tf = t2 - t1;
 * System.out.print("\nVector ordenado en: " + tf + " milisegundos...");
 * break;
 * <p>
 * case 6:
 * if(v == null) {
 * System.out.println("El arreglo no ha sido generado aún...");
 * continue;
 * }
 * System.out.print("Se ordena el vector por Shell Sort...");
 * t1 = System.currentTimeMillis();
 * v.shellSort();
 * t2 = System.currentTimeMillis();
 * tf = t2 - t1;
 * System.out.print("\nVector ordenado en: " + tf + " milisegundos...");
 * break;
 * <p>
 * case 7:
 * if(v == null) {
 * System.out.println("El arreglo no ha sido generado aún...");
 * continue;
 * }
 * System.out.print("Se ordena el vector por Merge Sort...");
 * t1 = System.currentTimeMillis();
 * v.mergeSort();
 * t2 = System.currentTimeMillis();
 * tf = t2 - t1;
 * System.out.print("\nVector ordenado en: " + tf + " milisegundos...");
 * break;
 * <p>
 * case 8:
 * if(v == null) {
 * System.out.println("El arreglo no ha sido generado aún...");
 * continue;
 * }
 * System.out.println("Se verifica si esta ordenado...");
 * if(v.checkOrder()) { System.out.println("Esta ordenado..."); }
 * else { System.out.println ("No esta ordenado..."); }
 * break;
 * <p>
 * case 9: ;
 * }
 * }
 * while (op != 9);
 * }
 */