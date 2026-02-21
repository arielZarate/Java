package desafios.numeroSastry;

/**
 * Crear una funcion para determinar si un numero es un numero de Sastry.
 * Un numero de Sastry es un numero que al concatenar el numero n con su siguiente
 * (n+1) y verificar si el resultado es un numero cuadrado perfecto.
 * Ejemplo: 183 es un numero de Sastry porque al concatenar 183 y 184 se obtiene 183184,
 * que es un numero cuadrado perfecto (428^2 = 183184).
 * La funcion debe retornar true si el numero es de Sastry y false en caso contrario.
 * Ejemplo de entrada y salida:
 * sastry(183) // true
 * sastry(184) // false
 * sastry(1) // true
 */
public class Main {

    public static boolean checkSastry(int n) {
        if (n < 0) return false;

        //debo concatenar n con n+1
        String concatenado = String.valueOf(n) + String.valueOf(n + 1);
        System.out.println("Numero concatenado: " + concatenado);
        //convertir a entero
        long numeroConcatenado = Long.parseLong(concatenado);

        //verificar si es un numero cuadrado perfecto

        String result = String.valueOf(Math.round(Math.sqrt(numeroConcatenado)));
        System.out.println("La Raiz cuadrada de : " + numeroConcatenado + " es: " + Math.round(Math.sqrt(numeroConcatenado)));

        double potencia = Math.pow(Double.parseDouble(result), 2);
        System.out.println("El cuadrado de " + result + " es: " + Math.round(potencia));
        return numeroConcatenado == potencia;


    }


    public static void main(String[] args) {
        System.out.println(checkSastry(183)); // true


    }
}
