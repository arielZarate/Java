package matrices;

import java.util.Scanner;

/**
 *
 * @author ariel ejercicio con matrices y promedio me costo hacerlo ⚡
 */
public class matriz {

    public static void main(String[] args) {

        /*
        se pide crear una tabla de 4 filas y 4 columnas dond se guardan las notas 
        cada fila correponde a lanota de cada alumno y al final ultima [f][c] debe tener el promedio
        una vez realizado esto se debe mostrar las 3 notas promoeido decada alumno
         */
        //defino una matriz ocn 4 filas y 4 columnas 
        int FILA = 4;
        int COLUMNA = 4;
        double matriz[][] = new double[FILA][COLUMNA];

        //necesito 2 for para llenar
        Scanner t = new Scanner(System.in);

        for (int i = 0; i < FILA; i++) //filas recorre en forma vertical
        {

            for (int j = 0; j < COLUMNA - 1; j++)//recorre en forma horizontal
            {
                System.out.println("Ingrese un valor para la fila [" + (i + 1) + "] ,columna[" + (j + 1) + "]: ");
                matriz[i][j] = t.nextInt();
                // System.out.println("El valor cargado en la posicion " + (i+1) + (j+1)+ " es "+ matriz[i][j]);
            }
        }

        //MOSTRAMOS POR PRIMERA VEZ 
        for (int i = 0; i < FILA; i++)
        {

            for (int j = 0; j < COLUMNA - 1; j++)  //recooro hasta una columna menos ya que la ultima esta vacia aun
            {

                //esto muestra en cada iteraccion el valor de cada casillero
                System.out.println(matriz[i][j]);

            }

            System.out.println("");

        }

        //####################################################
        //RECORREMOS Y SACAMOS EL PROMEDIO 
        for (int i = 0; i < FILA; i++)
        {

            //ojo hay que declarar esta variable de forma local no global 
            //orque sino luego te calcula mal el promedio 
            //cuando termina de recorrer el la suma y el prom
            // y se guardaron los valores y no existe mas
            double suma = 0;
            for (int j = 0; j < COLUMNA - 1; j++)
            {

                suma += matriz[i][j];

            }
            //aca calcula el promedio
            double prom = suma / (COLUMNA - 1);  //se podria haber puesto 3 en vez de COLUMNA -1
            //aca asigno el promedio en la fila columna correspondiente 
            matriz[i][COLUMNA - 1] = prom;
        }

        System.out.println("");
        System.out.println("#############valores de los promedios ###########");
        System.out.println("");
        for (int i = 0; i < FILA; i++)
        {

            //AHORA DEBE ESTAR HASTA EL FINAL PORQUE DEBE MOSTRAR HASTA LA ULTIMA
            for (int j = 0; j < COLUMNA; j++)
            {

                //esto muestra en cada iteraccion el valor de cada casillero
                System.out.println(matriz[i][j]);

            }

            System.out.println("");

        }

    }

}
