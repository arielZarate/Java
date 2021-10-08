/**
 * Representa una Persona con datos básicos. Consideramos que una Persona tendrá un nombre y un número que indica su edad. 
 * @author   Ing. Valerio Frittelli.
 * @version  Agosto de 2008.
*/

class  Persona
{
   private String nombre;
   private int edad;

   /**
    * Crea un objeto con los valores de susu atributos tomados como parámetro.
    * @param nom  el nombre de la Persona.
    * @param ed  la edad de la Persona.
    */
   public Persona(String nom, int ed)
   {
        nombre = nom;
        edad   = ed;
   }

   /**
    * Retorna el nombre de la Persona representada.
    * @return un String con el nombre de la persona.
    */
   public String getNombre()
   {
        return nombre;
   }

   /**
    * Retorna la edad de la Persona representada.
    * @return un número entero con el valor de la edad de la persona.
    */
   public int getEdad()
   {
        return edad;
   }

   /**
    * Permite cambiar el nombre de la Persona.
    * @param nom el nuevo nombre.
    */
   public void setNombre(String nom)
   {
        nombre = nom;
   }

   /**
    * Permite cambiar la edad de la Persona.
    * @param ed la nueva edad.
    */
   public void setEdad(int ed)
   {
        edad = ed;
   }

   /**
    * Arma y retorna una cadena sencilla con el contenido del objeto, lista para ser visualizada si fuera necesario.
    * @return la representación como String del contenido del objeto.
    */
   public String toString()
   {
        return "\n\tNombre: " + nombre + "\tEdad: " + edad;
   }
}
