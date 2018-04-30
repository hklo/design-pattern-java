package com.training.lib.command;

public class SubCommand implements ICommand {
    private Calculator caltulator;
    private int operand;

    public SubCommand(Calculator caltulator, int operand) {
        this.caltulator = caltulator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        caltulator.sub(operand);
    }

    @Override
    public ICommand reverse() {
        return new SubCommand(caltulator, -operand);
    }

    @Override
    public String toString() {
        return String.format("[Sub, %d]", operand);
    }
}
