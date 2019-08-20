package de.cg.cgge.objects;

import de.cg.cgge.ctrl.Dimension;
import de.cg.cgge.ctrl.GameObject;
import de.cg.cgge.ctrl.KeyManager;
import de.cg.cgge.ctrl.ObjectManager;
import de.cg.cgge.graphics.Sprite;
import de.cg.cgge.utils.Rotation;

import java.awt.*;

public class ObjPlaceholder extends GameObject {

    private int rotation = 90; 
    private Sprite sprite; 
    int rotater = 0; 

    public ObjPlaceholder(Dimension dim) {
        this.dim = dim;
        init();
        objectType="placeHolder";
        solid=true;

        sprite = new Sprite("sprites//sprite0_0.png", dim.width, dim.height, rotation);
        sprite.setCenter(20, 50);
        sprite.baseRotation = 90;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        sprite.draw(g, dim.x- ObjectManager.camera.dim.x, dim.y-ObjectManager.camera.dim.y);
    }

    @Override
    public void step() {
        rotater++; 
        int r = Rotation.getRotationToMouse(dim.x - ObjectManager.camera.dim.x, dim.y - ObjectManager.camera.dim.x, sprite.centerX, sprite.centerY);
        sprite.setRotation(r);
        if (KeyManager.KEY_Q) {
            destroy();
        }
    }



}
