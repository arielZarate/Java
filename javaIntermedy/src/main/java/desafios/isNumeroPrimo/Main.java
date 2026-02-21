package desafios.isNumeroPrimo;

public class Main {

    public static String checkPrime(int num) {
        String result = "";
        if (num <= 1) {
            result = "It's not a prime number";
        }


        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = "It's not a prime number";
                return result;
            }else {
                result = "It's a prime number";
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(7));
        System.out.println(checkPrime(21));
        System.out.println(checkPrime(13));
        System.out.println(checkPrime(1));
        System.out.println(checkPrime(0));
        System.out.println(checkPrime(-5));
    }
}
