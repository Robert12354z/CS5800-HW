package Homework6.MementoMediator;

import java.util.HashMap;
import java.util.Map;

public class ChatServer {
    private Map<String, User> users;
    private Map<String, ChatHistory> chatHistories;

    public ChatServer(){
        this.users = new HashMap<>();
        this.chatHistories = new HashMap<>();
    }

    public void addUser(User user){
        this.users.put(user.getName(), user);
    }

    public void removeUser(User user){
        this.users.remove(user.getName());
    }

    public void sendMessage(Message message){
        for (String receiver : message.getReceivers()){
            if (users.containsKey(receiver)){
                users.get(receiver).receiveMessage(message);
            }
        }
    }

    public void block

}
