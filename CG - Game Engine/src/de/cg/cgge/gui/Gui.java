package de.cg.cgge.gui;

import de.cg.cgge.ctrl.KeyManager;
import de.cg.cgge.ctrl.MouseManager;

import javax.swing.*;

public class Gui {

    public JFrame frame;
    public JPanel drawer = new Painter();
    public int width = 0;
    public int height = 0;

    public Gui(int width, int height, String title, boolean resizable) {

        this.width = width;
        this.height = height;

        frame = new JFrame(title);
        frame.setBounds(100, 100, width, height);
        frame.setResizable(resizable);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.addKeyListener(new KeyManager());
        frame.addMouseListener(new MouseManager());

        drawer.setBounds(0,0,width,height);
        drawer.setFocusable(false);
        frame.add(drawer);


        frame.requestFocus();


    }

}
