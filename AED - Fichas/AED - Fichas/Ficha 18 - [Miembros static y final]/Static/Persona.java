class  Persona
{
   private String nombre;
   private int edad;

   // el contador de instancias de la clase
   private static int contador = 0;


   public Persona(String nom, int ed)
   {
        nombre = nom;
        edad   = ed;
        contador++;
   }

   public static int getInstanceCounter()
   {
        //int x = edad + 1;  // no compila: edad es atributo de instancia
        //String n = getNombre(); // no compila: getNombre() es métodos de instancia.
        return contador;
   }

   public String getNombre()
   {
        return nombre;
   }

   public int getEdad()
   {
        return edad;
   }

   public void setNombre(String nom)
   {
        nombre = nom;
   }

   public void setEdad(int ed)
   {
        edad = ed;
   }

   public String toString()
   {
        return "\n\tNombre: " + nombre + "\tEdad: " + edad;
   }
}
