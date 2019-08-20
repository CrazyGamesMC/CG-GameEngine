package de.cg.cgge.ctrl;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Game {

    public static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void loop(int framerate) {

        scheduler.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                //STEP LOOP
                ObjectManager.removeCycle();
                ObjectManager.addCycle();

                for (GameObject obj : ObjectManager.objects) {
                    obj.step();
                }


                //END STEP LOOP
                for (GameObject obj : ObjectManager.objects) {
                    obj.endStep();
                }



            }
        }, 8, (int) (1000000/framerate), TimeUnit.MICROSECONDS);


        scheduler.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                
                //DRAW LOOP
                ObjectManager.addDrawCycle();
                ObjectManager.removeDrawCycle();
                Main.gui.drawer.validate();
                Main.gui.drawer.repaint();
        



            }
        }, 8, (int) (1000000/(framerate*2)), TimeUnit.MICROSECONDS);

        
    }



}
