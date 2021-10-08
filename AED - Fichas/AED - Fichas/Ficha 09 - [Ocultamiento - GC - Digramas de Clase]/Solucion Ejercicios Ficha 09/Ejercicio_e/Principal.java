/**
 * Enunciado: Un n�mero complejo tiene la forma c = a + b*i , donde a y b son 
 * n�meros reales, y el factor i es la unidad imaginaria, que se define como 
 * la ra�z cuadrada del n�mero (-1) aunque simb�licamente, un n�mero complejo 
 * simplemente puede representarse como c = (a , b*i) o incluso como el par 
 * ordenado c = (a, b) si se asume que el factor i va impl�cito. Se puede pensar 
 * entonces en una clase Complejo que use dos atributos para representar un n�mero 
 * complejo, guardando en uno de esos atributos el n�mero a (parte real), y en el 
 * otro el n�mero b (parte imaginaria). Formalmente, el factor i (unidad imaginaria) 
 * se asume impl�citamente en dicha representaci�n, como acompa�ando al n�mero b, y 
 * no es necesario almacenar ni representar al mismo en atributo alguno: cuando necesite 
 * mostrarlo, simplemente haga aparecer una i en la pantalla... Desarrollar un programa 
 * que implemente y pruebe m�todos diversos en esa clase, para realizar las siguientes 
 * operaciones b�sicas de n�meros complejos:
 *      1.)  Dar valores iniciales a los atributos de un complejo.
 *      2.)  Retornar una cadena con el n�mero completo adecuadamente representado.
 *      3.)  Volver a cero un complejo: (a, b) = (0, 0)
 *      4.)  Sumar dos complejos:  (a , b) + (c , d) = ( (a+c) , (b+d) )  
 *      5.)  Restar dos complejos:  (a , b) - (c , d) = ( (a-c) , (b-d) )
 *      6.)  Multiplicar:    (a , b) * (c , d) = ( (a*c - b*d) , (a*d + c*b) )
 *      7.)  Devolver la parte real del complejo.
 *      8.)  Devolver la parte imaginaria.
 *      9.)  Devolver el m�dulo: abs( (a,b) ) = sqrt ( a*a + b*b )
 *      10.) Devolver el conjugado del complejo: conjugado((a,b)) = (a,-b)
 * 
 * @author Ing. Valerio Frittelli
 * @version Mayo de 2010
 */

public class Principal
{   
    private static Complejo a, b;

    public static void main( String args[] )
    {
        a = new Complejo();
        b = new Complejo();
        
        int op;        
        do
        {
            System.out.println( "\nOpciones para manejo de N�meros Complejos" );
            System.out.println( "1. Cargar los n�meros complejos..." );
            System.out.println( "2. Mostrar los complejos..." );
            System.out.println( "3. Sumar..." );
            System.out.println( "4. Restar..." );
            System.out.println( "5. Multiplicar..." );
            System.out.println( "6. M�dulos..." );
            System.out.println( "7. Conjugados..." );
            
            System.out.println( "8. Salir..." );
            System.out.print( "\tIngrese opci�n: " );
            op = Consola.readInt();
            
            switch( op )
            {
                case 1: cargar();
                        break;
                        
                case 2: mostrar();
                        break;       
 
                case 3: sumar();
                        break;        
                        
                case 4: restar();
                        break;  
                
                case 5: multiplicar();
                        break;
                        
                case 6: modulos();
                        break;
                        
                case 7: conjugados();
                        break;
                        
                case 8: ;
            }
        }
        while( op != 8 );
    }
    
    
    public static void cargar()
    {
        System.out.print( "Parte real del complejo (a): " );
        float pra = ( float ) Consola.readDouble();
        a.setReal( pra );
        
        System.out.print( "Parte Imaginaria del complejo (a): " );
        float pia = ( float ) Consola.readDouble();
        a.setImaginaria( pia );
        
        System.out.print( "Parte real del complejo (b): " );
        float prb = ( float ) Consola.readDouble();
        b.setReal( prb );
        
        System.out.print( "Parte Imaginaria del complejo (b): " );
        float pib = ( float ) Consola.readDouble();
        b.setImaginaria( pib );
    }
    
    public static void mostrar()
    {
        System.out.println( "Complejo a: " + a );
        System.out.println( "Complejo b: " + b );
    }
    
    public static void sumar()
    {
        Complejo s = a.sumar( b );
        System.out.println( "La suma del complejo a = " + a + " y el complejo b = " + b + " es: " + s );
    }
    
    public static void restar()
    {
        Complejo r = a.restar( b );
        System.out.println( "La resta del complejo a = " + a + " menos el complejo b = " + b + " es: " + r );
    }
    
    public static void multiplicar()
    {
        Complejo m = a.multiplicar( b );
        System.out.println( "El producto del complejo a = " + a + " con el complejo b = " + b + " es: " + m );
    }
    
    public static void modulos()
    {
        System.out.println( "El m�dulo del complejo a = " + a + " es: " + a.modulo() );
        System.out.println( "El m�dulo del complejo b = " + b + " es: " + b.modulo() );
    }
    
    public static void conjugados()
    {
        Complejo ca = a.conjugado();
        Complejo cb = b.conjugado();
        System.out.println( "El conjugado del complejo a = " + a + " es: " + ca );
        System.out.println( "El conjugado del complejo b = " + b + " es: " + cb );        
    }
}
