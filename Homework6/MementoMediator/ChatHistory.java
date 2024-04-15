package Homework6.MementoMediator;

import java.util.ArrayList;

public class ChatHistory {
    private ArrayList<Message> chatHistory;
    
    public ChatHistory(){
        this.chatHistory = new ArrayList<>();
    }

    public void addMessage(Message message){
        this.chatHistory.add(message);
    }

    public void removeLastMessage(){
        if (this.chatHistory.size() > 0){
            this.chatHistory.remove(this.chatHistory.size() - 1);
        }
    }

    public void printHistory(){
        for (Message message : this.chatHistory){
            System.out.println(message.getSender() + " sent a message to " + message.getReceivers() + " at " + 
            message.getTimestamp() + " with the following content: " + message.getMessage());
        }
    }
}
