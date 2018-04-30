package com.training.lib.command;

public class AddCommand implements ICommand {
    private Calculator caltulator;
    private int operand;

    public AddCommand(Calculator caltulator, int operand) {
        this.caltulator = caltulator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        caltulator.add(operand);
    }

    @Override
    public ICommand reverse() {
        return new AddCommand(caltulator, -operand);
    }

    @Override
    public String toString() {
        return String.format("[Add, %d]", operand);
    }
}
