package LinkedList.DoublyLinkedList;

public class ReverseDLL {
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

    public static void createDoublyList(int startVal, int endVal) {
        for (int i = startVal; i <= endVal; i++) {
            addEnd(i);
        }
    }

    public static void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        addEnd(10);
        addEnd(20);
        addEnd(30);
        addEnd(40);
        display();
        System.out.println("Reverse Doubly Linked List:");
        reverse();
        display();
    }
}
