package com.training.lib.decorator;

public abstract class Decorator implements IComponent {
    private IComponent component;

    public Decorator(IComponent component) {
        this.component = component;
    }

    public void Operation() {
        component.operation();
    }
}
