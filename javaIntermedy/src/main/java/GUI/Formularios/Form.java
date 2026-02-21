package GUI.Formularios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame implements ActionListener {

    //cmo extiendo del JFrame ya tengo un marco por defecto
    private JTextField texto;
    private JLabel label;
    private JButton boton;


    //constructor
    public Form() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//boton x para cerrar


        this.label = new JLabel("Mensaje");
        //x-y posicion  , width height tamaño
        label.setBounds(15, 10, 100, 30);
        add(label);

        this.texto = new JTextField();
        texto.setBounds(80, 16, 190, 30);
        add(texto);


        boton = new JButton();
        boton.setText("Mostrar");
        boton.setBounds(10, 60, 100, 30);
        add(boton);

        boton.addActionListener(this);


    }


    // esto es del action listener
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton) //si es el boton
        {
            String textoCapturado = texto.getText();

            JOptionPane.showMessageDialog(null, textoCapturado);
        }
    }
}
