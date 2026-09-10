package Stack;

import java.util.Stack;

public class ReverseStack {
    
    public static void pushAtBottom(Stack<Integer> s,int data) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }


    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void display(Stack<Integer> s) {
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        // input -> 40 30 20 10
        // output -> 10 20 30 40
        System.out.println("Reverse Stack:");
        reverseStack(s);
        display(s);
    }
}
