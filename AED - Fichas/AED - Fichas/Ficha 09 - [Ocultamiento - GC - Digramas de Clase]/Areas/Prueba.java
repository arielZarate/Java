
/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba
{
    public static void main(String[] args)
    {
        for (int i=1; i<=1000; i++)
            {
                Circulo a=new Circulo();
                a=null;
            }
        System.gc();   
        System.out.println("Terminado.....");
    }                
}    