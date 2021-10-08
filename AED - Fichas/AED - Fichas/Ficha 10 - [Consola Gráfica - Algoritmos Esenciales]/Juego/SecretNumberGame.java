public class SecretNumberGame
{
    private int n;       // el límite superior del intervalo del juego
    private int secreto; // el número secreto...
    
    public SecretNumberGame()
    {
        n = 50;   
        secreto = 0;
    }
    
    public SecretNumberGame (int lim)
    {
        n = lim;   
        secreto = 0;
    }
    
    public int getRightimit()
    {
        return n;   
    }
    
    public void setRightLimit(int lim)
    {
        n = lim;   
    }
    
    public int getRandom()
    {
        int x = (int)(100 * Math.random());
        return ( x % n ) + 1;
    }
    
    public void playGame()
    {
        int izq = 1, der = n;
        int contador = 0;
        boolean acierto = false;
        int num;
        
        secreto = getRandom();
        
        do
        {
             contador++;
             System.out.println("El número está entre " + izq + " y " + der + "\t- Intentos: " + contador);
             do
             {
                System.out.print("Ingrese: ");
                num = Consola.readInt();
                if(num < izq || num > der)
                {
                   System.out.println("Oiga... le dije entre " + izq + " y " + der + "...");
                }
             }
             while(num < izq || num > der);
            
             if(num == secreto)
             {
                acierto = true;
             }
             else
             {
                if(num > secreto)
                {
                   der = num;
                }
                else
                {
                   izq = num;
                }
             }
        }
        while(acierto == false && contador < 5);
        
        if(acierto == true)
        {
            System.out.println("\n\n\n\n\t\tGenio!!! Acertaste en " + contador + " intentos");
        }
        else
        {
            System.out.println("\n\n\n\n\t\tLo siento!!! Se te acabaron los intentos. El número era: " + secreto);
        }
    }
    
    public String toString()
    {
        return "Juego del número secreto - (último número secreto: " + secreto + ")";   
    }
}
