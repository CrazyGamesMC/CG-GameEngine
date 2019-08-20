package de.cg.cgge.graphics;

import de.cg.cgge.ctrl.ObjectManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Sprite {

    public int height = 0, width = 0, rotation = 0, centerX = 0, centerY = 0, baseRotation = 0;
    private BufferedImage img = null;

    public Sprite(String path, int h, int w, int r) {
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.height = h; this.width = w; this.rotation = r;
    }

    public void setDimensions(int height, int width) {
        this.height = height; 
        this.width = width; 
    }

    public void setRotation(int rotation) {
        this.rotation = rotation; 
    }

    public void setCenter(int centerX, int centerY) {
        this.centerX = centerX; this.centerY = centerY;
    }

    public void draw(Graphics g, int x, int y) {
        if (rotation == 0) {
            g.drawImage((Image)img, x- ObjectManager.camera.dim.x, y-ObjectManager.camera.dim.y, width, height, null);
        } else {
            AffineTransform at = AffineTransform.getTranslateInstance(x, y); 
            at.rotate(Math.toRadians(rotation+baseRotation), centerX, centerY);
            Graphics2D g2d = (Graphics2D) g; 

            g2d.drawImage(img, at, null); 
        }
    }

}
