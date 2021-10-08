/**
 * Una cola de valores int, usando un arreglo como soporte.
 * 
 * @author Ing. Valerio Frittelli. 
 * @version Octubre de 2008.
 */
public class Queue
{
    private Node frente;     // direcci�n del elemento que est� primero en la cola.
    private Node fondo;      // direcci�n del elemento que est� �tltimo en la cola.
    
    /**
     * Crea una cola con capacidad para hasta 10 valores.
     */
    public Queue()
    {
    }
    
    /**
     * Crea una cola vac�a. Constructor ya anacr�nico: el par�metro n ser� ignorado.
     * @deprecated
     * @param n la capacidad de la cola a crear (pero ser� ignorado...)
     */
    public Queue( int n )
    {
    }

    /**
     * Determina si la cola est� vac�a.
     * @return true si la cola no contiene ning�n elemento, o false en caso contrario.
     */
    public boolean empty()
    {
        return (frente == null);//esta la cola vacia
    }
    
    /**
     * Retorna una copia del primer elemento de la cola, sin removerlo de la misma. Si la
     * cola estaba vac�a, retorna el valor -1.
     * @returns una copia del valor ubicado al principio de la cola , o el valor -1 si la
     *          cola estaba vac�a.
     */
    public int peek ()
    {
        int r = -1;
        if ( !empty() ) r = frente.getInfo();
        return r;
    }
    
    /**
     * Remueve y retorna el primer elemento de la cola. Si la cola estaba vac�a, retorna 
     * el valor -1.
     * @returns el valor ubicado principio de la cola, o el valor -1 si la cola estaba 
     *          vac�a. El elemento se elimina de la cola.
     */
    public int remove ()
    {
          if ( empty() ) return -1;//si la lista esssta vacia retorne -1
        
          int x = frente.getInfo();//si hay algo guardar en x
          frente = frente.getNext();
          if(frente == null) fondo = null;//si frente es =null entonces fondo =null
          return x;
    }
    
    /**
     * Agrega el valor x en el fondo de la cola. 
     * @returns true si la operaci�n pudo hacerse. En la implementaci�n basada en listas, 
     *          el m�todo siempre retorna true...
     */
    public boolean add (int x)
    {
          Node nuevo = new Node(x, null);
          
          if ( empty() ) frente = nuevo;
          else fondo.setNext(nuevo);

          fondo = nuevo;
          return true;
    }
    
    /**
     * Retorna una representaci�n en forma de String del contenido de la cola. Redefine
     * al m�todo heredado desde Object.
     * @returns una representaci�n de la cola en forma de String.
     */
    public String toString()
    {
        StringBuffer r = new StringBuffer("Contenido de la Cola:\n[ ");
        for( Node p = frente; p != null; p = p.getNext() )
        {
            r.append( p.toString() );
            if ( p.getNext() != null ) r.append(" - ");
        }
        r.append(" ]");
        return r.toString();
    }
}