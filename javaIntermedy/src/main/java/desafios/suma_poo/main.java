package desafios.suma_poo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========PROGRAMA==========");
        System.out.println("Ingrese un valor: ");
        int num1 = scanner.nextInt();


        System.out.println("Ingrese otro valor: ");
        int num2 = scanner.nextInt();

        Suma sum = new Suma();  //creo el objeto
        sum.setNumero1(num1);
        sum.setNumero2(num2);

        //invoco el metodo sumarOperacion dentro del metodo imprimir
        sum.imprimirResultado(sum.sumarOperacion());

    }
}
