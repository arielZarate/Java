package GUI.Formularios;

import javax.swing.*;

public class FormMain {
    public static void main(String[] args) {

//        Form f=new Form();
//        f.setBounds(0,0,300,150);
//        f.setVisible(true);
//        f.setLocationRelativeTo(null);



        SwingUtilities.invokeLater(()->{
            Form2 f2 = new Form2();
            f2.setVisible(true);
        });

    }
}
