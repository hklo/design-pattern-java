package com.training.lib.mediator;

import java.util.LinkedList;
import java.util.List;

public class ChatServer implements IChatServer {
    private List<User> users = new LinkedList<>();
    private List<String> blackList = new LinkedList<>();

    public User Register(String name) {
        User user = new User(name, this);
        users.add(user);
        return user;
    }

    public void blockSender(String name) {
        blackList.add(name);
    }

    @Override
    public void send(User sender, String receiverName, String msg) throws Exception {
        if (!blackList.stream().anyMatch(x -> x.equals(sender.getName()))) {
            User receiver = users.stream().filter(x -> x.getName().equals(receiverName)).findFirst().orElse(null);
            if (receiver != null) {
                receiver.receive(sender, msg);
            }
        } else {
            throw new Exception(String.format("%s been blocked", sender.getName()));
        }

    }
}
