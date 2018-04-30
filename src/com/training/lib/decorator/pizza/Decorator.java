package com.training.lib.decorator.pizza;

public abstract class Decorator implements IPizza {

    private IPizza pizza;
    private double prize;

    public Decorator(IPizza pizza, double prize) {
        this.pizza = pizza;
        this.prize = prize;
    }

    @Override
    public void prepare() {
        pizza.prepare();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + prize;
    }
}
