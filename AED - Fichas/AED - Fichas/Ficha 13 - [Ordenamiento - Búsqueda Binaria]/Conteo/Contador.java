public class Contador
{
    private int v[];
    
    public Contador()
    {
       // supone 100 contadores, y ya quedan valiendo cero...
       v = new int[100];   
    }
    
    public Contador(int n)
    {
       //supone n contadores, y ya quedan valiendo cero...
       if (n <= 0) n = 5;
       v = new int[n];   
    }
    
    public int length()
    {
        return v.length;    
    }
    
    public int getComponent(int i)
    {
        return v[i];   
    }
    
    public void setComponent(int x, int i)
    {
        v[i] = x;   
    }

    public void contar()
    {
       System.out.print("Ingrese un valor (con –1 corta): ");
       int num = Consola.readInt();
       while ( num != -1 )
       {  
           if ( num >= 0 && num < v.length ) v[num]++;
           else 
           {
               System.out.println("Error. El número debe ser >= 0 y < " + v.length + "\n");
           }
           System.out.print("Otro valor: (con -1 corta): ");
           num = Consola.readInt();
       }
    }
    
    public String toString()
    {
        String r = "Listado de frecuencias:";
        for (int i = 0; i < v.length; i++)
        {
            // mostramos sólo aquellos que aparecieron alguna vez...
            if(v[i] != 0)
            {
                r = r + "\nNúmero: " + i;
                r = r + "\tCantidad de veces que entró: " + v[i];
            }
        }
        return r;
    }
}
