public class Principal
{
    private static float a, b, men, may;
    
    public static void main (String args[])
    {
        System.out.print("Primer número: ");
        a = (float)Consola.readDouble();
        System.out.print("Segundo número: ");
        b = (float)Consola.readDouble();
        
        ordenar();
        Cuadrado cuad = new Cuadrado(may);
        Circulo  circ = new Circulo (men);
        
        System.out.println(cuad.toString());
        System.out.print(circ.toString());
    }
    
    public static void ordenar()
    {
        if ( a < b ) 
        { 
            may = a;
            men = b;
        }
        else  
        { 
            may = b;
            men = a;
        }
    }
}
