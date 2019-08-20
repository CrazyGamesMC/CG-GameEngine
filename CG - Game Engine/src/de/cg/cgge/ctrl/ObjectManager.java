package de.cg.cgge.ctrl;

import de.cg.cgge.objects.Camera;
import de.cg.cgge.objects.ObjExample;
import de.cg.cgge.objects.ObjPlaceholder;

import java.util.ArrayList;

public class ObjectManager {

    //Put your objects here
    public static GameObject example;
    public static GameObject camera;
    public static GameObject placeHolder;


    //This is the one, you should edit
    public static void initObjects() {

        example = new ObjExample(new Dimension(20, 20, 50, 50));
        camera = new Camera(new Dimension(0,0,0,0));
        placeHolder = new ObjPlaceholder(new Dimension(300, 120, 50, 50));

    }

    public static ArrayList<GameObject> objects = new ArrayList<>();
    public static ArrayList<GameObject> drawObjects = new ArrayList<>();
    public static ArrayList<GameObject> toAdd = new ArrayList<>();
    public static ArrayList<GameObject> toRemove = new ArrayList<>();
    public static ArrayList<GameObject> toAddDraw = new ArrayList<>();
    public static ArrayList<GameObject> toRemoveDraw = new ArrayList<>();

    public static long currentID;

    public static void addCycle() {
        for (GameObject obj : toAdd) {
            currentID++;

            obj.id = currentID;

            objects.add(obj);
        }

        toAdd.clear();
    }

    public static void addDrawCycle() {
        for (GameObject obj : toAddDraw) {

            drawObjects.add(obj);
        }

        toAddDraw.clear();
    }

    public static void removeCycle() {
        for (GameObject obj : toRemove) {
            objects.remove(obj);
        }

        toRemove.clear();
    }

    public static void removeDrawCycle() {
        for (GameObject obj : toRemoveDraw) {
            System.out.println("removeDrawCycle");
            drawObjects.remove(obj);
        }

        toRemoveDraw.clear();
    }

}


