package com.training.lib.command;

public interface ICommand {
    void execute();

    ICommand reverse();
}
