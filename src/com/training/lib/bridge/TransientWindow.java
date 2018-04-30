package com.training.lib.bridge;

public class TransientWindow extends Window {

    public void drawCloseBox() {
        System.out.println("Start: Drawing Close Box");
        drawRect();
        System.out.println("End: Drawing Close Box");
    }
}
