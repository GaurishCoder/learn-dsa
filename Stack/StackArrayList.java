package Stack;

import java.util.ArrayList;

/**
 * Stack is a linear data structure
 * It follows Last In First Out Principle
 * 
 * Stack is implemented by two ways:
 *  1. ArrayList
 *  2. LinkedList
 * 
 * Note: We don't use Array because it has fixed size
 * 
 * Operation in stack:
 *  push - add data at top
 *  pop - remove data from top
 *  isEmpty - check whether stack is empty
 *  peek - return top element from stack
*/



public class StackArrayList {
    static ArrayList<Integer> list = new ArrayList<>();

    // isEmpty
    public static boolean isEmpty() {
        return list.size() == 0;
    }

    // push
    public static void push(int data) {
        list.add(data);
    }

    // pop
    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    // peek
    public static int peek() {
        return list.get(list.size() - 1);
    }

    public static void display() {
        while (!isEmpty()) {
            int data = pop();
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        display();

        System.out.println(isEmpty());
    }
}
