package com.training.lib.observer;

import com.training.lib.Interface.IExecutor;

public class ObserverExecutor implements IExecutor {

    @Override
    public void run() {
        ConcreteSubject cs = new ConcreteSubject("hello");
        ConcreteObserver co = new ConcreteObserver(cs);
        cs.setState("hahaha");
        cs.setState("hahaha123");
    }
}
