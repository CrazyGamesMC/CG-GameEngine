package actions;


import clocks.mainClock;
import game.Dimension;
import game.GameObject;
import game.GlobalVar;
import game.Objects;
import game_objects.def_object;
import gui.Gui;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage ;


public class Main extends Application {

    Gui g = new Gui();

    @Override
    public void start(Stage primaryStage) throws Exception{


        System.out.println("Engine Initialised");
        g.init();
        g.create(primaryStage, "GAME", 1280, 720, false);

        Objects.init();

        new mainClock(30);

    }


    public static void main(String[] args) {

        launch(args);



    }



}
