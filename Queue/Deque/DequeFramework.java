package Queue.Deque;
import java.util.*;

public class DequeFramework {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addLast(4);
        

        System.out.println(dq);
    }    
}
