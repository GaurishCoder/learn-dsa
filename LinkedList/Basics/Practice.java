package LinkedList.Basics;

public class Practice {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        // Node d = new Node(40);
        // Node e = new Node(15);

        head.next = b;
        b.next = c;
        // c.next = d;
        // d.next = e;

        Node newNode = new Node(40);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        displayList(head);
    }
}
