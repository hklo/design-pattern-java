package com.training.lib.decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(IComponent component) {
        super(component);
    }

    @Override
    public void operation() {
        addedBehaviour();
        super.Operation();
        addedBehaviour();
    }

    private void addedBehaviour() {
        System.out.println("AddedBehaviour");
    }
}
