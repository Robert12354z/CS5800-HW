package Homework6.MementoMediator;

import java.util.Iterator;
import java.util.ArrayList;

public class searchMessagesByUser implements Iterator<Message>{
    private ArrayList<Message> messages;
    private User user;
    private int index;

    public searchMessagesByUser(ArrayList<Message> messages, User user){
        this.messages = messages;
        this.user = user;
        this.index = 0;
    }


    @Override
    public boolean hasNext() {
        while (index < messages.size()){
            if (messages.get(index).getSender().equals(user.getName()) || messages.get(index).getReceivers().contains(user.getName())){
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Message next() {
        while (index < messages.size()){
            if (messages.get(index).getSender().equals(user.getName()) || messages.get(index).getReceivers().contains(user.getName())){
                return messages.get(index++);
            }
            index++;
        }
        return null;
    }
    
}
