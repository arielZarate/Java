package desafios.contarNumerosParesImpares;

import java.util.Arrays;

/**
 * Crear una funcion  para contar el numero de digotos pares e impares en un numero entero positivo
 * Debe retornar un array de dos elementos, el primer elemento es la cantidad de digitos pares y el segundo la cantidad de digitos impares
 * Ejemplo: 123456 -> [3,3]
 */
public class Main {

    static int[] countEvenOddDigits(String numStr) {
        int aux[] = new int[2];
        String[] numStr2 = numStr.split("");
        for (String s : numStr2) {
            if (Integer.parseInt(s) % 2 == 0) {
                aux[0]++;
            } else {
                aux[1]++;
            }

        }
        return aux;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(countEvenOddDigits("113476")));
    }

}
