package Homework6.MementoMediator;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

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
        this.server.sendMessage(this.name, newMessage);
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

    public Iterator getMessageByUserIterator(User userToSearchWith){
        return (Iterator) history.getMessageByUsIterator(userToSearchWith);
    }

    public Iterator iterator(User userToSearchWith){
        return (Iterator) history.iterator(this);

    }
}
