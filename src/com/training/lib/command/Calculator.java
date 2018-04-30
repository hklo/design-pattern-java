package com.training.lib.command;

public class Calculator {
    private int result = 0;

    public void add(int operand) {
        result += operand;
    }

    public void sub(int operand) {
        result -= operand;
    }

    public int getResult() {
        return result;
    }
}
