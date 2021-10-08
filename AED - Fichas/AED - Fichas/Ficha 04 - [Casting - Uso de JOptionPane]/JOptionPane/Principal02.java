import javax.swing.*;
public class Principal02
{
    public static void main (String args[])
    {
        // si la carga de datos falla, las dos variables quedan en cero
        int v1 = 0;
        float v2 = 0;
        
        // cargamos un valor entero en una cadena
        String cv1 = JOptionPane.showInputDialog(null, "Ingrese un valor entero: ");
        if (cv1 != null)
        {
             // convertimos la cadena a un int... si se puede!!
             v1 = Integer.parseInt(cv1);
        }

        // cargamos un valor float en una cadena
        String cv2 = JOptionPane.showInputDialog(null, "Ingrese un valor flotante: ");
        if (cv2 != null)
        {
             // convertimos la cadena a un float... si se puede!!
             v2 = Float.parseFloat(cv2);
        }

        System.out.println("Valor entero:   " + v1);
        System.out.println("Valor flotante: " + v2);

        System.exit(0);
    }
}
