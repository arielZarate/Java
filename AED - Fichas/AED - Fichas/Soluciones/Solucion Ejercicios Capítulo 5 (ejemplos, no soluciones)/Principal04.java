import javax.swing.*;
public class Principal04
{
    public static void main (String args[])
    {
        // cargamos una cadena con el nombre de la persona
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        if(nombre == null) nombre = "Desconocido";

        String trabaja = "No";
        int resp = JOptionPane.showConfirmDialog(null, nombre + "... ¿trabaja?", "Encuesta laboral", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) trabaja = "Sí";
        
        String r = "Nombre: " + nombre + "  -  ¿Trabaja?: " + trabaja;
        JOptionPane.showMessageDialog(null, r, "Verifique los datos recibidos: ", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }
}