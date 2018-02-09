package com.companybitmix;
import javax.swing.*;
        import java.awt.*;
public class Ventana extends JFrame{
    private JButton etiqueta1 = new JButton("1");
    private JButton etiqueta2 = new JButton("2");
    private JButton etiqueta3 = new JButton("3");
    private JButton etiqueta4 = new JButton("4");
    private JButton etiqueta5 = new JButton("5");
    private JButton etiqueta6 = new JButton("6");


    public Ventana(){
        super("ejemplo de border layout");
        setLayout(new BorderLayout());
        add(etiqueta1, BorderLayout.NORTH);
        add(etiqueta2, BorderLayout.CENTER);
        add(etiqueta3, BorderLayout.SOUTH);
        add(etiqueta4, BorderLayout.WEST);
        add(etiqueta5, BorderLayout.EAST);
    }

}
