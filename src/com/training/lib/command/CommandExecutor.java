package com.training.lib.command;

import com.training.lib.Interface.IExecutor;

import java.util.List;
import java.util.Scanner;

public class CommandExecutor implements IExecutor {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        CalculatorManager manager = new CalculatorManager();
        int input, operand;
        do {
            printMenu();
            input = getInput(scanner);
            printOperand();
            operand = getInput(scanner);
            printResult(manager.run(operand, input));
            printLog(manager.getLog());
        } while (input != 0);
    }

    private void printMenu() {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Undo");
        System.out.println("4. Undo last N");
        System.out.println("5. Redo");
        System.out.println("6. Log");
        System.out.println("7. Quit");
        System.out.print("Input: ");
    }

    private void printOperand() {
        System.out.print("Enter value: ");
    }

    private int getInput(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception ex) {
            System.out.print("Please key in a valid value: ");
            return getInput(scanner);
        }
    }

    private void printResult(int result) {
        System.out.println("---------------------------------");
        System.out.println(String.format("Result: %d", result));
        System.out.println("---------------------------------");
    }

    private void printLog(List<ICommand> logs) {
        System.out.println("---------------------------------");
        logs.forEach((x) ->
                System.out.println(String.format("%s", x)));

        System.out.println("---------------------------------");
    }


}
