package CadenaString;

public class MainCadenas {

    public static void main(String[] args) {

        String str="Hola Ariel";


        //UNA CADENA ES UN ARRAY DE CHAR , ES UNA CLASE NO UN DATO PRIMITIVO EN JAVA


        // Longitud de la cadena
        int longitud = str.length();
        System.out.println("Longitud: " + longitud);
        // Obtener el carácter en una posición específica
        char primerCaracter = str.charAt(0);
        System.out.println("Primer carácter: " + primerCaracter);
        // Concatenación
        String concatenada = str.concat(" Es un buen día.");
        System.out.println("Concatenada: " + concatenada);
        // Subcadena
        String subcadena = str.substring(5); //desde la posicion 5
        System.out.println("Subcadena: " + subcadena);
        // Reemplazo
        String reemplazada = str.replace("Ariel", "Mundo");
        System.out.println("Reemplazada: " + reemplazada);

    }
}
