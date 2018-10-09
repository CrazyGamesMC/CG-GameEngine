package game;

import actions.Main;
import game_objects.def_object;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class KeyInputs {

    public KeyInputs(Scene scene) {

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.A) {
                KeyInput.A = true;
            } else if (e.getCode() == KeyCode.B) {
                KeyInput.B = true;
            } else if (e.getCode() == KeyCode.C) {
                KeyInput.C = true;
            } else if (e.getCode() == KeyCode.D) {
                KeyInput.D = true;
            } else if (e.getCode() == KeyCode.E) {
                KeyInput.E = true;
            } else if (e.getCode() == KeyCode.F) {
                KeyInput.F = true;
            } else if (e.getCode() == KeyCode.G) {
                KeyInput.G = true;
            } else if (e.getCode() == KeyCode.H) {
                KeyInput.H = true;
            } else if (e.getCode() == KeyCode.I) {
                KeyInput.I = true;
            } else if (e.getCode() == KeyCode.J) {
                KeyInput.J = true;
            } else if (e.getCode() == KeyCode.K) {
                KeyInput.K = true;
            } else if (e.getCode() == KeyCode.L) {
                KeyInput.L = true;
            } else if (e.getCode() == KeyCode.M) {
                KeyInput.M = true;
            } else if (e.getCode() == KeyCode.N) {
                KeyInput.N = true;
            } else if (e.getCode() == KeyCode.O) {
                KeyInput.O = true;
            } else if (e.getCode() == KeyCode.P) {
                KeyInput.P = true;
            } else if (e.getCode() == KeyCode.Q) {
                KeyInput.Q = true;
            } else if (e.getCode() == KeyCode.R) {
                KeyInput.R = true;
            } else if (e.getCode() == KeyCode.S) {
                KeyInput.S = true;
            } else if (e.getCode() == KeyCode.T) {
                KeyInput.T = true;
            } else if (e.getCode() == KeyCode.U) {
                KeyInput.U = true;
            } else if (e.getCode() == KeyCode.V) {
                KeyInput.V = true;
            } else if (e.getCode() == KeyCode.W) {
                KeyInput.W = true;
            } else if (e.getCode() == KeyCode.X) {
                KeyInput.X = true;
            } else if (e.getCode() == KeyCode.Y) {
                KeyInput.Y = true;
            } else if (e.getCode() == KeyCode.Z) {
                KeyInput.Z = true;
            } else if (e.getCode() == KeyCode.SHIFT) {
                KeyInput.LSHIFT = true;
            } else if (e.getCode() == KeyCode.SPACE) {
                KeyInput.SPACE = true;
            }
        });

        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.A) {
                KeyInput.A = false;
            } else if (e.getCode() == KeyCode.B) {
                KeyInput.B = false;
            } else if (e.getCode() == KeyCode.C) {
                KeyInput.C = false;
            } else if (e.getCode() == KeyCode.D) {
                KeyInput.D = false;
            } else if (e.getCode() == KeyCode.E) {
                KeyInput.E = false;
            } else if (e.getCode() == KeyCode.F) {
                KeyInput.F = false;
            } else if (e.getCode() == KeyCode.G) {
                KeyInput.G = false;
            } else if (e.getCode() == KeyCode.H) {
                KeyInput.H = false;
            } else if (e.getCode() == KeyCode.I) {
                KeyInput.I = false;
            } else if (e.getCode() == KeyCode.J) {
                KeyInput.J = false;
            } else if (e.getCode() == KeyCode.K) {
                KeyInput.K = false;
            } else if (e.getCode() == KeyCode.L) {
                KeyInput.L = false;
            } else if (e.getCode() == KeyCode.M) {
                KeyInput.M = false;
            } else if (e.getCode() == KeyCode.N) {
                KeyInput.N = false;
            } else if (e.getCode() == KeyCode.O) {
                KeyInput.O = false;
            } else if (e.getCode() == KeyCode.P) {
                KeyInput.P = false;
            } else if (e.getCode() == KeyCode.Q) {
                KeyInput.Q = false;
            } else if (e.getCode() == KeyCode.R) {
                KeyInput.R = false;
            } else if (e.getCode() == KeyCode.S) {
                KeyInput.S = false;
            } else if (e.getCode() == KeyCode.T) {
                KeyInput.T = false;
            } else if (e.getCode() == KeyCode.U) {
                KeyInput.U = false;
            } else if (e.getCode() == KeyCode.V) {
                KeyInput.V = false;
            } else if (e.getCode() == KeyCode.W) {
                KeyInput.W = false;
            } else if (e.getCode() == KeyCode.X) {
                KeyInput.X = false;
            } else if (e.getCode() == KeyCode.Y) {
                KeyInput.Y = false;
            } else if (e.getCode() == KeyCode.Z) {
                KeyInput.Z = false;
            } else if (e.getCode() == KeyCode.SHIFT) {
                KeyInput.LSHIFT = false;
            } else if (e.getCode() == KeyCode.SPACE) {
                KeyInput.SPACE = false;
            }
        });

    }

}
