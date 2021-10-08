public class Comercio
{
    private String nombre;
    private Venta venta;

    // recuerde que los atributos numéricos se inicializan en cero si 
    // los constructores de la clase no asignan valor alguno
    private int cp1, cp2, cp3, cp4;     // acumuladores del punto a
    private float im1, im2, im3, im4;   // acumuladores del punto b
    private float mimp;                 // mayor importe... punto c
    private float promedio;             // promedio...      punto d
    
    private boolean aviso;  // para capturar el primer dato al buscar el mayor
    
    public Comercio()
    {
        nombre = "Librería Real";
        venta = null;
    }
    
    public Comercio(String nom)
    {
        nombre = nom;
        venta = null;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;   
    }
    
    // este es el método fundamental del enunciado
    public void procesarVentas()
    {
        aviso = false;  // pasó la primera venta del vendedor 3???
        cp1 = cp2 = cp3 = cp4 = 0;
        im1 = im2 = im3 = im4 = 0;
        mimp = 0; // si no se carga ningúna venta del vendedor 3, mimp queda en cero
        System.out.println("Carga de Datos de Ventas - " + nombre);
        int cvd = cargarVendedor();
        while(cvd != 0)
        {
            System.out.print("Cantidad vendida: ");
            int cvn = Consola.readInt();
            System.out.print("Importe: ");
            float imp = (float)Consola.readDouble();
            
            venta = new Venta(cvd, cvn, imp);
            analizar();
            
            cvd = cargarVendedor();
        }
        promedio = promediarImportes();
    }
    
    public int cargarVendedor()
    {
        int cod;
        do
        {
            System.out.print("Código del vendedor (entre 1 y 4) (pero con cero termina): ");
            cod = Consola.readInt();
            if(cod > 4 || cod < 0)
            {
                System.out.println("El código debe ser entre 0 y 4");   
            }
        }
        while(cod > 4 || cod < 0);
        return cod;
    }
    
    public void analizar()
    {
        switch( venta.getVendedor() )
        {
            case 1: 
                    cp1 += venta.getCantidad();  // punto a
                    im1 += venta.getImporte();   // punto b
                    break;
            
            case 2:
                    cp2 += venta.getCantidad();  // punto a
                    im2 += venta.getImporte();   // punto b
                    break;
                    
            case 3:
                    cp3 += venta.getCantidad();  // punto a
                    im3 += venta.getImporte();   // punto b
                    mayorImporte();
                    break;
            
            case 4:
                    cp4 += venta.getCantidad();  // punto a
                    im4 += venta.getImporte();   // punto b
        }
    }
    
    public void mayorImporte()
    {
        if (aviso == false)
        {
            // todavía no pasó ninguna venta por acá... "aviso" todavia vale false!!!   
            aviso = true;
            mimp = venta.getImporte();
        }
        else
        {
            if(venta.getImporte() > mimp)
            {
                mimp = venta.getImporte();   
            }
        }
    }
    
    public float promediarImportes()
    {
        float t = im1 + im2 + im3 + im4;
        float p = t / 4; // promedio entre los 4 vendedores
        return p;
    }
    
    public String toString()
    {
        String r = "Resumen de Ventas - " + nombre;
        r += "\nCantidades por vendedor:\n" + "\tVendedor 1: " + cp1;
        r += "\tVendedor 2: " + cp2 + "\tVendedor 3: " + cp3 + "\tVendedor 4: " + cp4;
        
        r += "\nImportes por vendedor:\n" + "\tVendedor 1: " + im1;
        r += "\tVendedor 2: " + im2 + "\tVendedor 3: " + im3 + "\tVendedor 4: " + im4;
        
        r += "\nMayor importe vendedor 3: " + mimp;
        
        r += "\nImporte promedio de ventas por vendedor: " + promedio;
        return r;
    }
}