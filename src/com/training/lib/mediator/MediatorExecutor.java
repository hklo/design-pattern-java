package com.training.lib.mediator;

import com.training.lib.Interface.IExecutor;

public class MediatorExecutor implements IExecutor {

    @Override
    public void run() {
        ChatServer server = new ChatServer();

        User u1 = server.Register("Ali");
        User u2 = server.Register("Abu");
        server.blockSender("Ali");

        u1.sendMsg("Abu", "haha");
        u2.sendMsg("Ali", "Hello");
    }
}
