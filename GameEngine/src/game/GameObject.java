package game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.awt.*;

public class GameObject {

    public double xspeed = 0.0;
    public double yspeed = 0.0;
    public double zspeed = 0.0;

    public Dimension dimension = new Dimension(0,0,0,0,0,0);

    public boolean checkForCollision(Dimension dim) {
        Rectangle rec1 = new Rectangle((int)dimension.x, (int)dimension.y, (int)dimension.width, (int)dimension.height);
        Rectangle rec2 = new Rectangle((int) dim.x, (int)dim.y, (int)dim.width, (int)dim.height);

        if (rec1.intersects(rec2) &&
                dimension.z >= dim.z && dimension.z<=dim.z+dim.depth)
            return true;

        return false;
    }

    public boolean checkForCollision(double x,double y,double w,double h) {
        Dimension dim = new Dimension(x,y,w,h);

        return checkForCollision(dim);
    }

    public boolean checkForCollision(double x,double y,double z,double w,double h,double d) {
        Dimension dim = new Dimension(x,y,z,w,h,d);

        return checkForCollision(dim);
    }

    private Image sprite = null;

    public boolean isCollidable() {
        return collidable;
    }

    public void setCollidable(boolean collidable) {
        this.collidable = collidable;
    }

    public boolean isSolid() {
        return solid;
    }

    public void setSolid(boolean solid) {
        this.solid = solid;
    }

    private boolean collidable = true;
    private boolean solid = false;

    public void move() {
        dimension.x += xspeed;
        dimension.y += yspeed;
        dimension.z += zspeed;
    }

    public void drawSelf(GraphicsContext g) {
        if (sprite != null) {
            g.drawImage(getSprite(),dimension.x, dimension.y, dimension.width, dimension.height);
        }
    }

    public Image getSprite() {
        return sprite;
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
    }

    public void draw(GraphicsContext g) {
        drawSelf(g);
    }

    public void step() {
        //Placeholder Method
    }

    public void init() {
        GlobalVar.objects.add(this);
    }

    public boolean placeFree(double xadd, double yadd) {
        Rectangle rectSelf = new Rectangle((int)dimension.x+(int)xadd, (int)dimension.y+(int)yadd,(int )dimension.width,(int)dimension.height);
        for (GameObject obj : GlobalVar.objects) {
            if (obj.isSolid() && obj.isCollidable()
                    && rectSelf.intersects(new Rectangle((int)obj.dimension.x, (int)obj.dimension.y,(int)obj.dimension.width,(int)obj.dimension.height)))
                return false;
        }

        return true;
    }


}
