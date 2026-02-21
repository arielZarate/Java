package desafios.convertirTextoenCapital;

public class Main {
    public static String toTitleCase(String texto) {

        boolean bandera = texto.startsWith("\"") && texto.endsWith("\"");

        if (bandera) {  //le quito las comillas para procesar el texto
            texto = texto.substring(1, texto.length() - 1);
        }



        String palabras[] = texto.split(" ");

        //reformatea cada palabra
        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty()) {
                palabras[i] = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1).toLowerCase();
            }
        }
        // Unir palabras de nuevo
        String resultado = String.join(" ", palabras);

        if (bandera) {
            return resultado = "\"" + resultado + "\"";
        }

        return resultado;
    }


    public static void main(String[] args) {
        System.out.println(toTitleCase("java es un lenguaje de programacion"));
        System.out.println(toTitleCase("\"python programming\""));
    }

}
