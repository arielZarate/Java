package PruebaHashing;

import java.util.*;

public class Hashing<K,V> implements Map<K,V> {

    private ArrayList<Map.Entry<K, V>> table ;


    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Map)) { return false; }

        Map<K, V> t = (Map<K, V>) obj;
        if(t.size() != this.size()) { return false; }

        try {
            Iterator<Map.Entry<K, V>> i = table.iterator();
            while (i.hasNext()) {
                Map.Entry<K, V> e = i.next();
                K key = e.getKey();
                V value = e.getValue();
                if (t.get(key) == null) {
                    return false;
                } else {
                    if (!value.equals(t.get(key))) {
                        return false;
                    }
                }
            }
        } catch (ClassCastException | NullPointerException e)
        {
            return false;
        }

        return true;
    }



    /**
     * siu modificamos el equals debemos redefinir el metodo hashCode
     * @return
     */

    public int hashCode(int k) {
        final int prime=31;
        int result =1;
        result=prime * result + k;
        //return Objects.hash(ISBN);
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(table);
    }

    /**
     * Devuelve el contenido de la tabla en forma de String. Sólo por razones de
     * didáctica, se hace referencia explícita en esa cadena al contenido de
     * cada una de las listas de desborde o buckets de la tabla.
     * @return una cadena con el contenido completo de la tabla.
     */
    @Override
    public String toString()
    {
        StringBuilder cad = new StringBuilder("");
        for(int i = 0; i < this.table.size(); i++)
        {
            cad.append("\nLista ").append(i).append(":\n\t").append(this.table.get(i).toString());
        }
        return cad.toString();
    }



    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
