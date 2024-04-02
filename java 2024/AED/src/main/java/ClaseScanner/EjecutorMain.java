
package ClaseScanner;

import java.util.Scanner;


public class EjecutorMain {
    
    
    public static void main(String[] args) {
        
      try{
      
             //importamos sccaner
      Scanner teclado=new Scanner(System.in);
        
      
        System.out.println("Ingrese un valor numerico\n");
      int entero=teclado.nextInt();
        
    
      
       teclado.nextLine();
        System.out.println("");
          System.out.println("ahora ingrese una cadena string");
          
          String cadena=teclado.nextLine();
      
     
          
           System.out.println("");
          System.out.println("ahora ingrese un valor con decimal");
          float decimal=teclado.nextFloat();
          
        System.out.println("****Los valores ingresados por consola Scanner son ***  "  );
        System.out.println("Entero:"  + entero );
       System.out.println("String:"  + cadena );
       System.out.println("Decimal:"  + decimal );
      }
      catch( Exception e) {
          
          System.out.println( "Ha ocurrido un error!!!  " + e.getMessage());
          e.printStackTrace();
      }
      
   
 
        
        
    }
}
