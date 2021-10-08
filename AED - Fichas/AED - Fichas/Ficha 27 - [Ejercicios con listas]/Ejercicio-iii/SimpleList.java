/**
 *  Una lista de Envios.
 *  @author  Ing. Valerio Frittelli.
 *  @version Septiembre de 2008.
 */
public class SimpleList
{
      private Node frente;
      
      /** 
       * Constructor por defecto
       */
      public SimpleList ()
      {
          frente = null;
      }

      /**
       * Retorna la dirección del primer nodo. Servirá para que desde una clase externa a la lista, se
       * pretenda "recorrer a mano" la lista...
       */
      public Node getFrente()
      {
            return frente;    
      }
      
      /**
       *  Inserta un nodo al principio de la lista.
       *  @param x el info del nodo a almacenar en la lista.
       */
      public void addFirst(Alumno x)
      {
           Node p = new Node(x, frente);
           frente = p;
      }  
      
      /**
       *  Remueve todos los elementos de la lista.
       */
      public void clear( )
      {
         frente = null; 
      }
      
      /**
       *  Determina si en la lista existe un elemento que coincida con x. 
       *  @return true si x está en la lista - false si x no está.
       *  @param x el objeto a buscar.
       */
      public boolean contains (Alumno x)
      {
          if (x == null) return false;
          Node p = frente;
          while ( p != null && x.getNumero() != p.getInfo().getNumero() )
          {
                p = p.getNext();    
          }
          return ( p != null ); 
      }
      
      /**
       *  Retorna (pero sin removerlo) el info del nodo ubicado al principio de la lista. 
       *  @return el info del primer elemento de la lista. Si la lista estaba vacía, retorna -1.
       */
      public Alumno getFirst()
      {
         Alumno x = null;
         if (frente != null) x = frente.getInfo();
         return x;
      }
      
      /**
       * Retorna true si la lista está vacía.
       * @return true si la lista está vacía - false en caso contrario.
       */
      public boolean isEmpty()
      {
         return (frente == null);    
      }

      /**
       *  Retorna (y remueve) el info del nodo ubicado al principio de la lista. 
       *  @return el primer elemento de la lista. Si la lista estaba vacía, retorna -1
       */
      public Alumno removeFirst()
      {
         Alumno x = null;
         if (frente != null) 
         {
             x = frente.getInfo();
             frente = frente.getNext();
         }
         return x;
      }
      
      /**
       *  Inserta un Alumno en forma ordenada en la lista. Se supone que la lista está ya ordenada 
       *  (es decir, se supone que todas las inserciones fueron realizadas llamando a este método). 
       *  @param x el valor a almacenar en la lista.
       */
      public void addInOrder(Alumno x)
      {
            if (x == null) return;
            Node nuevo = new Node( x, null );
            Node p = frente, q = null;
            while ( p != null && x.getNumero() >= p.getInfo().getNumero() )
            {
                q = p;
                p = p.getNext();
            }
            nuevo.setNext( p );
            if( q != null ) q.setNext( nuevo );
            else frente = nuevo;
      }  
      
      
      /**
       *  Inserta un valor al final de la lista. 
       *  @param x el valor a almacenar en la lista.
       */
      public void addLast(Alumno x)
      {
            if (x == null) return;
            Node nuevo = new Node( x, null );
            Node p = frente;
            while ( p != null && p.getNext() != null )
            {
                p = p.getNext();
            }
            if( p != null ) p.setNext( nuevo );
            else frente = nuevo;
      }  

 
      /**
       *  Retorna (pero sin removerlo) el valor ubicado al final de la lista. 
       *  @return el valor del último elemento de la lista, o -1 si la lista estaba vacía.
       */
      public Alumno getLast()
      {
         if (frente == null) return null; 
         Node p = frente;
         while( p.getNext() != null )
         {
            p = p.getNext();
         }
         return p.getInfo();
      }
      
      /**
       *  Retorna (y remueve) el valor ubicado al final de la lista. 
       *  @return el último elemento de la lista, o -1 si la lista estaba vacía.
       */
      public Alumno removeLast()
      {
         if (frente == null) return null;
         
         Node p = frente, q = null;
         while( p.getNext() != null )
         {
            q = p;
            p = p.getNext();
         }
         Alumno x = p.getInfo();
         if( q != null ) q.setNext( p.getNext() );
         else frente = p.getNext();
         return x;
      }

      /**
       * Busca un Alumno x en la lista, y en caso de encontrarlo retorna una referencia al que estaba en la lista.
       * Retorna null si x no está en la lista. 
       * @param x el Alumno a buscar.
       * @return una referencia al Alumno que coincide con x, o null si x no existe en la lista.
       */
      public Alumno search (Alumno x)
      {
            if (x == null) return null;
            Node p = frente;
            while ( p != null && x.getNumero() != p.getInfo().getNumero() )
            {
                p = p.getNext();   
            }
            if ( p != null )return p.getInfo();
            return null;
      }

      
      /**
       *  Redefine el método toString heredado desde Object.
       *  @return el contenido de la lista convertido a String.
       */
      public String toString()
      {
             Node p = frente;
             StringBuffer res = new StringBuffer("[ ");
             while( p != null )
             {
                res.append( p.toString() );
                if ( p.getNext() != null ) res.append( " \n " );
                p = p.getNext();
             }
             res.append( " ]" );
             return res.toString();
      }
}
