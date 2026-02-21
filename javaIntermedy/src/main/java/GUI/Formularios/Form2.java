package GUI.Formularios;

import javax.swing.*;
import java.awt.*;

public class Form2 extends JFrame {

    private JButton btn;
    private JTextField txt;


    public Form2() {
        super("Formulario Simple");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Layout en 2 filas
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // espacio entre componentes

        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel lbl = new JLabel("Mensaje");
        add(lbl, gbc);


        this.txt = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = 0;
        add(txt,gbc);

        this.btn = new JButton("Mostrar");
        btn.setPreferredSize(new Dimension(100,30)); // tamaño definido
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2;
        add(btn, gbc);



        btn.addActionListener(b ->
                {
                    String texto = txt.getText();

                    JOptionPane.showMessageDialog(this, texto);
                }

        );


        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }


}
