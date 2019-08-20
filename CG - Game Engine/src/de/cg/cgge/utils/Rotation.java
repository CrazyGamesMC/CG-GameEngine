package de.cg.cgge.utils;

import java.awt.*;
import java.awt.Point;

import de.cg.cgge.ctrl.Main;
import de.cg.cgge.ctrl.MouseManager;

public class Rotation {

    public static int getRotationToMouse(int dpX, int dpY, int centerX, int centerY) {
        dpX += centerX;
        dpY += centerY;  
        int rotation = 0; 

        int mouse_x = MouseManager.getMouseX(); 
        int mouse_y = MouseManager.getMouseY(); 

        

        int dist_x = dpX - mouse_x;
        int dist_y = dpY - mouse_y;  

        rotation = (int) (Math.atan2(dist_y, dist_x)*180/Math.PI);

        return rotation; 
    }

}