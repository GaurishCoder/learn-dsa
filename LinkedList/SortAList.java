package LinkedList;

public class SortAList {
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

    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node head1, Node head2) {
        Node merge = new Node(-1);
        Node temp = merge;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merge.next;
    }

    public static Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // finding middle node
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        // divide left and right
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(3);
        // Node d = new Node(1);
        head.next = a;
        a.next = b;
        b.next = c;
        // c.next = d;

        displayList(head);
        head = mergeSort(head);
        displayList(head);
    }
}
