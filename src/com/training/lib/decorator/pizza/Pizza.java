package com.training.lib.decorator.pizza;

public class Pizza implements IPizza {

    @Override
    public void prepare() {
        System.out.println("Preparing");
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
