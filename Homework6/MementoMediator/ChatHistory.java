package Homework6.MementoMediator;

import java.util.ArrayList;
import java.util.Iterator;

public class ChatHistory implements IterableByUser.UserIterable{
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

    public void getLastMessage (){
        if (this.chatHistory.size() > 0){
            System.out.println(this.chatHistory.get(this.chatHistory.size() - 1).getSender() + " sent a message to " + 
            this.chatHistory.get(this.chatHistory.size() - 1).getReceivers() + " at " + 
            this.chatHistory.get(this.chatHistory.size() - 1).getTimestamp() + " with the following content: " + 
            this.chatHistory.get(this.chatHistory.size() - 1).getMessage());
        }
    }

    public void printHistory(){
        for (Message message : this.chatHistory){
            System.out.println(message.getSender() + " sent a message to " + message.getReceivers() + " at " + 
            message.getTimestamp() + " with the following content: " + message.getMessage());
        }
    }

    public void clearHistory(){
        this.chatHistory.clear();
    }

    public Iterator getMessageByUsIterator(User userToSearchWith){
        return new searchMessagesByUser(this.chatHistory, userToSearchWith);
    }

    @Override
    public Iterator iterator(User userToSearchWith) {
        return new searchMessagesByUser(this.chatHistory, userToSearchWith);
    }
}
