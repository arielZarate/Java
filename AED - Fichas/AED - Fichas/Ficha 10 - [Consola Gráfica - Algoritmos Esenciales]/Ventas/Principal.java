public class Principal
{
     public static void main (String args[])
     {
         Comercio com = new Comercio("Libreria Scotch");
         com.procesarVentas();
         System.out.println("\n\n***************************\n" + com);
     }
}
