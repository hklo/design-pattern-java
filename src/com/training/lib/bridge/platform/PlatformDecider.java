package com.training.lib.bridge.platform;

import com.training.lib.bridge.platform.Interface.IPlatform;

public class PlatformDecider {
    private static PlatformDecider _instance;

    private PlatformDecider() {

    }

    public static PlatformDecider getInstance() {
        if (_instance == null) {
            _instance = new PlatformDecider();
        }
        return _instance;
    }

    public IPlatform getWindow() {
        return new PMWindowPlatform();
    }
}
