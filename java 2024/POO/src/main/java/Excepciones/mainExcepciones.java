package Excepciones;

/*
En este ejemplo, el método dividir verifica si el denominador es cero.
Si es cero, se lanza una excepción ArithmeticException con un mensaje específico. 
Luego, en el método main, se llama a dividir dentro de un bloque try-catch. 
Si ocurre una excepción durante la división, el programa captura la excepción
y maneja el error adecuadamente imprimiendo un mensaje.

*/
public class mainExcepciones {

    
    //clase estatica
    public static double dividir(int numerador, int denominador) {
        if (denominador == 0)
        {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numerador / denominador;
    }

    
    //ahora la ejecuto
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;

        try
        {
            double resultado = dividir(numerador, denominador);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error Exception " +e.getMessage());
            e.printStackTrace();
        }
    }
}
