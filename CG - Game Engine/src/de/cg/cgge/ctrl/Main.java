package de.cg.cgge.ctrl;

import de.cg.cgge.gui.Gui;

public class Main {

    public static Gui gui;

    public static void main(String[] args) {
        gui = new Gui(Var.width, Var.height, Var.title, false);

        ObjectManager.initObjects();

        Game.loop(Var.framerate);

    }
}
