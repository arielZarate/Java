package desafios.ocultarNumerosTarjetaCredito;

/**
 *
    * Desafio: Ocultar los primeros 12 Números de una Tarjeta de Crédito
 * Ejemplo: 1234 5678 9012 3456 -> **** **** **** 3456
 * Reglas:
 * - La tarjeta de crédito siempre tendrá 16 dígitos. sino tiene  devuelve un mensaje de error "Invalid credit card number. It must be 16 digits long."
 * - El formato de repuesta debe ser  "**** **** **** 3456"
 * */

public class Main {

    public static String hiddenNumberCreditCard(String creditCardNumber) {
        // Tu código aquí
        if(creditCardNumber.length() != 16){
            return "Invalid credit card number. It must be 16 digits long.";
        }

        // en mi caso voy a recorer  el string  y con StringBuilder agrego los asteriscos un - y  los ultimos 4 numeros
        StringBuilder hiddenCard = new StringBuilder();
        for (int i = 0; i < creditCardNumber.length(); i++) {
            if(i < 12){
               if(i+1 == 4 || i+1 == 8 || i+1 == 12)
               {
                   hiddenCard.append("X-");
               }else{
                   hiddenCard.append("X");
               }
            } else {
                hiddenCard.append(creditCardNumber.charAt(i)); //los ultimos 4 numeros
            }
        }
        return hiddenCard.toString();
    }


    public static void main(String[] args) {
        System.out.println(hiddenNumberCreditCard("1324658798123456"));
    }

}
