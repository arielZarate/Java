import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {

        MarcoCentrado mimarco= new MarcoCentrado();

        mimarco.setVisible(true);

        mimarco.setLocationRelativeTo(null);//centrar

        mimarco.setResizable(true);


       // mimarco.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.getDefaultCloseOperation();

    }
}


class MarcoCentrado extends JFrame {


    //constructor
    public MarcoCentrado() {

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.height;

        //setSize

        setSize(anchoPantalla / 2, alturaPantalla / 2);
        setLocation(anchoPantalla / 2, alturaPantalla / 2);
        //podemos reemplazar con
        //setBounds(x,y,z,w);

        setTitle("Marco Centrado");

        Image mIcon = miPantalla.getImage("icono.image");
        setIconImage(mIcon);


    }
}
