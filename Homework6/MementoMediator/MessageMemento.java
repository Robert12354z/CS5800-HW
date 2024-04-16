package Homework6.MementoMediator;

public class MessageMemento {
    private String message;
    private long timeStamp;

    public MessageMemento(String message, long timeStamp){
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public String getMessage(){
        return this.message;
    }

    public long getTimeStamp(){
        return this.timeStamp;
    }
    
}
