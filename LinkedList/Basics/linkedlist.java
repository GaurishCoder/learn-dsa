package LinkedList.Basics;

public class linkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
    }

    void insertAtBeginning(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(10);
        ll.display();
        ll.insertAtBeginning(20);
        ll.display();
        ll.insertAtEnd(1);
        ll.display();
    }
}
