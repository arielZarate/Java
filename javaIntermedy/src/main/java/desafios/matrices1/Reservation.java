package desafios.matrices1;

import java.util.Arrays;

/**
 @author ariel
 @version 1.0
 @see "1. se solicita cargar 10 F y 10 C con libre"
      "2. los asientos libres estan con L y lo ocupados con X "
      "3. el asiento resrevado debe àsar automaticamnte a X y no puede ser modificado"
      "para finalizar debera ingresarm algun valor "
 * */

public class Reservation {

    private  String[][] reserve=null;

    public Reservation(int file, int col ){
        this.reserve =new String[file][col];

        for (int i = 0; i < reserve.length; i++) {
            Arrays.fill(reserve[i], "L");
        }
    }

    public String reserveSeat(int f, int c) {

        if (f-1 < 0 || f-1 >= reserve.length || c-1 < 0 || c-1 >= reserve[0].length) {
            return "Seat out of range";
        }

        if (reserve[f-1][c-1].equals("X")) {
            return "Seat already occupied, please select another seat";
        }

        reserve[f-1][c-1] = "X";
        return "The seat at row [" + f + "] and column [" + c + "] has been successfully reserved";
    }

    public String showReservation(){
    StringBuilder sb=new StringBuilder();

        for (int i = 0; i < this.reserve.length ; i++) {
            for (int j = 0; j < this.reserve[i].length; j++) {

              sb.append(" ").append(reserve[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
