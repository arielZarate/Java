public class Conversor
{
    private String binario; // la cadena con el binario a convertir
    private int decimal;    // el valor convertido a base 10
    
    public Conversor()
    {
        binario = "11001010";   
    }
    
    public Conversor(String bin)
    {
        binario = bin;   
    }
    
    public String getBinario()
    {
        return binario;   
    }
    
    public void setBinario(String bin)
    {
        binario = bin;   
    }
    
    public int getDecimal()
    {
        return decimal;   
    }

    public int convertir()
    {
        int n = binario.length();  // longitud de la cadena
        int i, bit, pot = 1;
        
        decimal = 0;
        for (i=n-1; i >= 0 ; i--)
        {
            char b = binario.charAt(i);
            if(b != '0' && b != '1') return -1; // cadena no válida

            if(b == '1') { bit = 1; }
            else { bit = 0; }
            
            decimal = decimal + bit * pot;
            pot = pot * 2;
        }
        return decimal;
    }
    
    public String toString()
    {
        String r = "La cadena no era binaria";
        if (convertir() != -1)
        {
           r = "Binario: " + binario;
           r += "\tDecimal: " + decimal;
        }
        return r;
    }
}
