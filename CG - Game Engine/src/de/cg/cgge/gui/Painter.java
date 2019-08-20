package de.cg.cgge.gui;

import de.cg.cgge.ctrl.GameObject;
import de.cg.cgge.ctrl.ObjectManager;
import de.cg.cgge.ctrl.Var;

import javax.swing.*;
import java.awt.*;

public class Painter extends JPanel {

    private static final long serialVersionUID = 1L;

    @Override
   protected void paintComponent(Graphics g) {

       g.setColor(Color.BLACK);
       g.fillRect(0,0, Var.width, Var.height);

       //Drawing Stuff
        for (GameObject obj : ObjectManager.drawObjects) {
            if (obj.visible)
                obj.draw(g);
        }

   }


}
