package Strings.TwoPointer;

public class ValidPalindrome {

    public static void checkValidPalindromeAtOneDelete(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                boolean removeLeft = isPalindrome(s, left + 1, right);
                boolean removeRight = isPalindrome(s, left, right - 1);

                if (removeLeft || removeRight) {
                    System.out.println("Valid Palindrome is possible");
                } else {
                    System.out.println("Valid Palindrome is not possible");
                }

                return;
            }

            left++;
            right--;
        }

        System.out.println("Valid Palindrome is possible");
    }

    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abca";
        checkValidPalindromeAtOneDelete(s);
    }
}
