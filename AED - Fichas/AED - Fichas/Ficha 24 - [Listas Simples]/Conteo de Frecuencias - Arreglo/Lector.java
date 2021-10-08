/**
 * Un vector de elementos de tipo Contador
 * @author Ing. Valerio Frittelli 
 * @version Agosto de 2008
 */
public class Lector
{
    private Contador cf[];  
	private int actual;    // cantidad de elementos actualmente ocupados

	/**
	 * Constructor para objetos de la clase Lector. Crea un vector de "tam" elementos
	 */
	public Lector(int tam)
	{
        cf = new Contador[tam];
        for(int i=0; i<tam; i++)
        {
           cf[i] = new Contador();
        }
		actual = 0;
	}

	/**
	 * Constructor por defecto para objetos de la clase Lector. Crea un vector de 10 Contadores
	 */
	public Lector()
	{
        // Se asumen no m�s de 10 claves como m�ximo.
        // Lo que hace es invocar al constructor con par�metros
        this(10); 
	}

	/**
	 * Busca un dni en el vector. Si lo encuentra, lo cuenta. Si no lo encuentra, lo inserta con frecuencia = 1.
	 * Si no hab�a m�s lugar en el arreglo, NO HACE NADA.
     * @param  clave  el dni a buscar.
	 */
	public void agregar (int clave)
	{
        int pos = buscar(clave);
        if(pos != -1)
        {
           cf[pos].contar();
        }
        else
        {
              if ( actual < cf.length )
              {
                 cf[actual].setDni(clave);
                 actual++;
              }
        }
	}

	/**
	 * Busca una Tarjeta en el vector. Si la encuentra, la cuenta. Si no la encuentra, la inserta con frecuencia = 1.
     * @param  t la Tarjeta a buscar.
	 */
	public void agregar (Tarjeta t)
	{
       agregar(t.getDni());
	}



	/**
	 * M�todo para sobrecargar toString (heredado desde Object)
     * @return  un resumen del contenido del vector, como cadena.
	 */
	public String toString()
	{
       int i;
       StringBuffer cadena = new StringBuffer("");
       for (i=0; i<actual; i++)
       {
           cadena.append( cf[i].toString() + "\n" );
       }
       return cadena.toString();
	}

    
    //////////////////////////////////////////////////////////////////////////////////////////
    // M�todos privados...
    //////////////////////////////////////////////////////////////////////////////////////////
    /**
	 * Busca un dni en el vector. Si lo encuentra, retorna su �ndice, y si no lo encuentra, retorna (-1).
     * @param  clave  el dni a buscar.
	 * @return el �ndice con la posici�n del dni, o (-1) si no lo encuentra.
	 */
	private int buscar(int clave)
	{
		int i;
        for (i=0; i<actual; i++)
        {
           if (clave == cf[i].getDni())
           {
              return i;
           }
        }
        return -1;
	}

	/**
	 * Busca una tarjeta en el vector. Si la encuentra, retorna su �ndice, y si no la encuentra, retorna (-1). Este m�todo 
	 * es una sobrecarga del m�todo buscar anterior. S�lo toma el dni de la Tarjeta que entra como par�metro, e invoca al
	 * otro m�todo
     * @param  t  la tarjeta a buscar.
	 * @return el �ndice con la posici�n de la Tarjeta, o (-1) si no la encuentra.
	 */
	private int buscar(Tarjeta t)
	{
        return buscar(t.getDni());
	}
}


