/**
 * Una clase que representa un lector de tarjetas, para contar las veces que cada tarjeta apareció.
 * Ahora el conteo se hace con una lista simple en lugar de un arreglo.
 * @author Ing. Valerio Frittelli 
 * @version Septiembre de 2008.
 */
public class Lector
{
    private SimpleList cf;  

	/**
	 * Constructor para objetos de la clase Lector. Este constructor es ya anacrónico, por lo
	 * cual se recomienda sólo usar el constructor por default 
	 * @deprecated
	 */
	public Lector(int tam)
	{
       this();
	}

	/**
	 * Constructor por defecto para objetos de la clase Lector.
	 */
	public Lector()
	{
        cf = new SimpleList(); 
	}

	/**
	 * Busca una Tarjeta en el lector. Si la encuentra, la cuenta. Si no la encuentra, la inserta con frecuencia = 1.
     * @param t la Tarjeta a buscar.
	 */
	public void agregar ( Tarjeta t )
	{
       agregar( t.getDni() );
	}

	/**
	 * Busca un dni en el interior del lector. Si lo encuentra, lo cuenta. Si no lo encuentra, lo inserta con frecuencia = 1.
     * @param  clave  el dni a buscar.
	 */
	public void agregar (int clave)
	{
        Contador pos = buscar( clave );
        if( pos != null )
        {
           pos.contar();
        }
        else
        {
           cf.addFirst( new Contador( clave ) );
        }
	}

	/**
	 * Método para sobrecargar toString (heredado desde Object)
     * @return  un resumen del contenido del lector, como cadena.
	 */
	public String toString()
	{
       return cf.toString();
	}

    
    //////////////////////////////////////////////////////////////////////////////////////////
    // Métodos privados...
    //////////////////////////////////////////////////////////////////////////////////////////
    /**
	 * Busca una clave en el lector. Si la encuentra, retorna una referencia al objeto Contador que la 
	 * contenía, y si no la encuentra, retorna null.
     * @param  clave  el valor a buscar.
	 * @return una referencia al objeto Contador con esa clave, o null si no estaba.
	 */
	private Contador buscar( int clave )
	{
       return cf.search( new Contador(clave) );
	}

	/**
	 * Busca una tarjeta en el vector. 
     * @param  t  la Tarjeta a buscar.
	 * @return una referencia al objeto Contador que contiene a esa Tarjeta, o null si no la encuentra.
	 */
	private Contador buscar( Tarjeta t )
	{
        return cf.search( new Contador ( t.getDni() ) );
	}
}


