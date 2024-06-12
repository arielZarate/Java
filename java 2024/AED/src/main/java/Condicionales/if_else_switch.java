
package Condicionales;


import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class if_else_switch {
    
    
    public static void main(String[] args) {
        
        
       //CONSIGNA
       
       
       
        /*
       
       Una pequela despensa desea calcilar los sueldos de empleados . Los puestos de 
       los mismos pueden tener 3 categorias: -repositor , cajero y 3-supervisor.
       
       .Los repositores cobran $15.890 + un bono de 10%
       .Los cajeros cobran $25.630,89 fijos .
       .Los supervisores cobran $ 35.560,20 en bruto al cual sw les descuenta un 11%
       de jubilacion.
       
       Se necesita un programa que dependiendo del tipo de empleado del que se trate , calcule y muestre 
       en pamtalla el correspondiente sueldo.
       */
        
        
        
        //con if-else 
               
        double sueldo;
        int categoria;
        
        System.out.println("##########Programa empleados##########");
        
        System.out.println("ingrese el tipo de empleado:");
        System.out.println("1-Repositor");
        System.out.println("2-cajero");
        System.out.println("3-Supervisores");
 
        
        Scanner teclado=new Scanner(System.in);
        categoria=teclado.nextInt();
        
     
        
        //valifacion 
        
        if(categoria <1 || categoria >3)
        {
            System.out.println("Error ha ingresado mal el valor ");
            System.exit(0);
        }
   
          switch(categoria)
            {
              case 1: System.out.println("ha ingresado un valor correcto -Repositor-");
                  System.out.println("Sueldo de Repositor $15.890 + un bono de 10%");
                  sueldo=15.890 * (18.890 *0.10);
                  System.out.println("Sueldo calculado :" + sueldo); break;
                  
                  ///////////////////////////
               case 2: System.out.println("ha ingresado un valor correcto -Cajero-");
                  System.out.println("Sueldo de Cajero  $25.630,89 fijos ");
                  sueldo =25630.89 ;
                  System.out.println("Sueldo calculado :" + sueldo); break;
                  
                  
         
               case 3:  System.out.println("Ha ingresado un valor correcto - Supervisor -");
                System.out.println("Sueldo de Supervisor $35.560,20 - Descuento 11% de jubilación");
                sueldo = 35560.20 * 0.89; 
                System.out.println("Sueldo calculado: $" + sueldo);
                break;
                  
                default: System.out.println("Error no ha ingresado correctamenete verifique!!");
            }
            
       
        
        
    }
    
    
    
}
