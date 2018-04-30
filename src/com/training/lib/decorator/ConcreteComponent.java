package com.training.lib.decorator;

public class ConcreteComponent implements IComponent {
    @Override
    public void operation() {
        System.out.println("Operation");
    }
}
