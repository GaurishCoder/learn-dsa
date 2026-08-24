package Strings;

public class Palindrome {

    public static void isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        boolean ans = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                ans = false;
                break;
            }
            left++;
            right--;
        }
        if (ans) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }
    }

    public static void main(String[] args) {
        String s = "madem";
        isPalindrome(s);
    }
}
