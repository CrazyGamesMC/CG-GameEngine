package de.cg.cgge.objects;

import de.cg.cgge.ctrl.Dimension;
import de.cg.cgge.ctrl.GameObject;
import de.cg.cgge.ctrl.KeyManager;
import de.cg.cgge.ctrl.ObjectManager;
import de.cg.cgge.sound.Sound;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.concurrent.ThreadLocalRandom;

public class ObjExample extends GameObject {

    public ObjExample(Dimension d) {
        init();
        this.dim = d;
        objectType="example";

        Sound s = new Sound("sounds//FairytaleGoneBad.wav");
        s.play();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.fillRect(dim.x-ObjectManager.camera.dim.x,dim.y-ObjectManager.camera.dim.y,dim.width,dim.height);
    }

    double xspeed = 0;
    double yspeed = 0;

    @Override
    public void step() {

        xspeed = 0;
        yspeed = 0;


        if (KeyManager.KEY_A) {
            xspeed-=7;
        }
        if (KeyManager.KEY_D) {
            xspeed+=7;
        }
        if (KeyManager.KEY_W) {
            yspeed-=7;
        }
        if (KeyManager.KEY_S) {
            yspeed+=7;
        }
        

        dim.x+=xspeed;
        dim.y+=yspeed;

        for (GameObject other : ObjectManager.objects) {
            if (other.solid && checkCollision(other.dim)) {
                dim.x-=xspeed;
                dim.y-=yspeed;
            }
         }


    }

    @Override
    public void endStep() {

    }

    @Override
    public void mousePress(MouseEvent e) {
        if (checkCollision(new Dimension(e.getX()+ObjectManager.camera.dim.x, e.getY()+ObjectManager.camera.dim.y, 1, 1))) {
            dim.x = ThreadLocalRandom.current().nextInt(20, 1200);
            dim.y = ThreadLocalRandom.current().nextInt(20, 640);

        }
    }

}
