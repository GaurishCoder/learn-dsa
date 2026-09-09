package Stack;

public class StackLinkedList {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node head = null;

    //isEmpty
    public static boolean isEmpty() {
        return head == null;
    }

    //push
    public static void push(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //pop
    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    //peek
    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

      public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        display();

        System.out.println(isEmpty());
    }
}
