package com.training.lib.bridge.platform;

import com.training.lib.bridge.platform.Interface.IPlatform;

public class PMWindowPlatform implements IPlatform {
    @Override
    public void devDrawText() {
        System.out.println("PMWindowImp: devDrawText");
    }

    @Override
    public void devDrawLine() {
        System.out.println("PMWindowImp: devDrawLine");

    }
}
