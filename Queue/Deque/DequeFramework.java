package Queue.Deque;
import java.util.*;


/**
 * Deque
 *  Double Ended Queue.
 *  It has two ways operation of insertion and deletion.
 *  Queue that performs remove first and remove last as well as add first and add last
 */

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
