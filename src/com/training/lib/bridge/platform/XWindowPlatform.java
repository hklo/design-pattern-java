package com.training.lib.bridge.platform;

import com.training.lib.bridge.platform.Interface.IPlatform;

public class XWindowPlatform implements IPlatform {
    @Override
    public void devDrawText() {
        System.out.println("XWindowImp: devDrawText");
    }

    @Override
    public void devDrawLine() {
        System.out.println("XWindowImp: devDrawLine");
    }
}
