/**
 *  Primera versi�n de una clase para representar un nodo para una lista simple con objetos de la clase Contador.
 *  @author Ing. Valerio Frittelli
 *  @version Agosto de 2008
 */
public class Node
{
   private Contador info;
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
   public Node (Contador x, Node p)
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
   public Contador getInfo()
   {
     return info;
   }
   
   /**
    * Cambia el valor del info
    * @param p nuevo valor del info
    */
   public void setInfo(Contador p)
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

