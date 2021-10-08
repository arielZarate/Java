/**
 * Representa la concesionaria de venta de automóviles, con un arreglo de 
 * referencias polimórficas.
 * 
 * @author Ing. Valerio Frittelli.
 * @version Agosto de 2008.
 */
public class Concesionaria
{
    private String nombre;
    private Vehiculo v[];  // arreglo de referencias polimórficas
    
    /**
     * Constructor por defecto. Crea un arreglo de tamaño dos, con referencias null.
     */
    public Concesionaria()
    {
        nombre = "ItalCar";
        v = new Vehiculo[2];
    }
    
    /**
     * Crea un arreglo de referencias polimorficas, dejando null en cada casilla. Si n es es cero 
     * o negativo, el tamaño se deja en cinco.
     * @param nom el nombre de la concesionaria.
     * @param n el tamaño del arreglo de vehículos de carga. 
     */
    public Concesionaria(String nom, int n)
    {
        if (n <= 0) n = 5;
        nombre = nom;
        v = new Vehiculo[n];
    }
    
    /**
     * Retorna la cantidad de vehículos que tiene la concesionaria.
     * @return un int con la cantidad de vehículos.
     */
    public int getCantidad()
    {
        return v.length;   
    }

    /**
     * Recupera un vehículo.
     * @param i la posición desde la que se recupera el vehículo.
     * @return una referencia al Vehiculo recuperado, o null si la posición pedida no era válida o en esa
     *         casilla no había un Vehiculo.
     */
    public Vehiculo getVehiculo( int i )
    {
        Vehiculo x = null;
        if ( i >= 0  && i < v.length ) x = v[i];   
        return x;
    }

    
    /**
     * Agrega un vehículo a la concesionaria.
     * @param vh el vehículo a agregar.
     * @param i la posición en la que se agrega el vehículo.
     */
    public void setVehiculo(Vehiculo vh, int i)
    {
        if (vh != null && i >= 0  && i < v.length) v[i] = vh;   
    }

    /**
     * Actualiza los precios de todos los vehículos.
     */
    public void actualizarPrecios()
    {
        for (int i = 0; i < v.length; i++)
        {
            if ( v[i] != null ) v[i].actualizarPrecio();   
        }
    }
    
    /**
     *  Busca un Vehiculo de Carga cuya capacidad de carga sea superior al parámetro car. Retorna
     *  el primer objeto que cumpla esa condición, sin importar si existen otros más adelante en 
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
     *  Determina cuántos vehículos hay de la misma clase que el que viene como parámetro.
     *  @param vh una referencia al vehículo usado para determinar cuántos hay de su misma clase.
     *  @return la cantidad de vehículos del vector, de la misma clase que el tomado como parámetro. Si el 
     *          parámetro es null, se retornará un cero.
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
        String r = "Concesionaria: " + nombre + "\nVehículos:\n\t";
        for (int i = 0; i < v.length; i++)
        {
            if ( v[i] != null ) r += ( v[i].toString() + "\n\t" );   
        }
        return r;
    }
    
}
