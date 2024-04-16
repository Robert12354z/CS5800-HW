package Homework6.MementoMediator;

import java.util.ArrayList;

public class User {
    private String name;
    private ChatServer server;
    private ChatHistory history;
    private Message latestMessage;

    public User(String name, ChatServer server) {
        this.name = name;
        this.server = server;
        this.history = new ChatHistory();
        this.latestMessage = null;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(ArrayList<String> receivers, String message) {
        Message newMessage = new Message(this.name, receivers, message);
        this.server.sendMessage(this.name, newMessage); // Pass the name of the sender along with the message
        this.latestMessage = newMessage;
        history.addMessage(newMessage);
    }

    public void receiveMessage(Message message) {
        this.latestMessage = message;
        history.addMessage(message);
    }

    public void undoLast(){
        if (latestMessage != null){
            history.removeLastMessage();
            latestMessage = null;
        }
    }

    public void getHistory(){
        history.printHistory();
    }

}
