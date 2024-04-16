package Homework6.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Homework6.MementoMediator.*;


public class ChatTest {

    @Test
    public void testMessage() {
        
        ArrayList <String> receivers = new ArrayList<>();
        receivers.add("Bob");
        
        Message message = new Message("Alice", receivers, "Hello Bob!");
        assertEquals("Alice", message.getSender());
        assertEquals("Bob", message.getReceivers().get(0));
        assertEquals("Hello Bob!", message.getMessage());
    }

    @Test
    public void testChatHistory() {
        ChatHistory chatHistory = new ChatHistory();
        ArrayList <String> receivers = new ArrayList<>();
        receivers.add("Bob");
        Message message = new Message("Alice", receivers, "Hello Bob!");
        chatHistory.addMessage(message);
        chatHistory.getLastMessage();
        chatHistory.removeLastMessage();
        chatHistory.getLastMessage();
        
        chatHistory.getLastMessage();
    }

    @Test
    public void testUser() {
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

    @Test
    public void testChatServer() {
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

    @Test
    public void testBlockUser() {
        ChatServer server = new ChatServer();
        User user1 = new User("Alice", server);
        User user2 = new User("Bob", server);
        User user3 = new User("Charlie", server);

        server.addUser(user1);
        server.addUser(user2);
        server.addUser(user3);

        server.blockUser("Charlie");
    }

    @Test
    public void testUndoLastMessage() {
        ChatServer server = new ChatServer();
        User user = new User("Alice", server);
        ArrayList<String> receivers = new ArrayList<>();
        receivers.add("Bob");
        server.addUser(user);
        server.undoLastMessage("Alice");

    }
}
