package com.training.lib.singleton;

import com.training.lib.Interface.IExecutor;

public class SingletonExecutor implements IExecutor {

    @Override
    public void run() {
        Settings.getInstance().printCount();
        Settings.getInstance().printCount();
        Settings.getInstance().printCount();
        Settings.getInstance().printCount();
        Settings.getInstance().printCount();
    }
}
