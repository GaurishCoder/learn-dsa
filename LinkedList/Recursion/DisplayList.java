package LinkedList.Recursion;

public class DisplayList {
    
    // Node Creation
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayListRecursive(Node head) {
       //base case
       if(head==null) return;
       //recusion work
       displayListRecursive(head.next);
       //self work
       System.out.print(head.data+" ");
    }

     public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayListRecursive(a);
    }
}
