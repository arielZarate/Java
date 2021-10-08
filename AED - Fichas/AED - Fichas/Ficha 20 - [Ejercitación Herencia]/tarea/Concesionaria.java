/**
 * Representa la concesionaria de venta de automóviles.
 * 
 * @author Ing. Valerio Frittelli.
 * @version Agosto de 2008.
 */
public class Concesionaria
{
    private String nombre;
    private Carga c[]; 
    private Particular p[]; 
    private Motocicleta moto[];
    
   
    public Concesionaria()
    {
        nombre = "Vehiculos";
        
        c = new Carga[2];
        for(int i = 0; i < c.length; i++) c[i] = new Carga();
        
        p = new Particular[2];
        for(int i = 0; i < p.length; i++) p[i] = new Particular();
         moto=new Motocicleta[2];
        for(int i=0; i<moto.length; i++)
            moto[i]=new Motocicleta();
    }
    
  
    public Concesionaria(String nom, int n, int m,int o)
    {
        if (n <= 0) n = 5;
        if (m <= 0) m = 5;
        if (o <= 0) o=5;
        nombre = nom;
        c = new Carga[n];
        for(int i = 0; i < n; i++) c[i] = new Carga();
        moto=new Motocicleta[o];

        p = new Particular[m];
        for(int i = 0; i < m; i++) p[i] = new Particular();
        
        moto=new Motocicleta[o];
        for(int i=0; i<0; i++) moto[i]=new Motocicleta();
        
    }
    
    
    public int getCantidadCarga()
    {
        return c.length;   
    }
  
    public int getCantidadParticular()
    {
        return p.length;   
    }
    
    public int getCantidadMotocicletas()
    {
        return moto.length;
    }


    
   
    public void setCarga(Carga cg, int i)
    {
        if (cg != null && i >= 0  && i < c.length) c[i] = cg;   
    }
    
   
    public void setParticular(Particular pr, int i)
    {
        if (pr != null && i >= 0  && i < p.length) p[i] = pr;   
    }
    
    public void setMotocicleta(Motocicleta mo, int i)
    {
        if (mo!=null && i>=0 && i<moto.length)
            moto[i]=mo;
    }


   
    public void actualizarPreciosCarga()
    {
        for (int i = 0; i < c.length; i++) c[i].actualizarPrecio();   
    }
    
    
    public void actualizarPreciosParticular()
    {
        for (int i = 0; i < p.length; i++) p[i].actualizarPrecio();   
    }
    
  public void actualizarPreciosMotocicleta()
    {
        for(int i=0; i<moto.length; i++)
            moto[i].actualizarPrecio();
    }

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
         r+="\n\tMotocicletas: ";
        for(int i=0; i<moto.length; i++)
        {
            r+=(moto[i].toString()+"\n\t");
        }

        return r;
    }
    
}
