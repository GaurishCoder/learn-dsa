package Queue;

/**
 * Queue is linear data structure
 * Follows "First In First Out" Principle
 * 
 * It contains two pointer Front and Rear
 * Front - first element in queue
 * Rear - last element in queue
 * 
 * Implementation of Queue
 * 1. Array
 * 2. LinkedList
 * 3. Stack
 * 
 * Operation in Queue
 * 1. enque - add element in queue
 * 2. dequeue - remove element in queue
 * 3. front - returns first element in queue
 * 
 */
public class QueueArray {
    static int arr[];
    static int size;
    static int rear = -1;

    QueueArray(int size) {
        arr = new int[size];
        this.size = size;
       
    }

    // add
    public static void enque(int data) {
        if (rear == size - 1) {
            System.out.println("queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    // isEmpty
    public static boolean isEmpty() {
        return rear == -1;
    }

    // remove
    public static int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    // peek
    public static int front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(2);
        enque(1);
        enque(2);
        enque(3);

        while (!isEmpty()) {
            System.out.println(front());
            dequeue();
        }
    }
}
