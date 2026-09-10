package Stack;

import java.util.*;

public class ReverseString {

    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        StringBuilder ans = new StringBuilder("");
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            s.push(ch);
            i++;
        }

        while (!s.isEmpty()) {
            ans.append(s.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "abcd";
        String result = reverse(str);

        System.out.println("Reverse String using Stack:"+result);
    }
}
