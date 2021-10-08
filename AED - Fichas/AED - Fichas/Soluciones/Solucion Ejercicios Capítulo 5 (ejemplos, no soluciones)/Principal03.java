import javax.swing.*;
public class Principal03
{
    public static void main (String args[])
    {
        // cargamos una cadena con el nombre de la persona
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        if(nombre == null) nombre = "Desconocido";

        // cargamos una cadena con la edad
        int edad = 0;
        String cedad = JOptionPane.showInputDialog(null, "Ingrese su edad: ");
        if (cedad != null)
        {
             // convertimos la cadena a un int... si se puede!!
             edad = Integer.parseInt(cedad);
        }
        
        String r = "Nombre: " + nombre + "  -  Edad: " + edad;
        JOptionPane.showMessageDialog(null, r, "Verifique los datos recibidos: ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}