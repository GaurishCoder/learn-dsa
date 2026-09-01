package LinkedList.SlowFastPointer;

public class NthNodeFromEnd {
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

    public static void findNthNodeFromEnd(Node head,int n) {
        Node slow=head;
        Node fast=head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("Nth Node from end is:"+slow.data);
    }
   

    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = c;
        
        displayList(head);
        findNthNodeFromEnd(head, 2);
    }
}
