package desafios.Matrices;

import desafios.matrices1.Reservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservation reservation = new Reservation(10, 10);

        int option;

        do {
            System.out.println("****** SYSTEM RESERVATION ******\n");
            System.out.println("To display reservations, enter 1");
            System.out.println("To reserve a seat, enter 2");
            System.out.println("Enter your option:");
            option = scanner.nextInt();

            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.println(reservation.showReservation());
                    break;
                case 2:
                    System.out.println("Enter the row(1-10): ");
                    int row = scanner.nextInt();
                    if(row==0 ){
                        System.out.println("should insert an number may 0");
                        break;
                    }
                    System.out.println("Enter the column(1-10): ");
                    int col = scanner.nextInt();
                    if(col==0 ){
                        System.out.println("should insert an number may 0");
                        break;
                    }
                    System.out.println("fila " +(row));
                    System.out.println("col " +(col));

                    System.out.println(reservation.reserveSeat(row,col));break;

                default:
                    System.out.println("You have entered an incorrect option");
            }

        } while (option != 0);

        System.out.println("The program is finalized");
        scanner.close();
    }
}
