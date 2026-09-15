package Queue;

import java.util.*;

public class QueueCollectionFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> aq = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        //ArrayDeque method
        aq.offer(10);
        aq.poll(); // retrieve and remove head of the queue
        aq.peek();

        System.out.println(q);
    }
}
