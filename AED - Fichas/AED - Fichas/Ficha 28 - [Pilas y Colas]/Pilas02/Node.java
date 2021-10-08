public class Node
{
   private char info;
   private Node next;
   
   /**
    *  Constructor por defecto. 
    */
   public Node ( )
   {
   }
   
   /**
    *  Crea un nodo inicializando todos los atributos en base a par�metros 
    */
   public Node (char x, Node p)
   {
     info = x;
     next = p;
   }
   
   /**
    *  Accede a la direcci�n del sucesor
    *  @return la direcci�n del nodo sucesor
    */
   public Node getNext()
   {
     return next;
   }
   
   /**
    * Cambia la direcci�n del sucesor
    * @param p direcci�n del nuevo sucesor
    */
   public void setNext(Node p)
   {
     next = p;
   }
   
   /**
    *  Accede al valor del info
    *  @return el valor del info
    */
   public char getInfo()
   {
     return info;
   }
   
   /**
    * Cambia el valor del info
    * @param p nuevo valor del info
    */
   public void setInfo(char p)
   {
     info = p;
   }

   /**
    * Convierte el contenido del nodo en String
    * @return el contenido del nodo convertido en String
    */
   public String toString()
   {
     return Character.toString(info);   
   }
}

