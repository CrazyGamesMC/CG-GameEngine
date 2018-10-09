package game_objects;

import game.Dimension;
import game.GameObject;
import game.GlobalVar;
import game.KeyInput;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


//EXAMPLE FOR GAME OBJECT
public class def_object extends GameObject {

   public def_object (Dimension dim) {
       this.dimension = dim;
       setSprite(new Image("file:rsc//def_image.png"));
       init();
       setCollidable(false);
   }

   public void step() {
       //Control Template
       xspeed = 0; yspeed = 0; zspeed = 0;


       if (KeyInput.A && placeFree(-7,0))
           xspeed-=7;
       if (KeyInput.D && placeFree(7,0))
           xspeed+=7;
       if (KeyInput.W && placeFree(0,-7))
           yspeed-=7;
       if (KeyInput.S && placeFree(0,7))
           yspeed+=7;

       move();
   }

   public void draw(GraphicsContext g) {
       drawSelf(g);
   }


}
