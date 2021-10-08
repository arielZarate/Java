/**
 * Representa la concesionaria de venta de autom�viles, con un arreglo de 
 * referencias polim�rficas.
 * 
 * @author Ing. Valerio Frittelli.
 * @version Agosto de 2008.
 */
public class Concesionaria
{
    private String nombre;
    private Vehiculo v[];  // arreglo de referencias polim�rficas
    
    /**
     * Constructor por defecto. Crea un arreglo de tama�o dos, con referencias null.
     */
    public Concesionaria()
    {
        nombre = "ItalCar";
        v = new Vehiculo[2];
    }
    
    /**
     * Crea un arreglo de referencias polimorficas, dejando null en cada casilla. Si n es es cero 
     * o negativo, el tama�o se deja en cinco.
     * @param nom el nombre de la concesionaria.
     * @param n el tama�o del arreglo de veh�culos de carga. 
     */
    public Concesionaria(String nom, int n)
    {
        if (n <= 0) n = 5;
        nombre = nom;
        v = new Vehiculo[n];
    }
    
    /**
     * Retorna la cantidad de veh�culos que tiene la concesionaria.
     * @return un int con la cantidad de veh�culos.
     */
    public int getCantidad()
    {
        return v.length;   
    }

    /**
     * Recupera un veh�culo.
     * @param i la posici�n desde la que se recupera el veh�culo.
     * @return una referencia al Vehiculo recuperado, o null si la posici�n pedida no era v�lida o en esa
     *         casilla no hab�a un Vehiculo.
     */
    public Vehiculo getVehiculo( int i )
    {
        Vehiculo x = null;
        if ( i >= 0  && i < v.length ) x = v[i];   
        return x;
    }

    
    /**
     * Agrega un veh�culo a la concesionaria.
     * @param vh el veh�culo a agregar.
     * @param i la posici�n en la que se agrega el veh�culo.
     */
    public void setVehiculo(Vehiculo vh, int i)
    {
        if (vh != null && i >= 0  && i < v.length) v[i] = vh;   
    }

    /**
     * Actualiza los precios de todos los veh�culos.
     */
    public void actualizarPrecios()
    {
        for (int i = 0; i < v.length; i++)
        {
            if ( v[i] != null ) v[i].actualizarPrecio();   
        }
    }
    
    /**
     *  Busca un Vehiculo de Carga cuya capacidad de carga sea superior al par�metro car. Retorna
     *  el primer objeto que cumpla esa condici�n, sin importar si existen otros m�s adelante en 
     *  el vector. 
     *  @param car la capacidad de carga que se busca.
     *  @return una referencia al primer vehiculo de carga que supere la capacidad dada, o null si 
     *          no hay vehiculos de carga que superen esa capacidad.
     */
    public Vehiculo buscarVehiculoDeCarga (float car)
    {
        for ( int i = 0; i < v.length; i++ )
        {
            if ( v[i] != null && v[i] instanceof Carga)
            {
                Carga cg = (Carga) v[i];
                if ( cg.getTara() > car ) return v[i];   
            }
        }
        return null;
    }
    
    /**
     *  Determina cu�ntos veh�culos hay de la misma clase que el que viene como par�metro.
     *  @param vh una referencia al veh�culo usado para determinar cu�ntos hay de su misma clase.
     *  @return la cantidad de veh�culos del vector, de la misma clase que el tomado como par�metro. Si el 
     *          par�metro es null, se retornar� un cero.
     */
    public int conteo ( Vehiculo vh )
    {
        int c = 0;
        if ( vh != null )
        {
            for ( int i = 0; i < v.length; i++)
            {
                if ( vh.getClass() == v[i].getClass() ) c++;   
            }
        }
        return c;
    }
    
    /**
     * Retorna una cadena con todos los datos contenidos en el arreglo.
     * @return un String listo para ser visualizado.
     */
    public String toString()
    {
        String r = "Concesionaria: " + nombre + "\nVeh�culos:\n\t";
        for (int i = 0; i < v.length; i++)
        {
            if ( v[i] != null ) r += ( v[i].toString() + "\n\t" );   
        }
        return r;
    }
    
}
