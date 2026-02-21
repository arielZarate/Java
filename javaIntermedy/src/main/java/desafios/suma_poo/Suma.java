package desafios.suma_poo;

public class Suma {
    /**
     * estos valores solo se podran usar en la clase Suma son privados
     * y solos son accedidos por su interface
     **/
    private int numero1 = 0;
    private int numero2 = 0;

    public Suma(int num1, int num2) {
        this.numero1 = num1;  /** uso de this*/
        this.numero2 = num2;
    }

    public Suma() {

    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int sumarOperacion()
    {
        return numero1+numero2;
    }

    public void imprimirResultado(int suma) {

        System.out.println("El resultado es " + suma);
    }


}
