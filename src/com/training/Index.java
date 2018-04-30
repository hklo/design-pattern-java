package com.training;

import com.training.lib.Interface.IExecutor;
import com.training.lib.command.CommandExecutor;
import com.training.lib.composite.FileExecutor;
import com.training.lib.mediator.MediatorExecutor;
import com.training.lib.state.StateExecutor;

public class Index {

    public static void main(String[] args) {
        run(new StateExecutor());
    }

    static void run(IExecutor ex) {
        ex.run();
    }

}
