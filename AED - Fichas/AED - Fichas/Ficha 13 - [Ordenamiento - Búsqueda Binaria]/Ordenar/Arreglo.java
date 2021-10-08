public class Arreglo
{
    private int v[];
    
    public Arreglo()
    {
       v = new int[5];   
    }
    
    public Arreglo(int n)
    {
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
    
    public void multiplicar(int k)
    {
        int i;
        for (i = 0; i < v.length; i++)
        {
            v[i] = v[i] * k;
        }
    }
    
    public int buscar (int x)
    {
        for (int i = 0; i < v.length; i++)
        {
            if(v[i] == x) { return i; }   
        }
        return -1;
    }

    public int busquedaBinaria(int x)
    {
        int iz = 0;
        int de = v.length - 1;
        while (iz <= de)
        { 
            int c = (de + iz) / 2;
            if ( v[c] == x ) return c; 
            else 
            {
                if (x > v[c]) iz = c + 1;
                else  de = c - 1;
            }
        }
        return -1;
    }

    public void ordenar()
    {
        int i , j;
        int n = v.length;
        for (i = 0; i < n - 1; i++)
        {
             for (j = i + 1; j < n; j++)
             {
                 if (v[i] > v[j])
                 {
                     int aux = v[i];
                     v[i] = v[j];
                     v[j] = aux;
                 }
             }
        }
    }

    public String toString()
    {
        String r = "{ ";
        for (int i = 0; i < v.length; i++)
        {
            r = r + v[i];
            if (i != v.length - 1) { r = r + ", "; }
        }
        r = r + " }";
        return r;
    }
}
