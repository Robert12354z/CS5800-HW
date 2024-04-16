package Homework6.MementoMediator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();
        User user1 = new User("Alice", server);
        User user2 = new User("Bob", server);
        User user3 = new User("Charlie", server);

        server.addUser(user1);
        server.addUser(user2);
        server.addUser(user3);

        ArrayList<String> receivers = new ArrayList<>();
        receivers.add("Bob");
        receivers.add("Charlie");

        user1.sendMessage(receivers, "Hello, Bob and Charlie!");

        server.blockUser("Charlie");

        user1.sendMessage(receivers, "Hello, Bob! Charlie can't see this message.");

        server.undoLastMessage("Alice");

        server.getHistoryOfUser("Alice");
    }
}
