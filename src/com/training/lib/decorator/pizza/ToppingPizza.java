package com.training.lib.decorator.pizza;

public class ToppingPizza extends Decorator {
    public ToppingPizza(IPizza pizza, double prize) {
        super(pizza, prize);
    }

    @Override
    public void prepare() {
        super.prepare();
        topping();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    private void topping() {
        System.out.println("Topping");
    }
}
