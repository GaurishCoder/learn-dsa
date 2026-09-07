package LinkedList.DoublyLinkedList;

public class DoubleLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public void addEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void display() {
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // addFirst
    public void addFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    
    public void removeEnd() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

   

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addEnd(1);
        dll.addEnd(2);
        dll.addEnd(3);
        dll.display();
        dll.removeEnd();
        dll.display();
    }
}
