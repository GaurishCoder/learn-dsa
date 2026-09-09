package LinkedList.CircularLinkedList;

public class SinglyCircularList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node head = null;
    public static Node tail = null;

    public static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
      
         System.out.print("Circular Linked List Elements : ");

        Node itr = head;
        do {
            System.out.print(itr.data + " ");
            itr = itr.next;
        } while (itr != head);
        System.out.println();
    }

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);

        printList();
    }
}
