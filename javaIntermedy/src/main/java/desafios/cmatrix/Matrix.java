package desafios.cmatrix;

import java.util.Random;

public class Matrix{

public static void main(String[] args) throws InterruptedException{
    String letras = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int ancho = 80;
    int alto = 30;
    Random rand = new Random();

    while (true) {
        StringBuilder linea = new StringBuilder();
        for (int i = 0; i < ancho; i++) {
            if (rand.nextInt(100) < 10) {
                linea.append(letras.charAt(rand.nextInt(letras.length())));
            }else{
                linea.append(" ");
            }
        }

        System.out.println(linea);
        Thread.sleep(30); // Velocidad de caída
    }
}
}




