import javax.swing.*;
public class Principal01
{
    public static void main (String args[])
    {
        String nombre;
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        if (nombre != null)
        {
             System.out.println("Hola " + nombre + "!!!!");  
        }
        else
        {
             System.out.println("Hola amigo... no cargaste tu nombre!!!");   
        }
        System.exit(0);
    }
}
