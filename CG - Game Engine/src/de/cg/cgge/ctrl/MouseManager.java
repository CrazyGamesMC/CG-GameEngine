package de.cg.cgge.ctrl;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseManager implements MouseListener {

    public static int getMouseX() {
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int mouse_x = (int) b.getX()-Main.gui.frame.getX()-7;
        return mouse_x; 
    };

    public static int getMouseY() {
        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int mouse_y = (int) b.getY()-Main.gui.frame.getY()-31;
        return mouse_y; 
    };

    @Override
    public void mouseClicked(MouseEvent e) {
        for (GameObject obj : ObjectManager.objects) {
            obj.mouseClick(e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (GameObject obj : ObjectManager.objects) {
            obj.mousePress(e);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        for (GameObject obj : ObjectManager.objects) {
            obj.mouseRelease(e);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
