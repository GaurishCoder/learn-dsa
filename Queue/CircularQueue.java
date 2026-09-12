package Queue;

/**
 * Circular Queue solved the problem of remove operation in array that takes
 * O(n) to O(1)
 */
public class CircularQueue {
    static int size;
    static int arr[];
    static int front = -1;
    static int rear = -1;

    CircularQueue(int size) {
        arr = new int[size];
        this.size = size;
    }

    // check queue is full
    public static boolean isFull() {
        return rear == size - 1 && rear == front;
    }

    // add
    public static void enque(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public static boolean isEmpty() {
        return rear == -1;
    }

    // remove
    public static int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int top = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return top;
    }

    public static int front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        enque(1);//
        enque(2);
        enque(3);

        // System.out.println(dequeue());
        // enque(4);
        // enque(5);

        while (!isEmpty()) {
            System.out.println(front());
            dequeue();
        }
    }
}