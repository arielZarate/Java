/**
 * Una pila de valores char, usando un arreglo como soporte.
 * 
 * @author Ing. Valerio Frittelli. 
 * @version Octubre de 2008.
 */
public class Stack
{
    private Node frente;    // La dirección del primer nodo de la lista usada como soporte.
    
    /**
     * Crea una pila vacía (frente = null)
     */
    public Stack()
    {
    }
    
    /**
     * Crea una pila vacía. Este constructor ya no tiene sentido, pues el tamaño de la pila 
     * será ignorado... 
     * @deprecated
     * @param n la capacidad de la pila a crear. Será ignorado, creando una pila vacía
     */
    public Stack( int n )
    {
    }
    
    /**
     * Determina si la pila está vacía.
     * @return true si la pila no contiene ningún elemento, o false en caso contrario.
     */
    public boolean empty()
    {
        return ( frente == null );
    }
    
    /**
     * Retorna una copia del primer elemento de la pila, sin removerlo de la misma. Si la
     * pila estaba vacía, retorna el caracter nulo ('\u0000').
     * @returns una copia del valor ubicado en el tope de la pila, o el valor \u0000 si la
     *          pila estaba vacía.
     */
    public char peek ()
    {
        char r = '\u0000';
        if ( !empty() ) r = frente.getInfo();
        return r;
    }
    
    /**
     * Remueve y retorna el primer elemento de la pila. Si la pila estaba vacía, retorna 
     * el caracter nulo ('\u0000').
     * @returns el valor ubicado en el tope de la pila, o el valor \u0000 si la pila estaba 
     *          vacía. El elemento se elimina de la pila.
     */
    public char pop ()
    {
        char r = '\u0000';
        if ( !empty() )
        {
            r = frente.getInfo();
            frente = frente.getNext();
        }
        return r;
    }
    
    /**
     * Agrega el valor x en el tope de la pila. 
     * @returns true si la operación pudo hacerse. En rigor, no hay forma que retorne
     * otra cosa, pero se mantiene esta cabecera del método por razones de compatibilidad
     * con la versión basada en arreglo.
     * @param x el valor a insertar en la pila.
     */
    public boolean push ( char x )
    {
        Node p = new Node(x, frente);
        frente = p;
        return true;
    }
    
    /**
     * Retorna una representación en forma de String del contenido de la pila. Redefine
     * al método heredado desde Object.
     * @returns una representación de la pila en forma de String.
     */
    public String toString()
    {
        StringBuffer r = new StringBuffer("Contenido de la Pila:\n[ ");
        for( Node p = frente; p != null; p = p.getNext() )
        {
            r.append( p.toString() );
            if ( p.getNext() != null ) r.append(" - ");
        }
        r.append(" ]");
        return r.toString();
    }
}