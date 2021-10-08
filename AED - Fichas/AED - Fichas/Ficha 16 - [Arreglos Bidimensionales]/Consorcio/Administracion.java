public class Administracion
{
    private Consumo gastos[][];
    private String nombre;  // nombre del barrio
    
    public Administracion()
    {
        nombre = "Barrio El Sueño";
        
        // creamos la matriz, con todas las casillas null
        gastos = new Consumo[4][3];
        
        //llenamos la matriz con objetos inicializados por default
        for( int p = 0; p < gastos.length; p++)
        {
            for( int m = 0; m < gastos[p].length; m++)
            {
                gastos[p][m] = new Consumo();
            }
        }
    }
    
    public Administracion(String nom)
    {
        nombre = nom;
        
        // creamos la matriz, con todas las casillas null
        gastos = new Consumo[4][3];

        //llenamos la matriz con objetos inicializados por default
        for( int p = 0; p < gastos.length; p++)
        {
            for( int m = 0; m < gastos[p].length; m++)
            {
                gastos[p][m] = new Consumo();
            }
        }
    }
    
    public String getNombre()
    {
        return nombre;   
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;
    }
    
    public Consumo getGastos(int propiedad, int mes)
    {
        if (propiedad < 0 || propiedad > 3 || mes < 0 || mes > 2) return null;
        return gastos[propiedad][mes];
    }
    
    public void setGastos(Consumo g, int propiedad, int mes)
    {
        if (g == null || propiedad < 0 || propiedad > 3 || mes < 0 || mes > 2) return;
        gastos[propiedad][mes] = g;   
    }
    
    public void generarGastosAleatorios()
    {
        for( int p = 0; p < gastos.length; p++)
        {
            for( int m = 0; m < gastos[p].length; m++)
            {
                float e = (float)Math.random() * 100;
                float g = (float)Math.random() * 100;
                float a = (float)Math.random() * 100;
                gastos[p][m] = new Consumo( e, g, a );
            }
        }
    }
    
    public String toString()
    {
        String r = "Planilla de gastos: " + nombre;
        for( int p = 0; p < gastos.length; p++)
        {
            r += "\nPropiedad: " + p;
            for( int m = 0; m < gastos[p].length; m++)
            {
                r += "\n\tGastos del mes " + m + ": " + gastos[p][m].toString();
            }
        }
        return r;
    }
    
    public String toStringTotalPorPropiedad()
    {
        // obtiene la totalización por filas de la matriz
        String r = "Totales acumulados por propiedad en el trimestre";

        // si el ciclo que va por fuera es el de las filas, recorre por filas...
        for( int p = 0; p < gastos.length; p++)
        {
            float ac = 0;
            for( int m = 0; m < gastos[p].length; m++)
            {
                ac += gastos[p][m].getGastoElectricidad();
                ac += gastos[p][m].getGastoGas();
                ac += gastos[p][m].getGastoAgua();
            }
            r += "\nPropiedad: " + p;
            r += "\tGastos totales en el trimestre: " + ac;
        }
        return r;
    }
    
    public String toStringTotalPorMes()
    {
        // obtiene la totalización por columnas de la matriz
        String r = "Totales acumulados por mes entre todas las propiedades";

        // si el ciclo que va por fuera es el de las columnas, recorre por columnas...
        for( int m = 0; m < gastos[0].length; m++)
        {
            float ac = 0;
            for( int p = 0; p < gastos.length; p++)
            {
                // los índices no cambian: el primero es FILA, el segundo es COLUMNA
                ac += gastos[p][m].getGastoElectricidad();
                ac += gastos[p][m].getGastoGas();
                ac += gastos[p][m].getGastoAgua();
            }
            r += "\nMes: " + m;
            r += "\tGastos totales entre todas las propiedades: " + ac;
        }
        return r;
    }
}
