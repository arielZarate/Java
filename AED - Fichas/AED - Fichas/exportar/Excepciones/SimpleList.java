/**
 *  Una lista de Clientes.
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
       *  Inserta un nodo al principio de la lista.
       *  @param x el info del nodo a almacenar en la lista.
       */
      public void addFirst(Cliente x)
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
      public boolean contains (Cliente x)
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
      public Cliente getFirst()
      {
         Cliente x = null;
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
      public Cliente removeFirst()
      {
         Cliente x = null;
         if (frente != null) 
         {
             x = frente.getInfo();
             frente = frente.getNext();
         }
         return x;
      }
      
      /**
       *  Inserta un número en forma ordenada en la lista. Se supone que la lista está ya ordenada 
       *  (es decir, se supone que todas las inserciones fueron realizadas llamando a este método). 
       *  @param x el valor a almacenar en la lista.
       */
      public void addInOrder(Cliente x)
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
      public void addLast(Cliente x)
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
      public Cliente getLast()
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
      public Cliente removeLast()
      {
         if (frente == null) return null;
         
         Node p = frente, q = null;
         while( p.getNext() != null )
         {
            q = p;
            p = p.getNext();
         }
         Cliente x = p.getInfo();
         if( q != null ) q.setNext( p.getNext() );
         else frente = p.getNext();
         return x;
      }

      /**
       * Busca un valor x en la lista, y en caso de encontrarlo retorna una referencia al nodo
       * que lo contiene. Retorna null si x no está en la lista. Hacer que el método retorne una
       * referencia a un Node no es demasiado sano, pues de alguna manera rompe el principio de 
       * ocultamiento (permite develar que la lista está formada por objetos Node), pero mantenemos
       * el método simplemente para trabajar sobre el algoritmo... Más adelante mostraremos una forma
       * más adecuada de formalizar la lista y este método en particular.
       * @param x el valor a buscar.
       * @return una referencia al nodo que contiene a x, o null si x no existe en la lista.
       */
      public Cliente search (Cliente x)
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
       * Calcula y retorna el saldo promedio entre todos los clientes de la lista...
       * No es lo más sano que este método esté aquí dentro, pero por ahora nos importa
       * sólo el algoritmo...
       * @return el saldo promedio.
       */
      public float getSaldoPromedio()
      {
            float ac = 0;
            int c = 0;
            Node p = frente;    
            while(p != null)
            {
                ac += p.getInfo().getSaldo();
                c++;
                p = p.getNext();
            }
            if(c != 0) return ac / c;
            return 0;
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
