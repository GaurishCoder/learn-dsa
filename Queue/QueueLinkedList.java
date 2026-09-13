package Queue;

public class QueueLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public static boolean isEmpty() {
        return head == null;
    }

    // add
    public static void enque(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // remove
    public static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.data;
        if (head == tail) {
            head = tail = null;
        } else { 
            head = head.next;
        }
        return front;
    }

    // peek
    public static int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {

        enque(1);
        enque(2);
        enque(3);

        while (!isEmpty()) {
            System.out.println(front());
            dequeue();
        }
    }
}
