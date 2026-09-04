package LinkedList;

public class RemoveDuplicates {
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

    public static Node removeDuplicatedFromSortedList(Node head) {
       Node curr = head;
        while (curr!=null && curr.next!=null) {
            if (curr.data==curr.next.data) {
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        displayList(head);
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;

        displayList(head);
        removeDuplicatedFromSortedList(head);

    }
}
