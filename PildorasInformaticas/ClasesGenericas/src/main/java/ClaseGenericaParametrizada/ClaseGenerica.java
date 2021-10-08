package ClaseGenericaParametrizada;

import java.util.ArrayList;

/**
 * La clase recibe un tipo de clase Generica T
 * @param <T>
 */
public class ClaseGenerica <T> {
    /**
     * tipo Primitivo de tipo T
     */
    private T primero;

    public ClaseGenerica()
    {
        primero=null;
    }

    public ClaseGenerica(T primero) {
        this.primero = primero;
    }

    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T nuevoValor) {
        this.primero = nuevoValor;
    }


    /**
     * metodo generico donde el tipo hereda de una interfaz
     * @param a
     * @param <T>
     * @return
     */
    public <T extends  Comparable> T MenorElemento(ArrayList<T> a)
    {
        if(a==null || a.size()==0)
        {
            return null;
        }
        T menor=a.get(0);
        for (int i = 0; i <a.size() ; i++) {
        if(menor.compareTo(a.get(i))>0){
            menor=a.get(i);
        }
        }

        return menor;

    }


}
