package Controller;

import Model.MainGame;
import Model.Point;
import View.GameWindow;


import java.awt.*;


public class Main {
    public static void main(String[] args) {

        Point game=new Point();

        GameWindow gameWindow=new GameWindow();
        gameWindow.init();
        MainGame.start();
        // game.checkField(win.getX(),win.getY(),win.getButText());
    }
}