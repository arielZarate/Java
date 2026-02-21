package desafios.reservaAsientos;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * construya un istema de resrva de asientos que realice una delas siguientes funciones:
 * - Obtiene le asiento no reservado con el numero mas pequeño , luego lo reserva y devuelve su numero
 * - cancela una resrva de asiento para seat[i]
 * <p>
 * El resultado debe ser una matriz que contenga los numeros de asientos reservados
 * <p>
 * Ejemplo 1:
 * Si seat[i]=0 , reserva el asiento 0 y devuelve 0
 * Si seat[i]>0, cancela la reserrva del asiento
 * Cada vez que reservamos un asiento se garantixa que haya un asiento libre
 * Cada vez que cancelamos una reserva se garantiza que el asiento estaba reservado
 * <p>
 * Funciton soluction
 * N : num de asientos
 * K : num de operaciones
 * asiento: representa el detalle de las operaciones
 */
public class Main {


    static int[] solution(int N, int K, int[] seat) {
        boolean[] reserved = new boolean[N+1]; // true si el asiento esta reservado, false si esta libre
        int nextAvailable = 1; // el siguiente asiento disponible mas pequeño
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            if (seat[i] == 0) {
                // Reservar el siguiente asiento disponible
                while (nextAvailable < N && reserved[nextAvailable]) {
                    nextAvailable++;
                }
                reserved[nextAvailable] = true;
                resultList.add(nextAvailable);

            } else {
                // Cancelar la reserva del asiento seat[i]-1
                int seatToCancel = seat[i];
                reserved[seatToCancel] = false;
                if (seatToCancel < nextAvailable) {
                    nextAvailable = seatToCancel;
                }

            }
        }
        // Convertir lista a array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }


    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//        int N = Integer.parseInt(br.readLine().trim());
//        int K = Integer.parseInt(br.readLine().trim());
//        String[] arr_seat = br.readLine().split(" ");
//        int[] seat = new int[K];
//        for (int i_seat = 0; i_seat < arr_seat.length; i_seat++) {
//            seat[i_seat] = Integer.parseInt(arr_seat[i_seat]);
//        }
//
//        int[] out_ = solution(N, K, seat);
//        System.out.print(out_[0]);
//        for (int i_out_ = 1; i_out_ < out_.length; i_out_++) {
//            System.out.print(" " + out_[i_out_]);
//        }
//
//        wr.close();
//        br.close();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine().trim());
//        int K = Integer.parseInt(br.readLine().trim());
//        String[] arr_seat = br.readLine().split(" ");


        System.out.println(Arrays.toString(solution(3, 3, new int[]{0, 0, 0}))); // Expected output: [0, 1, 0, 2]
    }
}



