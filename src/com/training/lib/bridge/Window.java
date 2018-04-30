package com.training.lib.bridge;

import com.training.lib.bridge.platform.Interface.IPlatform;
import com.training.lib.bridge.platform.PlatformDecider;

public abstract class Window {

    private IPlatform _window;

    public Window(IPlatform window) {
        _window = window;
    }

    public Window() {
        _window = PlatformDecider.getInstance().getWindow();
    }

    void drawText() {
        _window.devDrawText();
    }

    void drawRect() {
        _window.devDrawLine();
        _window.devDrawLine();
        _window.devDrawLine();
        _window.devDrawLine();
    }
}
