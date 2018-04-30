package com.training.lib.mediator;

public interface IChatServer {
    void send(User user, String receiver, String msg) throws Exception;
}
