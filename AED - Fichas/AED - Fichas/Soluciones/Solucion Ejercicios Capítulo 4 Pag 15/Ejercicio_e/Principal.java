/**
 * Enunciado: Ingresar  por  teclado los cuatro últimos sueldos 
 * de un empleado de un comercio. Determine el mayor de ellos, 
 * y si supera los 700 pesos, calcule un descuento del dos por 
 * ciento y muestre  el monto del descuento.
 * 
 * @author Ing. Valerio Frittelli
 * @version Abril de 2010
 */
public class Principal
{
    private static float s1, s2, s3, s4; 
    private static float may, desc;
    
    public static void main( String args[] )
    {
        // carga de datos...
        System.out.print( "Sueldo 1: " );
        s1 = ( float ) Consola.readDouble();
        System.out.print( "Sueldo 2: " );
        s2 = ( float ) Consola.readDouble();
        System.out.print( "Sueldo 3: " );
        s3 = ( float ) Consola.readDouble();
        System.out.print( "Sueldo 4: " );
        s4 = ( float ) Consola.readDouble();
        
        // procesos...
        mayor();
        descuento();        
    }
    
    public static void mayor()
    {
        if( s1 > s2 && s1 > s3 && s1 > s4 ) may = s1;
        else 
        {
            if( s2 > s3 && s2 > s4 ) may = s2;
            else
            {
                if( s3 > s4 ) may = s3;
                else may = s4;
            }
        }
        System.out.println( "\nSueldo mayor: " + may );
    }
    
    public static void descuento()
    {
        if( may > 700 )
        {
            desc = may * 0.02f;
            System.out.println( "\nDescuento del 2% sobre el mayor: " + desc );
        }
    }
}
