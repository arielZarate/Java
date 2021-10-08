/**
 * Representa una cuenta bancaria como base de una jerarquía de clases.
 * 
 * @author Ing. Valerio Frittelli
 * @version Abril de 2004
 */
public class Cuenta
{
    private int numero;
    private float saldo;
    
    /**
     * Constructor por defecto o nulo. Al incluirlo, facilitamos el proceso de creación de instancias, como se verá 
     */
    public Cuenta()
    {
    }
    
    /**
     * Crea un objeto con el número tomado como parámetro, y con saldo igual a 1000
     */
    public Cuenta (int numero)
    {
        this(numero, 1000);   
    }

    /**
     * Constructor sobrecargado. Inicializa el numero de cuenta y el saldo de acuerdo a los parámetros
     */
    public Cuenta(int numero, float saldo)
    {
        this.numero = numero;
        this.saldo  = saldo;
    }
    
    /**
     *  Método de consulta para el número de cuenta
     *  @return el número de la cuenta
     */
    public int getNumero()
    {
       return numero;   
    }

    /**
     *  Método de consulta para el saldo de la cuenta
     *  @return el saldo de la cuenta
     */
    public float getSaldo()
    {
       return saldo;   
    }
    
    /**
     *  Método modificador para el número de cuenta
     *  @param num el nuevo número de la cuenta
     */
    public void setNumero( int numero )
    {
       this.numero = numero;   
    }

    /**
     *  Método modificador para el saldo de cuenta
     *  @param sal el nuevo saldo de la cuenta
     */
    public void setSaldo( float saldo )
    {
       this.saldo = saldo;   
    }

    /**
     *  Retiro de cierto monto del saldo de la cuenta. Se asume una operatoria muy general, pero las clases derivadas podrían necesitar
     *  modificar este algoritmo
     *  @param imp monto que será retirado de la cuenta
     */
    public void retirar (float imp)
    {
      if (this.saldo - imp >= 0)
      {
         this.saldo -= imp;   
      }
    }
    
    /**
     *  Depósito de cierto monto en la cuenta. Se asume una operaroria muy general, dejando que las clases derivadas puedan cambiar la
     *  forma de depositar
     *  @param imp monto que será depositado en la cuenta
     */
    public final void depositar (float imp)
    {
         this.saldo += imp;   
    }

    /** 
     *  Redefinición del método toString
     *  @return el contenido del objeto en forma String con formato adecuado para ser visualizado
     */
    /*
    public String toString()
    {
       return "Cuenta número: " + this.numero +  " - Saldo: " + this.saldo;
    }
    //*/
}