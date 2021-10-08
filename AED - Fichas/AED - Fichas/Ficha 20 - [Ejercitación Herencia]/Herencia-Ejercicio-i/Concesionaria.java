/**
 * Representa la concesionaria de venta de autom�viles.
 * 
 * @author Ing. Valerio Frittelli.
 * @version Agosto de 2008.
 */
public class Concesionaria
{
    private String nombre;
    private Carga c[];  // arreglo de veh�culos de carga
    private Particular p[];  // arreglo de veh�culos particulares
    
    /**
     * Constructor por defecto. Crea los dos arreglos de tama�o dos.
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
     * Crea un arreglo de veh�culos de carga de n elementos, y uno de 
     * veh�culos particulares de m elementos. Si uno de los dos par�metros
     * es cero o negativo, el tama�o se deja en cinco.
     * @param nom el nombre de la concesionaria.
     * @param n el tama�o del arreglo de veh�culos de carga.
     * @param m el tama�o del arreglo de veh�culos particulares.
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
     * Retorna la cantidad de veh�culos de carga que tiene la concesionaria.
     * @return un int con la cantidad de veh�culos de carga.
     */
    public int getCantidadCarga()
    {
        return c.length;   
    }
    
    /**
     * Retorna la cantidad de veh�culos particulaes que tiene la concesionaria.
     * @return un int con la cantidad de veh�culos particulares.
     */
    public int getCantidadParticular()
    {
        return p.length;   
    }

    
    /**
     * Agrega un veh�culo de carga a la concesionaria.
     * @param cg el veh�culo a agregar.
     * @param i la posici�n en la que se agrega el veh�culo.
     */
    public void setCarga(Carga cg, int i)
    {
        if (cg != null && i >= 0  && i < c.length) c[i] = cg;   
    }
    
    /**
     * Agrega un veh�culo particular a la concesionaria.
     * @param pr el veh�culo a agregar.
     * @param i la posici�n en la que se agrega el veh�culo.
     */
    public void setParticular(Particular pr, int i)
    {
        if (pr != null && i >= 0  && i < p.length) p[i] = pr;   
    }

    /**
     * Actualiza los precios de todos los veh�culos de carga.
     */
    public void actualizarPreciosCarga()
    {
        for (int i = 0; i < c.length; i++) c[i].actualizarPrecio();   
    }
    
    /**
     * Actualiza los precios de todos los veh�culos particulares.
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
        String r = "Concesionaria: " + nombre + "\nVeh�culos de carga:\n\t";
        for (int i = 0; i < c.length; i++)
        {
            r += (c[i].toString() + "\n\t");   
        }
        r += "\nVeh�culos particulares:\n\t";
        for (int i = 0; i < p.length; i++)
        {
            r += (p[i].toString() + "\n\t");   
        }
        return r;
    }
    
}
