package com.training.lib.observer;

import com.training.lib.observer.Interface.IObserver;

public class ConcreteObserver implements IObserver {
    ConcreteSubject cs;

    public ConcreteObserver(ConcreteSubject cs) {
        this.cs = cs;
        this.cs.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Updating");
        System.out.println(cs.getState().toUpperCase());
        System.out.println();
    }
}
