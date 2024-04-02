
package Vectores;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class vectores {
    
    
    
    public static void main(String[] args) {
        
        
        //definimos un vector
        int []v=new int [5];
        
        Scanner t=new Scanner(System.in);
        for (int i = 0; i < v.length; i++)
        {
         
            System.out.println("ingrese un valor del vector");
            int x=t.nextInt();
            
            v[i]=x;
            
            
        }
        
        
        System.out.println("se ha cargado el vector!!");
        
        for (int i = 0; i < v.length; i++)
        {
            System.out.println("en el indice "+ i + " esta el valor " + v[i]);
        }
        
        
    }
}
