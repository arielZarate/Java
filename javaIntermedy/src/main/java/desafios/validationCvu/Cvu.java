package desafios.validationCvu;

public class Cvu{


public boolean isInternalCvu(String cvu){
    String walletId = "123";
    boolean status = false;
    if (cvu.isBlank() || cvu.length() != 22) {
        return status;
    }else if (cvu.substring(4, 7).equals(walletId)) {
        status = true;

    }
    return status;

}


public static void main(String[] args){
    Cvu cvuChecker = new Cvu();


    String cvu1 = "0000123000000000000011"; // debería dar true
    String cvu2 = "0000171300000000000031"; // false para walletId = "123"
    String cvu3 = "0000999900000000000000"; // fals

    System.out.println("CVU1 interno? " + cvuChecker.isInternalCvu(cvu1));
    System.out.println("CVU2 interno? " + cvuChecker.isInternalCvu(cvu2));
    System.out.println("CVU3 interno? " + cvuChecker.isInternalCvu(cvu3));


}
}
