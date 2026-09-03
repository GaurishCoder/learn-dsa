package LinkedList;

public class MergeList {

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

    public static Node mergeSortedLists(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        Node p1 = list1;
        Node p2 = list2;

        while (p1 != null && p2 != null) {
            if (list1.data < list2.data) {
                tail.next = p1;
                p1 = p1.next;
            } else {
                tail.next = p2;
                p2 = p2.next;
            }
            tail = tail.next;
        }

        if (p1 != null) {
            tail.next = p1;
        } else {
            tail.next = p2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);

        displayList(head);
    }
}
