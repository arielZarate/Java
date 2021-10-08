/**
 * Un ejemplo sencillo de una clase final.
 * 
 * @author Ing. Valerio Frittelli.
 * @version Agosto de 2008.
 */
public final class Banco
{
    private Cuenta cuentas[];
    private String nombre;
    
    //*
    public String toString()
    {
        String r = "Cuentas:\n";
        for (int i = 0; i < cuentas.length; i++)
        {
            r = r + cuentas[i].toString() + "\n";
        }
        return r;
    }
    //*/
    
    /*
    public String toString()
    {
      	StringBuffer r = new StringBuffer("Cuentas: ");
      	for(int i=0; i<cuentas.length; i++)
      	{
        	r.append( cuentas[i].toString() );   
      	}
      	return r.toString();
    }
    //*/

}
