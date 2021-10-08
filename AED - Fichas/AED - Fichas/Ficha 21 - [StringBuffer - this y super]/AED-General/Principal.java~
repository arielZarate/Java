/**
 * Clase para contener al método main y hacer pruebas sobre generalidades del lenguaje.
 * 
 * @author Ing. Valerio Frittelli
 * @version Agosto de 2008
 */
public class Principal
{
    public static void main(String args[])
    {
        // 1. Prueba del método toString(), sin redefinir en la clase Cuenta.
        System.out.println("**************** 1. Prueba de toString() SIN redefinirlo en la clase Cuenta");
        Cuenta a = new Cuenta(1, 1000);
        System.out.println("Datos de la cuenta: " + a.toString());
        
        // 2. Prueba del métodos de la clase Cuenta que usan this para acceder a sus atributos.
        System.out.println("**************** 2. Prueba de métodos definidos usando this");
        Cuenta b = new Cuenta(2, 2000);
        b.setNumero(20);
        b.setSaldo(3000);
        System.out.println("Datos de la cuenta: " + "\tNúmero: " + b.getNumero() + "\tSaldo: " + b.getSaldo());
    }
}
