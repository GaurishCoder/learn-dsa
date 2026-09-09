package LinkedList.DoublyLinkedList;

public class RemoveNode {
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

    public static void addEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void removeAtPosition(int pos) {
        Node temp = head;
        for (int i = 0; i < pos-1; i++) {
            temp=temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    
    public static void main(String[] args) {
        addEnd(10);
        addEnd(20);
        addEnd(30);
        addEnd(40);
        addEnd(50);
        display();

        removeAtPosition(2);
        display();
    }
}
