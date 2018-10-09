package game_objects;

import game.Dimension;
import game.GameObject;
import javafx.scene.image.Image;

public class def_object2 extends GameObject {

    public def_object2(Dimension dimension) {
        this.dimension = dimension;
        init();
        setSprite(new Image("file:rsc/def_image.png"));
        setSolid(true);
    }

}
