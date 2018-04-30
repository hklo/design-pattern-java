package com.training.lib.bridge;

public class IconWindow extends Window {
    private static IconWindow _instance;

    public void drawBorder() {
        System.out.println("Start: Drawing Border");
        drawRect();
        drawText();
        System.out.println("End: Drawing Border");
    }

}
