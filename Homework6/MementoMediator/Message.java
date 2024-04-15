package Homework6.MementoMediator;


import java.util.Date;
import java.util.ArrayList;

public class Message {
    private String sender;
    private ArrayList<String> receivers;
    private String message;
    private Date timestamp;

    public Message(String sender, ArrayList<String> receivers, String message) {
        this.sender = sender;
        this.receivers = receivers;
        this.message = message;
        this.timestamp = new Date();
    }

    public String getSender() {
        return sender;
    }

    public ArrayList<String> getReceivers() {
        return receivers;
    }

    public String getMessage() {
        return message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String toString() {
        return "Sender: " + sender + "\nReceivers: " + receivers + "\nMessage: " + message + "\nTimestamp: " + timestamp;
    }
    

}
