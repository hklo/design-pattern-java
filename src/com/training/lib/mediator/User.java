package com.training.lib.mediator;

public class User {
    private String name;
    private IChatServer server;

    public User(String name, IChatServer server) {
        this.name = name;
        this.server = server;
    }

    public String getName() {
        return name;
    }

    public void sendMsg(String receiver, String msg) {
        try {
            server.send(this, receiver, msg);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void receive(User sender, String msg) {
        System.out.println(String.format("[%s -> %s]: %s", sender.getName(), name, msg));
    }
}
