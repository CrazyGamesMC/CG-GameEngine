package de.cg.cgge.ctrl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    public static boolean KEY_A = false;
    public static boolean KEY_B = false;
    public static boolean KEY_C = false;
    public static boolean KEY_D = false;
    public static boolean KEY_E = false;
    public static boolean KEY_F = false;
    public static boolean KEY_G = false;
    public static boolean KEY_H = false;
    public static boolean KEY_I = false;
    public static boolean KEY_J = false;
    public static boolean KEY_K = false;
    public static boolean KEY_L = false;
    public static boolean KEY_M = false;
    public static boolean KEY_N = false;
    public static boolean KEY_O = false;
    public static boolean KEY_P = false;
    public static boolean KEY_Q = false;
    public static boolean KEY_R = false;
    public static boolean KEY_S = false;
    public static boolean KEY_T = false;
    public static boolean KEY_U = false;
    public static boolean KEY_V = false;
    public static boolean KEY_W = false;
    public static boolean KEY_X = false;
    public static boolean KEY_Y = false;
    public static boolean KEY_Z = false;
    public static boolean KEY_SPACE = false;
    public static boolean KEY_SHIFT = false;
    public static boolean KEY_ENTER = false;
    public static boolean KEY_NUM1 = false;
    public static boolean KEY_NUM2 = false;
    public static boolean KEY_NUM3 = false;
    public static boolean KEY_NUM4 = false;
    public static boolean KEY_NUM5 = false;
    public static boolean KEY_NUM6 = false;
    public static boolean KEY_NUM7 = false;
    public static boolean KEY_NUM8 = false;
    public static boolean KEY_NUM9 = false;
    public static boolean KEY_NUM0 = false;


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
           KEY_A = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_B) {
            KEY_B = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_C) {
            KEY_C = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            KEY_D = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_E) {
            KEY_E = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_F) {
            KEY_F = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_G) {
            KEY_G = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_H) {
            KEY_H = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_I) {
            KEY_I = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            KEY_J = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_K) {
            KEY_K = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_L) {
            KEY_L = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_M) {
            KEY_M = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_N) {
            KEY_N = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_O) {
            KEY_O = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_P) {
            KEY_P = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_Q) {
            KEY_Q = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_R) {
            KEY_R = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            KEY_S = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_T) {
            KEY_T = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_U) {
            KEY_U = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_V) {
            KEY_V = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            KEY_W = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_X) {
            KEY_X = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_Y) {
            KEY_Y = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_Z) {
            KEY_Z = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
            KEY_SHIFT = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            KEY_SPACE = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            KEY_ENTER = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_0) {
            KEY_NUM0 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_1) {
            KEY_NUM1 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            KEY_NUM2 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_3) {
            KEY_NUM3 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_4) {
            KEY_NUM4 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_5) {
            KEY_NUM5 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_6) {
            KEY_NUM6 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_7) {
            KEY_NUM7 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_8) {
            KEY_NUM8 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_9) {
            KEY_NUM9 = true;
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            KEY_A = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_B) {
            KEY_B = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_C) {
            KEY_C = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            KEY_D = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_E) {
            KEY_E = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F) {
            KEY_F = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_F) {
            KEY_G = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_H) {
            KEY_H = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_I) {
            KEY_I = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
            KEY_J = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_K) {
            KEY_K = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_L) {
            KEY_L = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_M) {
            KEY_M = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_N) {
            KEY_N = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_O) {
            KEY_O = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_P) {
            KEY_P = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_Q) {
            KEY_Q = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_R) {
            KEY_R = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            KEY_S = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_T) {
            KEY_T = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_U) {
            KEY_U = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_V) {
            KEY_V = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            KEY_W = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_X) {
            KEY_X = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_Y) {
            KEY_Y = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_Z) {
            KEY_Z = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
            KEY_SHIFT = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            KEY_SPACE = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            KEY_ENTER = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_0) {
            KEY_NUM0 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_1) {
            KEY_NUM1 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            KEY_NUM2 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_3) {
            KEY_NUM3 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_4) {
            KEY_NUM4 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_5) {
            KEY_NUM5 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_6) {
            KEY_NUM6 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_7) {
            KEY_NUM7 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_8) {
            KEY_NUM8 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_9) {
            KEY_NUM9 = false;
        }

    }
}
