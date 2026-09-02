package LinkedList;

public class DesignLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;

        void addFirst(int val){
            Node newNode = new Node(val);
            if (head==null) {
                head = newNode;
                tail = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
        }

        void addEnd(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int length(){
            int count=0;
            Node temp = head;
            while (temp!=null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

    }


    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addEnd(10);
        ll.addEnd(20);
        ll.addFirst(5);
        ll.display();
        System.out.println("length of linked list is:"+ll.length());
    }
}
