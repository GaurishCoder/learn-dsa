package Strings.SlidingWindow;

import java.util.HashSet;

/**
 * LongestSubString
 */
public class LongestSubString {

    public static void findLongestSubstringNoRepeatingChar(String s) {
        int left = 0, right = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < s.length()) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        System.out.println("Longest Substring with no repeating character:"+maxLen);
    }

    public static void main(String[] args) {
        String s = "abcaabcbb";
        findLongestSubstringNoRepeatingChar(s);
    }
}