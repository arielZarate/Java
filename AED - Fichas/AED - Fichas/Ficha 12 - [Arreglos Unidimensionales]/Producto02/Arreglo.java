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
        // Podria haber un if de validacion
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