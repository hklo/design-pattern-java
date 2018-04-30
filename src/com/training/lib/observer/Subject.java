package com.training.lib.observer;

import com.training.lib.observer.Interface.IObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<IObserver> _observers = new ArrayList<>();

    public void attach(IObserver ob) {
        _observers.add(ob);
    }

    public void detach(IObserver ob) {
        _observers.remove(ob);
    }

    public void notifies() {
        for (IObserver a : _observers) {
            a.update();
        }
    }
}
