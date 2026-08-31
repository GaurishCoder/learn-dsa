package LinkedList.Basics;

public class InsertAtBeginning {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insertAtHead(Node head) {
        Node newNode = new Node(5);
        newNode.next = head;
        head = newNode;
        return head;
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

        head.next = b;
        b.next = c;

        head = insertAtHead(head);
        displayList(head);
    }
}
