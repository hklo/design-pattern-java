package com.training.lib.decorator.pizza;

import com.training.lib.Interface.IExecutor;

public class PizzaExecutor implements IExecutor {

    @Override
    public void run() {
        IPizza pizza = new Pizza();
        pizza.prepare();
        System.out.format("Normal Pizza=> RM: %s", pizza.getPrice());
        System.out.println();
        System.out.println();
        IPizza toppingPizza = new ToppingPizza(pizza, 2);
        toppingPizza.prepare();
        System.out.format("Topping Pizza=> RM: %s", toppingPizza.getPrice());
        System.out.println();
        System.out.println();

        IPizza CheeseToppingPizza = new CheesePizza(toppingPizza, 3);
        CheeseToppingPizza.prepare();

        System.out.format("Cheese Topping Pizza=> RM: %s", CheeseToppingPizza.getPrice());
        System.out.println();

    }
}
