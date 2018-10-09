package gui;

import draw.draw_main;
import game.KeyInputs;
import game_objects.def_object;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Gui {

    public static int width = 1280, height = 720;
    public static GraphicsContext gcMain;
    public static String gameTitle = "GAME" ;

    public static draw_main dm ;


    public void init() {

        dm = new draw_main();

    }

    public void create (Stage stage, String title, int screen_width,int screen_height,boolean resizable) {

        height = screen_height;
        width = screen_width;

        Canvas canvasMain;
        StackPane root = new StackPane();
        int cWidth = width-10, cHeight = height-10;

        canvasMain = new Canvas(width,height);
        gcMain = canvasMain.getGraphicsContext2D();
        dm.draw(gcMain);

        root.getChildren().add(canvasMain);
        Scene scene = new Scene(root, cWidth, cHeight);

        gameTitle = title;
        stage.setTitle(gameTitle);
        stage.setScene(scene);
        stage.setResizable(resizable);
        stage.centerOnScreen();
        stage.show();


        //KEYBOARD EVENTS
        new KeyInputs(scene);












        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

            @Override
            public void handle(WindowEvent e) {
                Platform.exit();
                System.exit(0);
            }

        });


    }





}
