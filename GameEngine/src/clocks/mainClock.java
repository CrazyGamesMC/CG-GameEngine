package clocks;

import draw.draw_main;
import game.GameObject;
import game.GlobalVar;
import gui.Gui;

import java.util.Timer;
import java.util.TimerTask;

public class mainClock {

    Timer timer;

    public mainClock(int delay) {

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                //Step events
                for (GameObject obj : GlobalVar.objects) {
                    obj.step();
                }

                try {
                    Gui.gcMain.clearRect(0,0,Gui.width,Gui.width);
                    Gui.dm.draw(Gui.gcMain) ;

                } catch (Exception e) {

                    System.out.println("[<---ERROR--->] In 'mainClock.java' cant clear screen (In timer scheduler.)");
                }


            }
        }, delay, delay);


    }


}
