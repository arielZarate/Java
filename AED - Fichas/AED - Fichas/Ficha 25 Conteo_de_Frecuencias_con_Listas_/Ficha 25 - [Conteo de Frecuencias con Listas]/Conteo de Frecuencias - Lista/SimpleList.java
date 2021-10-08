/**
 *  Una lista de objetos Contador, para usarse en el problema del conteo de frecuencias.
 *  @author  Ing. Valerio Frittelli.
 *  @version Agosto de 2008.
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
       *  Inserta un nodo al principio de la lista. No será insertado el nodo si el parámetro 
       *  enviado es null.
       *  @param x el info del nodo a almacenar en la lista.
       */
      public void addFirst(Contador x)
      {
           if ( x == null ) return;
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
       *  @param x el número a buscar.
       */
      public boolean contains (Contador x)
      {
          if ( x == null ) return false;
          Node p = frente;
          while ( p != null && x.getDni() != p.getInfo().getDni() )
          {
                p = p.getNext();    
          }
          return ( p != null ); 
      }
      
      /**
       *  Retorna (pero sin removerlo) el info del nodo ubicado al principio de la lista. 
       *  @return el info del primer elemento de la lista. Si la lista estaba vacía, retorna null.
       */
      public Contador getFirst()
      {
         Contador x = null;
         if ( frente != null ) x = frente.getInfo();
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
       *  @return el primer elemento de la lista. Si la lista estaba vacía, retorna null.
       */
      public Contador removeFirst()
      {
         Contador x = null;
         if (frente != null) 
         {
             x = frente.getInfo();
             frente = frente.getNext();
         }
         return x;
      }
      
      /**
       *  Inserta un objeto Contador en forma ordenada en la lista, por dni. Se supone que la 
       *  lista está ya ordenada (es decir, se supone que todas las inserciones fueron realizadas 
       *  llamando a este método). 
       *  @param x el objeto Contador a almacenar en la lista.
       */
      public void addInOrder(Contador x)
      {
            if ( x == null) return;
            Node nuevo = new Node( x, null );
            Node p = frente, q = null;
            while ( p != null && x.getDni() >= p.getInfo().getDni() )
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
      public void addLast(Contador x)
      {
            if ( x == null) return;
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
       *  @return el valor del último elemento de la lista, o null si la lista estaba vacía.
       */
      public Contador getLast()
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
       *  @return el último elemento de la lista, o null si la lista estaba vacía.
       */
      public Contador removeLast()
      {
         if (frente == null) return null;
         
         Node p = frente, q = null;
         while( p.getNext() != null )
         {
            q = p;
            p = p.getNext();
         }
         Contador x = p.getInfo();
         if( q != null ) q.setNext( p.getNext() );
         else frente = p.getNext();
         return x;
      }

      /**
       * Busca un objeto x de tipo Contador en la lista, y en caso de encontrarlo retorna una 
       * referencia al objeto Contador QUE ESTABA EN LA LISTA. Retorna null si x no está en 
       * la lista o si x era null. 
       * @param x el objeto a buscar.
       * @return una referencia al objeto que estaba en la lista, o null si x no existe o es null.
       */
      public Contador search (Contador x)
      {
            if ( x == null ) return null;
            Node p = frente;
            while ( p != null && x.getDni() != p.getInfo().getDni() )
            {
                p = p.getNext();   
            }
            if ( p != null ) return p.getInfo();
            return null;
      }

      
      /**
       *  Redefine el método toString heredado desde Object.
       *  @return el contenido de la lista convertido a String.
       */
      public String toString()
      {
             Node p = frente;
             StringBuffer res = new StringBuffer("[\n");
             while( p != null )
             {
                res.append( p.toString() + "\n");
                p = p.getNext();
             }
             res.append( " ]" );
             return res.toString();
      }
}
