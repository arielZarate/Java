package desafios.convertirMayenMinuscYvice;


/**
 * Devuelve una cadena con may y min intercambiadas
 * <p>
 * Usare la clase StringBuilder para construir la nueva cadena
 * Usare el metodo toCharArray() para convertir la cadena en un array de chars
 * Usare un bucle for para recorrer el array de chars
 * Usare el metodo Character.isUpperCase() para comprobar si un char es mayuscula
 * Usare el metodo Character.toLowerCase() para convertir un char a minuscula
 * Usare el metodo Character.toUpperCase() para convertir un char a mayuscula
 *
 * @return String con mayusculas y minusculas intercambiadas
 */

public class Main {

    public static String swapCase(String str) {
        StringBuilder swapped = new StringBuilder();

        char array[] = str.toCharArray();  //convierto en array de chars

        for (char c : array) {
            if (Character.isUpperCase(c)) {
                //lo paso a minuscula
                swapped.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                //lo paso a mayuscula
                swapped.append(Character.toUpperCase(c));
            } else {
                //si no es ni mayuscula ni minuscula, lo dejo igual
                swapped.append(c);
            }
        }

        return swapped.toString();

    }


    public static void main(String[] args) {
        String input = "Hello World!";
        String output = swapCase(input);
        System.out.println(output); // hELLO wORLD!
    }

}
