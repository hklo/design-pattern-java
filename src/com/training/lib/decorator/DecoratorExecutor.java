package com.training.lib.decorator;

import com.training.lib.Interface.IExecutor;

public class DecoratorExecutor implements IExecutor {

    @Override
    public void run() {
        IComponent normal = new ConcreteComponent();
        IComponent addedBehaviour = new ConcreteDecoratorA(normal);
        IComponent addedBehaviourAgain = new ConcreteDecoratorA(addedBehaviour);

        addedBehaviourAgain.operation();
    }
}
