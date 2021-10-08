/**
 * Una pila de valores char, usando un arreglo como soporte.
 * 
 * @author Ing. Valerio Frittelli. 
 * @version Octubre de 2008.
 */
public class Stack
{
    private Node frente;    // La direcci�n del primer nodo de la lista usada como soporte.
    
    /**
     * Crea una pila vac�a (frente = null)
     */
    public Stack()
    {
    }
    
    /**
     * Crea una pila vac�a. Este constructor ya no tiene sentido, pues el tama�o de la pila 
     * ser� ignorado... 
     * @deprecated
     * @param n la capacidad de la pila a crear. Ser� ignorado, creando una pila vac�a
     */
    public Stack( int n )
    {
    }
    
    /**
     * Determina si la pila est� vac�a.
     * @return true si la pila no contiene ning�n elemento, o false en caso contrario.
     */
    public boolean empty()
    {
        return ( frente == null );
    }
    
    /**
     * Retorna una copia del primer elemento de la pila, sin removerlo de la misma. Si la
     * pila estaba vac�a, retorna el caracter nulo ('\u0000').
     * @returns una copia del valor ubicado en el tope de la pila, o el valor \u0000 si la
     *          pila estaba vac�a.
     */
    public char peek ()
    {
        char r = '\u0000';
        if ( !empty() ) r = frente.getInfo();
        return r;
    }
    
    /**
     * Remueve y retorna el primer elemento de la pila. Si la pila estaba vac�a, retorna 
     * el caracter nulo ('\u0000').
     * @returns el valor ubicado en el tope de la pila, o el valor \u0000 si la pila estaba 
     *          vac�a. El elemento se elimina de la pila.
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
     * @returns true si la operaci�n pudo hacerse. En rigor, no hay forma que retorne
     * otra cosa, pero se mantiene esta cabecera del m�todo por razones de compatibilidad
     * con la versi�n basada en arreglo.
     * @param x el valor a insertar en la pila.
     */
    public boolean push ( char x )
    {
        Node p = new Node(x, frente);
        frente = p;
        return true;
    }
    
    /**
     * Retorna una representaci�n en forma de String del contenido de la pila. Redefine
     * al m�todo heredado desde Object.
     * @returns una representaci�n de la pila en forma de String.
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