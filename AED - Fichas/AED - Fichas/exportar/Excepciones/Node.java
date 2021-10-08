/**
 *  Primera versi�n de una clase para representar un nodo para una lista simple de n�meros enteros.
 *  @author Ing. Valerio Frittelli
 *  @version Agosto de 2008
 */
public class Node
{
   private Cliente info;
   private Node next;
   
   /**
    *  Constructor por defecto. 
    */
   public Node ( )
   {
   }
   
   /**
    *  Crea un nodo incializando todos los atributos en base a par�metros 
    */
   public Node (Cliente x, Node p)
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
   public Cliente getInfo()
   {
     return info;
   }
   
   /**
    * Cambia el valor del info
    * @param p nuevo valor del info
    */
   public void setInfo(Cliente p)
   {
     info = p;
   }

   /**
    * Convierte el contenido del nodo en String
    * @return el contenido del nodo convertido en String
    */
   public String toString()
   {
     return info.toString();   
   }
}

