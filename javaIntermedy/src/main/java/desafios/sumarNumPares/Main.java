package desafios.sumarNumPares;

public class Main {


    /**
     * Devuelve la suma de todos los números pares hasta el numero dado.
     */
    public static int addEvenNumbers(int number) {
        int suma = 0;
        int[] array = new int[number];

        //cargamos el array
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int j : array) {
            if (j % 2 == 0) {
                suma += j;

            }
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(addEvenNumbers(10));
    }


}
