package Strings.TwoPointer;

public class LongestPalindromicString {
    public static void findLongestPalindromicString(String s) {

        if (s == null || s.length() < 2) {
            System.out.println("Longest Palindromic String is: " + s);
            return;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int len1 = expandAroundCenter(s, i, i);

            // Even length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        System.out.println(
                "Longest Palindromic String is: " +
                        s.substring(start, end + 1));
    }

    public static int expandAroundCenter(String s, int left, int right) {

        while (left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        // We expanded one step too far
        return right - left - 1;
    }

    public static void main(String[] args) {
        String s = "cbbd";
        findLongestPalindromicString(s);
    }
}
