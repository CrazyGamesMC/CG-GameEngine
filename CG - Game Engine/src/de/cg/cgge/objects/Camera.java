package de.cg.cgge.objects;

import de.cg.cgge.ctrl.Dimension;
import de.cg.cgge.ctrl.GameObject;
import de.cg.cgge.ctrl.ObjectManager;
import de.cg.cgge.ctrl.Var;

public class Camera extends GameObject {

    public Camera(Dimension dim) {
        this.dim = dim;
        init();
        objectType="camera";
    }

    @Override
    public void endStep() {

        Dimension o = ObjectManager.example.dim;
        int camspeed = 6;

        if (o.x-dim.x> Var.width-400) {
            dim.x+=camspeed;
        }

        if (o.y-dim.y> Var.height-300) {
            dim.y+=camspeed;
        }

        if (o.x-dim.x< 400) {
            dim.x-=camspeed;
        }

        if (o.y-dim.y< 300) {
            dim.y-=camspeed;
        }


    }

}
