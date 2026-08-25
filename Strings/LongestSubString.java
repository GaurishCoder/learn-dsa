package Strings;

import java.util.HashSet;

public class LongestSubString {

    public static void findLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0,left=0;

        for (int right = 0; right < s.length(); right++) {
            char charAtRight = s.charAt(right);
            while (set.contains(charAtRight)) {
                char charAtLeft = s.charAt(left);
                set.remove(charAtLeft);
                left++;
            }
            set.add(charAtRight);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println("Longest Substring is:"+maxLen);
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Original String:"+s);
        findLongestSubstring(s);
    }
}
