package com.training.lib.bridge;

import com.training.lib.Interface.IExecutor;

public class BridgeExecutor implements IExecutor {

    @Override
    public void run() {
        new IconWindow().drawBorder();
        new TransientWindow().drawCloseBox();
    }
}
