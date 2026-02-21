package desafios.PuedenVerConcierto;

import java.util.List;


/**
 * Si todos pueden ver el escenario devuelve "All people can see"
 * sino "Not all people can see"
 * <p>
 * Una persona solo pued ever el escenario si la otra persona delante de ella es mas baja
 **/
public class Main {

    public static String concertSeats(List<List<Integer>> seats) {


        for (int i = 1; i < seats.size(); i++) {
            for (int j = 0; j < seats.get(i).size(); j++) {
                // System.out.println(seats.get(i).get(j) + " - " + seats.get(i - 1).get(j));
                if (seats.get(i).get(j) < seats.get(i - 1).get(j)) {
                    return "Not all people can see";
                }
            }
        }
        return "All people can see";
    }

    public static void main(String[] args) {
        System.out.println(concertSeats(List.of(
                List.of(5, 3, 4, 1),
                List.of(2, 1, 3, 2),
                List.of(6, 5, 4, 3)
        ))); // "Not all people can see"

        System.out.println(concertSeats(List.of(
                List.of(1, 2, 3, 4),
                List.of(2, 3, 4, 5),
                List.of(3, 4, 5, 6)
        ))); // "All people can see"
    }
}
