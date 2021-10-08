package ArrayListIterator;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String dameDatos() {
        return
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario
                ;
    }
}
