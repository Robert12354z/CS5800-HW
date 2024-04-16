package Homework6.MementoMediator;
import java.util.Iterator;
public class IterableByUser {

    public interface UserIterable {
        Iterator iterator (User userToSearchWith);
    }
    
}
