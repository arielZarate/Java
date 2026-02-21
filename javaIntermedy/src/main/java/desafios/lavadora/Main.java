package desafios.lavadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("****Ha iniciado el programa de lavarropas de sansung******");

        System.out.println("Ingrese el peso de la ropa para iniciar el lavado (>0 and <a7)");
        int peso = scanner.nextInt();

//        while (peso < 0 || peso > 7) {
//            System.out.println("Ingrese el peso de la ropa para iniciar el lavado (>0 and <a7)");
//            peso = scanner.nextInt();
//        }

        System.out.println("ingrese el Tipo de lavado entre 1y3====>\n");
        System.out.println("ingrese 1 para 'ALGODON'");
        System.out.println("ingrese 2 para 'POLIESTER'");
        System.out.println("ingrese 3 para 'LANA'");

        int op = scanner.nextInt();
        while (op<1||op>3){
            System.out.println("ingrese el Tipo de lavado entre 1y3====>\n");
            System.out.println("ingrese 1 para 'ALGODON'");
            System.out.println("ingrese 2 para 'POLIESTER'");
            System.out.println("ingrese 3 para 'LANA'");

            op=scanner.nextInt();
        }

        TipoRopa tipo = null;
        switch (op) {
            case 1:
                tipo = TipoRopa.ALGODON;
                break;
            case 2:
                tipo = TipoRopa.POLIESTER;
                break;
            case 3:
                tipo = TipoRopa.LANA;
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }

        System.out.println("ingrese tiempo de lavado ");
        int time=scanner.nextInt();

        Ropa ropa = new Ropa(peso, tipo);

         ropa.setLlenado();
        ropa.lavadoRopa(time);
       ropa.secado();

        System.out.println("Fin del programa!!");
    }
}
