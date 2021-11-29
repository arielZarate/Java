package Hashset;

public class Cliente {
    private long n_cuenta;
    private String nombre;
    private double saldo;


    public Cliente() {
    }

    public Cliente(long n_cuenta, String nombre, double saldo) {
        this.n_cuenta = n_cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public long getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(long n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    /**
     * metodos equals y hashcode Redefinido
     * @return
     */

    @Override
    public String toString() {
        return "Cliente{" +
                "n_cuenta=" + n_cuenta +
                ", nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return n_cuenta == cliente.n_cuenta;
    }

    @Override
    public int hashCode() {
        final int prime=31;
        int  result =1;
        result=prime * result + (int) n_cuenta;
        //return Objects.hash(ISBN);
        return result;

      //  return Objects.hash(n_cuenta);
    }
}
