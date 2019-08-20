package de.cg.cgge.ctrl;

import java.awt.*;
import java.awt.event.MouseEvent;

public abstract class GameObject {

    public Dimension dim = new Dimension(0,0,0,0);
    public long id = 0L;
    public String objectType = "";
    public boolean solid = false;
    public boolean visible = true;

    public  void draw(Graphics g) {

    }

    public  void step() {
        
    }

    public  void endStep() {

    }

    public  void mouseClick(MouseEvent e) {

    }

    public  void mousePress(MouseEvent e) {

    }

    public void mouseRelease(MouseEvent e) {

    }
    //
    protected void init() {
        ObjectManager.toAdd.add(this);
        ObjectManager.toAddDraw.add(this);
    }

    public void destroy() {
        ObjectManager.toRemove.add(this);
        ObjectManager.toRemoveDraw.add(this);
    }

    protected boolean checkCollision(Dimension o) {

        Rectangle r = new Rectangle(dim.x, dim.y, dim.width, dim.height);

        Rectangle r2 = new Rectangle(o.x,o.y,o.width,o.height);

        return (r.intersects(r2));

    }


}
