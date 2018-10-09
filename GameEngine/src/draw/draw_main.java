package draw;

import game.GameObject;
import game.GlobalVar;
import game_objects.def_object;
import gui.Gui;
import gui.ImageLoader;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class draw_main {

    public void draw(GraphicsContext g) {
        g.setFill(Color.BLACK);
        g.fillRect(0,0,Gui.width, Gui.height) ;
        g.setFill(Color.WHITE);

        for (GameObject obj : GlobalVar.objects) {
            obj.draw(g);
        }



    }

}
