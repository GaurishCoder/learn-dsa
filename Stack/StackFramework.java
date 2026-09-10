package Stack;
import java.util.*;

public class StackFramework {
    
    public static void display(Stack<Integer> s) {
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        display(s);
    }
}
