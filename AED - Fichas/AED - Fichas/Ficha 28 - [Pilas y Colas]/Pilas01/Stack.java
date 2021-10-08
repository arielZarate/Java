/**
 * Una pila de valores char, usando un arreglo como soporte.
 * 
 * @author Ing. Valerio Frittelli. 
 * @version Octubre de 2008.
 */
public class Stack
{
    private char items[];   // el arreglo para almacenar los elementos.
    private int frente;     // el índice del elemento que está en la cima de la pila.
    
    /**
     * Crea una pila con capacidad para hasta 10 valores.
     */
    public Stack()
    {
        this (10);
    }
    
    /**
     * Crea una pila con capacidad para hasta n valores. 
     * @param n la capacidad de la pila a crear. Si este valor es negativo o cero, crea 
     *        una pila de capacidad 10.
     */
    public Stack( int n )
    {
        if ( n <= 0 ) n = 10;
        items = new char[n];
        frente = -1;
    }
    
    /**
     * Determina si la pila está vacía.
     * @return true si la pila no contiene ningún elemento, o false en caso contrario.
     */
    public boolean empty()
    {
        return ( frente == -1 );
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
        if ( !empty() ) r = items [ frente ];
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
            r = items [ frente ];
            frente--;
        }
        return r;
    }
    
    /**
     * Agrega el valor x en el tope de la pila, si la pila tenía lugar para hacerlo. 
     * @returns true si la operación pudo hacerse,  false en caso contrario.
     */
    public boolean push (char x)
    {
        boolean r = false;
        if ( frente < items.length - 1 )
        {
            frente++;
            items[ frente ] = x;   
            r = true;
        }
        return r;
    }
    
    /**
     * Retorna una representación en forma de String del contenido de la pila. Redefine
     * al método heredado desde Object.
     * @returns una representación de la pila en forma de String.
     */
    public String toString()
    {
        StringBuffer r = new StringBuffer("Contenido de la Pila:\n[ ");
        for(int i = frente; i >= 0; i--)
        {
            r.append( items[i] );
            if ( i != 0 ) r.append(" - ");
        }
        r.append(" ]");
        return r.toString();
    }
}