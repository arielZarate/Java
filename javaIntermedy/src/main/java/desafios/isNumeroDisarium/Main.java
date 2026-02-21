package desafios.isNumeroDisarium;


/**
 * Escriba una funcion para comprobar su un num  es Disarium
 * Es aquel en que la suma de sus digitos potenciados con sus respetivas posiicones es igual al numero mismo
 **/

public class Main {

    public static String isDisarium(int number) {
        //si ingresa 175
        if (number < 0) {
            throw new IllegalArgumentException("El numero debe ser positivo");
        }

        String numeroACadena = String.valueOf(number);

        double suma = 0.0;
        for (int i = 0; i < numeroACadena.length(); i++) {

            System.out.println("sacando la raiz cuadrada de :" + numeroACadena.charAt(i) + " elevado al " + (i + 1));
            int digito = numeroACadena.charAt(i) - '0';
            suma += Math.round(Math.pow(digito, (i + 1)));
            System.out.println("el resultado es " + suma);
        }

        if (number == (int) suma) {
            return ("yes");
        }
        return ("Not");

    }

    public static void main(String[] args) {

        System.out.println( isDisarium(175));
        System.out.println( isDisarium(17));
    }
}
