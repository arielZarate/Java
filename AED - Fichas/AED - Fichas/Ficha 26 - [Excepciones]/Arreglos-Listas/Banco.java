/**
 * Una clase para representar alguna operatoria con listas y arreglos,
 * simulando mínimamente un banco.
 * 
 * @author Ing. Valerio Frittelli.
 * @version Septiembre de 2008.
 */
public class Banco
{
    private Cliente vc [];
    private SimpleList lc;
    
    public Banco()
    {
        this(5);
    }
    
    public Banco(int n)
    {
        if ( n <= 0 ) n = 5;
        vc = new Cliente[n];
        lc = new SimpleList();
    }
    
    public int getCantidadClientes()
    {
        return vc.length;   
    }
    
    public void setCliente(int i, Cliente x)
    {
        if (x == null || i < 0 || i >= vc.length) return;
        vc[i] = x;
    }
    
    public Cliente getCliente(int i)
    {
        if (i < 0 || i >= vc.length) return null;
        return vc[i];
    }
    
    public void crearLista (float importe)
    {
        for (int i = 0; i < vc.length; i++)
        {
            if( vc[i].getSaldo() > importe )
            {
                lc.addFirst( vc[i] );   
            }
        }
    }
    
    public float saldoPromedio()
    {
        return lc.getSaldoPromedio();   
    }
    
    public String toString()
    {
        StringBuffer sb = new StringBuffer("Contenido del vector:\n");
        for(int i = 0; i < vc.length; i++)
        {
            if (vc[i] != null) { sb.append( vc[i].toString() + "\n" ); }
        }
        sb.append( "Contenido de la lista:\n" );
        sb.append( lc.toString() );
        return sb.toString();
    }
}
