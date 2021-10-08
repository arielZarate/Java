public class  Cliente
{
   
   private int numero;
   private String nombre;
   private float saldo;

   public Cliente (int num, String nom, float sal)
   {
        numero = num;
        nombre = nom;
        saldo = sal;
   }

   public int getNumero()
   {
        return numero;
   }

   public void setNumero (int num)
   {
        numero = num;    
   }
    
   public String getNombre()
   {
        return nombre;
   }

   public void setNombre(String nom)
   {
        nombre = nom;
   }

   public float getSaldo()
   {
        return saldo;    
   }
   
   public void setSaldo(float sal)
   {
        saldo = sal;
   }

   public String toString()
   {
        return "Numero: " + numero + "\tNombre: " + nombre + "\tSaldo: " + saldo;
   }
}
