package com.training.lib.state;

import com.training.lib.Interface.IExecutor;

public class StateExecutor implements IExecutor {
    @Override
    public void run() {
        Bulb b = new Bulb();

        for (int i = 0; i < 10; i++) {
            b.touch();
            System.out.println(b.getState().getClass());
        }

    }
}
