/**
 * Representa la concesionaria de venta de automóviles.
 * 
 * @author Ing. Valerio Frittelli.
 * @version Agosto de 2008.
 */
public class Concesionaria
{
    private String nombre;
    private Carga c[];  // arreglo de vehículos de carga
    private Particular p[];  // arreglo de vehículos particulares
    
    /**
     * Constructor por defecto. Crea los dos arreglos de tamaño dos.
     */
    public Concesionaria()
    {
        nombre = "ItalCar";
        
        c = new Carga[2];
        for(int i = 0; i < c.length; i++) c[i] = new Carga();
        
        p = new Particular[2];
        for(int i = 0; i < p.length; i++) p[i] = new Particular();
    }
    
    /**
     * Crea un arreglo de vehículos de carga de n elementos, y uno de 
     * vehículos particulares de m elementos. Si uno de los dos parámetros
     * es cero o negativo, el tamaño se deja en cinco.
     * @param nom el nombre de la concesionaria.
     * @param n el tamaño del arreglo de vehículos de carga.
     * @param m el tamaño del arreglo de vehículos particulares.
     */
    public Concesionaria(String nom, int n, int m)
    {
        if (n <= 0) n = 5;
        if (m <= 0) m = 5;
        nombre = nom;
        c = new Carga[n];
        for(int i = 0; i < n; i++) c[i] = new Carga();
        
        p = new Particular[m];
        for(int i = 0; i < m; i++) p[i] = new Particular();
    }
    
    /**
     * Retorna la cantidad de vehículos de carga que tiene la concesionaria.
     * @return un int con la cantidad de vehículos de carga.
     */
    public int getCantidadCarga()
    {
        return c.length;   
    }
    
    /**
     * Retorna la cantidad de vehículos particulaes que tiene la concesionaria.
     * @return un int con la cantidad de vehículos particulares.
     */
    public int getCantidadParticular()
    {
        return p.length;   
    }

    
    /**
     * Agrega un vehículo de carga a la concesionaria.
     * @param cg el vehículo a agregar.
     * @param i la posición en la que se agrega el vehículo.
     */
    public void setCarga(Carga cg, int i)
    {
        if (cg != null && i >= 0  && i < c.length) c[i] = cg;   
    }
    
    /**
     * Agrega un vehículo particular a la concesionaria.
     * @param pr el vehículo a agregar.
     * @param i la posición en la que se agrega el vehículo.
     */
    public void setParticular(Particular pr, int i)
    {
        if (pr != null && i >= 0  && i < p.length) p[i] = pr;   
    }

    /**
     * Actualiza los precios de todos los vehículos de carga.
     */
    public void actualizarPreciosCarga()
    {
        for (int i = 0; i < c.length; i++) c[i].actualizarPrecio();   
    }
    
    /**
     * Actualiza los precios de todos los vehículos particulares.
     */
    public void actualizarPreciosParticular()
    {
        for (int i = 0; i < p.length; i++) p[i].actualizarPrecio();   
    }
    
    /**
     * Retorna una cadena con todos los datos contenidos en ambos arreglos.
     * @return un String listo para ser visualizado.
     */
    public String toString()
    {
        String r = "Concesionaria: " + nombre + "\nVehículos de carga:\n\t";
        for (int i = 0; i < c.length; i++)
        {
            r += (c[i].toString() + "\n\t");   
        }
        r += "\nVehículos particulares:\n\t";
        for (int i = 0; i < p.length; i++)
        {
            r += (p[i].toString() + "\n\t");   
        }
        return r;
    }
    
}
