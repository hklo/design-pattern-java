package com.training.lib.decorator.pizza;

public class CheesePizza extends Decorator {
    public CheesePizza(IPizza pizza, double prize) {
        super(pizza, prize);
    }

    @Override
    public void prepare() {
        super.prepare();
        cheese();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    private void cheese() {
        System.out.println("Cheese");
    }
}
