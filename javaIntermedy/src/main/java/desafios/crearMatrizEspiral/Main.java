package desafios.crearMatrizEspiral;


import java.util.ArrayList;
import java.util.List;

/**
 * Crear una matriz cuadrada de tamaño n x n y llenarla con números del 1 al n^2 en un patrón espiral,
 * comenzando desde la esquina superior izquierda y moviéndose en el sentido de las agujas del reloj.
 * <p>
 * 1 al n^2  -> 1, 2, 3, ..., n^2
 * <p>
 * si n=3, la matriz resultante debería ser:
 * [ [1, 2, 3],
 * [8, 9, 4],
 * [7, 6, 5] ]
 *
 * @author Ariel zarate
 **/
public class Main {

    public static List<List<Integer>> generateMatrix(int n) {

        int tam= n*n;
        System.out.println("tamanio de matrix:" + tam);

        Integer matrix[][]= new Integer[n][n];

        for (int f=0; f < matrix.length;f++) {

            for (int c = 0; c < matrix[f].length ; c++) {

                System.out.println("llenando matrix en la fila :" + (f+1) + " columna :" + (c+1) + " valor:" +(f+1)* (c+1) );
                //System.out.print(matrix[c][f] + " ");
            }

            System.out.println();
        }



        return null;
    }

    public static void main(String[] args) {

        System.out.println(generateMatrix(3));

    }
}
