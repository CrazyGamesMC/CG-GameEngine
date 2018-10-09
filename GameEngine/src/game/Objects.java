package game;

import game_objects.def_object;
import game_objects.def_object2;

public class Objects {

    //Init global objects here//
    public static GameObject  def;
    public static GameObject def2;

    public static void init() {
        def = new def_object(new Dimension(200,200,200,200));
        def2 = new def_object2(new Dimension(600,400,200,200));
    }

}
