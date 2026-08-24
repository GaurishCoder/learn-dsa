package Strings;

public class Basics {

    public static void main(String[] args) {
        String s = "programming";
        // System.out.println(s.length()); // length of string
        // System.out.println(s.charAt(0)); // character at any index in string
        char[] name = s.toCharArray();
        for (char c : name) {
            System.out.print(c+" ");
        }
    }
    
}
