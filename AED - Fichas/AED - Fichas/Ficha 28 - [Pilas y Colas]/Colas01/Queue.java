/**
 * Una cola de valores int, usando un arreglo como soporte.
 * 
 * @author Ing. Valerio Frittelli. 
 * @version Octubre de 2008.
 */
public class Queue
{
    private int items[];    // el arreglo para almacenar los elementos.
    private int frente;     // el índice del elemento que está primero en la cola.
    private int fondo;      // el índice del elemento que está útltimo en la cola.
    private boolean vacia;  // el indicador de cola vacia (true) o no (false).
    
    /**
     * Crea una cola con capacidad para hasta 10 valores.
     */
    public Queue()
    {
        this (10);
    }
    
    /**
     * Crea una cola con capacidad para hasta n valores. 
     * @param n la capacidad de la cola a crear. Si este valor es negativo o cero, crea 
     *        una cola de capacidad 10.
     */
    public Queue( int n )
    {
        if ( n <= 0 ) n = 10;
        items = new int[n];
        frente = 0;  
        fondo = -1;  
        vacia = true;
    }

    /**
     * Determina si la cola está vacía.
     * @return true si la cola no contiene ningún elemento, o false en caso contrario.
     */
    public boolean empty()
    {
        return vacia;
    }
    
    /**
     * Retorna una copia del primer elemento de la cola, sin removerlo de la misma. Si la
     * cola estaba vacía, retorna el valor -1.
     * @returns una copia del valor ubicado al principio de la cola , o el valor -1 si la
     *          cola estaba vacía.
     */
    public int peek ()
    {
        int r = -1;
        if ( !empty() ) r = items [ frente ];
        return r;
    }
    
    /**
     * Remueve y retorna el primer elemento de la cola. Si la cola estaba vacía, retorna 
     * el valor -1.
     * @returns el valor ubicado principio de la cola, o el valor -1 si la cola estaba 
     *          vacía. El elemento se elimina de la cola.
     */
    public int remove ()
    {
          if ( empty() ) return -1;
        
          int x = items[frente];
          if ( frente == fondo ) { frente = 0; fondo = -1; vacia = true; }
          else
          {
               if (frente == items.length - 1) frente = 0;
               else frente++;
          }
          return x;
    }
    
    /**
     * Agrega el valor x en el fondo de la cola, si la cola tenía lugar para hacerlo. 
     * @returns true si la operación pudo hacerse,  false en caso contrario.
     */
    public boolean add (int x)
    {
          int f;
          if (fondo == items.length - 1) f = 0;
          else f = fondo + 1;
        
          if (frente == f && empty() == false) return false;

          fondo = f;
          items[fondo] = x;
          vacia = false;
          
          return true;
    }
    
    /**
     * Retorna una representación en forma de String del contenido de la cola. Redefine
     * al método heredado desde Object.
     * @returns una representación de la cola en forma de String.
     */
    public String toString()
    {
        StringBuffer r = new StringBuffer("Contenido de la Cola:\n[ ");
        if ( !empty() )
        {
            int i, lim = items.length - 1;
            if ( frente <= fondo ) lim = fondo;
            
            for(i = frente; i <= lim; i++)
            {
                r.append( items[i] );
                if ( i != fondo ) r.append(" - ");
            }
            
            if ( frente > fondo)
            {
                // fondo dió la vuelta.. 
                // ... agregar los elementos que están adelante en el arreglo
                for ( i = 0; i <= fondo; i++)
                {
                    r.append( items[i] );
                    if ( i != fondo ) r.append(" - ");
                }
            }
        }
        r.append(" ]");
        return r.toString();
    }
}