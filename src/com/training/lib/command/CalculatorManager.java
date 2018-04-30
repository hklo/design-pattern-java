package com.training.lib.command;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CalculatorManager {
    private Calculator calculator;
    private Stack<ICommand> undos = new Stack<>();
    private List<ICommand> redos = new LinkedList<>();
    private List<ICommand> logs = new LinkedList<>();

    public CalculatorManager() {
        calculator = new Calculator();
    }

    public int run(int operand, int choice) {
        ICommand command = null;

        switch (choice) {
            case 1:
                command = new AddCommand(calculator, operand);
                undos.push(command.reverse());
                logs.add(command);
                break;
            case 2:
                command = new SubCommand(calculator, operand);
                undos.push(command.reverse());
                logs.add(command);
                break;
            case 3:
                command = undos.pop();
                break;
            default:
                break;
        }

        if (command != null) {
            command.execute();
        }

        return calculator.getResult();
    }

    public List<ICommand> getLog() {
        return logs;
    }
}
