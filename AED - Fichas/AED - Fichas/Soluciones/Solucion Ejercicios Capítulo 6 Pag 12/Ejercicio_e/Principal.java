/**
 * Enunciado: Desarrolle un programa que permita cargar por teclado las 
 * edades de un conjunto personas, una a una por doble lectura. Considere 
 * que la carga de datos termina cuando aparezca una edad negativa. 
 * Determine cuántas de esas edades eran menores a 18, cuántas eran mayores 
 * o iguales a 18 pero menores a 21, y cuántas eran mayores o iguales a 21. 
 * Determine también la edad promedio del grupo.
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */
public class Principal
{
    private static int edad, c1, c2, c3, t, suma, prom;
    
    public static void main( String args[] )
    {
        cargar();
        promediar();
        mostrar();
    }
    
    public static void cargar()
    {
        c1 = c2 = c3 = suma = 0;
        System.out.print( "Ingrese una de las edades (con negativo corta la carga): " );
        edad = Consola.readInt();
        while( edad >= 0 )
        {
            suma += edad;
            if( edad >= 21 ) c1++;
            else
            {
                if( edad >= 18 ) c2++;
                else c3++;
            }
            
            System.out.print( "Ingrese otra (con negativo corta la carga): " );
            edad = Consola.readInt();
        }
    }
    
    public static void promediar()
    {
        t = c1 + c2 + c3;
        if( t != 0 ) prom = suma / t;
        else prom = 0;   
    }
    
    public static void mostrar()
    {
        System.out.println( "Cantidad de personas con 21 años o más: " + c1 );
        System.out.println( "Cantidad de personas entre 18 y 21: " + c2 );   
        System.out.println( "Cantidad de personas con menos de 18: " + c3 );
        System.out.println( "Edad promedio del grupo: " + prom );
    }
}
