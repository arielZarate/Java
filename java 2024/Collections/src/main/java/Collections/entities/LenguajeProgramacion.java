
package Collections.entities;


import java.lang.reflect.Type;

public class LenguajeProgramacion implements Comparable<LenguajeProgramacion> {
    private String nombre;
    //private int popularidad; // Por ejemplo, un ranking de popularidad

    public LenguajeProgramacion(String nombre) {
        this.nombre = nombre;
       // this.popularidad = popularidad;
    }

    public String getNombre() {
        return nombre;
    }

    /*public int getPopularidad() {
        return popularidad;
    }
*/
    @Override
    public String toString() {
        return "Lenguaje: " + nombre ;
    }


    @Override
    public int compareTo(LenguajeProgramacion o) {
        return this.nombre.compareTo(o.nombre);
    }
}
