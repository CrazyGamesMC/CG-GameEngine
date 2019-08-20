package de.cg.cgge.graphics;

import de.cg.cgge.ctrl.Var;

import java.awt.*;
import java.awt.image.BufferedImage;


public class LightControler {

    public LightControler(int brightnessLevel) {

    }

    public void drawLightLevel(Graphics g) {

        BufferedImage lightMap = new BufferedImage(Var.width, Var.height, BufferedImage.TYPE_INT_RGB);
        
        Graphics g2 = lightMap.getGraphics();

        double[] dArray = {1.0, 2.0, 3.0, 4.0};

        lightMap.getData().getPixel(1, 1, dArray);

        
    }
}
