/**
 *  Una lista genérica de valores int.
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
      public void addFirst(int x)
      {
           Node p = new Node(x, frente);
           frente = p;
      }  
      
      /**
       *  Remueve todos los elementos de la lista.
       */
      public void clear( )
      {
         frente = null; // ¿alguna duda?
      }
      
      /**
       *  Retorna (pero sin removerlo) el info del nodo ubicado al principio de la lista. 
       *  @return el info del primer elemento de la lista - Si la lista estaba vacía, retorna -1.
       */
      public int getFirst()
      {
         int x = -1;
         if (frente != null) x = frente.getInfo();
         return x;
      }
      
      /**
       *  Retorna (y remueve) el info del nodo ubicado al principio de la lista. 
       *  @return el primer elemento de la lista. Si la lista estaba vacía, retorna -1
       */
      public int removeFirst()
      {
         int x = -1;
         if (frente != null) 
         {
             x = frente.getInfo();
             frente = frente.getNext();
         }
         return x;
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
                if ( p.getNext() != null ) res.append( " - " );
                p = p.getNext();
             }
             res.append( " ]" );
             return res.toString();
      }
}
