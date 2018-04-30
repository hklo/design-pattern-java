package com.training.lib.observer;

public class ConcreteSubject extends Subject {

    private String state;

    public ConcreteSubject(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        this.notifies();
    }
}
